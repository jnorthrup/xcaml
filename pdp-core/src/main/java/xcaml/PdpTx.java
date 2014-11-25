package xcaml;

import oasis.names.tc.xacml._3_0.core.schema.wd_17.PolicySetType;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.model.dataformat.JaxbDataFormat;

/**
 * Created by jim on 11/21/14.
 */
public class PdpTx {

  public PdpTx(String in, String out, String... args) throws Exception {

    DefaultCamelContext context = new DefaultCamelContext();
    final String inUri1 = in;
    final String outUri1 = out;
    try {
      ProducerTemplate template = context.createProducerTemplate();
      context.addRoutes(new RouteBuilder() {
        private String inUri = inUri1;
        private String outUri = outUri1;

        public void configure() throws Exception {
          JaxbDataFormat jaxb = new JaxbDataFormat(true) {
            {
              setContextPath(PolicySetType.class.getPackage().getName());
            }
          };
          from(inUri).
          // unmarshal(jaxb).
              log("ping!").to((outUri1));
        }
      });
      context.start();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
