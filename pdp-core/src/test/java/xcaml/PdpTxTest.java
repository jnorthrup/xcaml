package xcaml;

import com.google.common.io.Files;
import oasis.names.tc.xacml._3_0.core.schema.wd_17.ObjectFactory;
import oasis.names.tc.xacml._3_0.core.schema.wd_17.PolicyType;
import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.main.Main;
import org.apache.camel.management.DefaultManagementStrategy;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.apache.camel.processor.interceptor.Tracer;
import org.junit.Test;

import java.util.EventObject;

public class PdpTxTest {

  @Test
  public void testLoadPolicy1() throws Exception {
    Main main = new Main();
    main.enableHangupSupport();
    main.addRouteBuilder(new RouteBuilder() {
      /**
       * Let's configure the Camel routing rules using Java code...
       */
      public void configure() {
        Tracer tracer = new Tracer();
        String uri = Files.createTempDir().getAbsolutePath();
        System.err.println("endpoint: "+uri);
        org.apache.camel.model.dataformat.JaxbDataFormat jaxb= new org.apache.camel.model.dataformat.JaxbDataFormat(){{
          setContextPath(ObjectFactory.class.getPackage().getName());
          setFragment(Boolean.TRUE);
          setPartClass(PolicyType.class.getCanonicalName());
        }};
       getContext().setTracing(true);
        getContext().getProperties().put(Exchange.LOG_DEBUG_BODY_STREAMS, String.valueOf(true));

        getContext().addInterceptStrategy(tracer);
        getContext().setManagementStrategy(new DefaultManagementStrategy(){
          @Override
          public void notify(EventObject event) throws Exception {
            System.err.println("ping!");
          }

          {}});
        from("file:src/test/resources?noop=true")
            .unmarshal(jaxb).marshal().json(JsonLibrary.Gson)
            .to("file:" + uri);

      }
    });
    main.run();
  }
}