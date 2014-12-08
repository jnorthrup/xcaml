package xcaml;

import com.google.common.io.Resources;
import oasis.names.tc.xacml._3_0.core.schema.wd_17.ObjectFactory;
import oasis.names.tc.xacml._3_0.core.schema.wd_17.PolicyType;
import oasis.names.tc.xacml._3_0.core.schema.wd_17.RequestType;
import org.apache.camel.Endpoint;
import org.apache.camel.EndpointInject;
import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.model.dataformat.JaxbDataFormat;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Test;
import specified.XacmlEvaluation;

import java.io.InputStream;

public class PolicyTest extends CamelTestSupport {

  public static final String MOCK_POLICY_SOURCE = "mock:policy_source";
  private static final String MOCK_REQUEST_SOURCE = "mock:request_source";;
  private static final String MOCK_RESOLUTION_SOURCE = "mock:resolution_source";;

  public static final String POLICY_UNMARSHALL = "direct:policy_unmarshall";
  public static final String REQUEST_UNMARSHALL = "direct:request_unmarshall";
  public static final String RESOLUTION_SINK = "direct:resolution_sink";

  @EndpointInject(uri = MOCK_POLICY_SOURCE)
  private Endpoint mockPolicySource;

  @EndpointInject(uri = MOCK_REQUEST_SOURCE)
  private Endpoint mockRequestSource;

  @EndpointInject(uri = MOCK_RESOLUTION_SOURCE)
  private Endpoint mockResolutionSource;

  @Test
  public void testPolicy1() throws Exception {

    ((MockEndpoint) mockPolicySource).expectedMessageCount(1);

    try (InputStream body = Resources.getResource("policy1.xml").openStream()) {
      template.sendBody(POLICY_UNMARSHALL, body);
    }
    Exchange policyExchange = ((MockEndpoint) mockPolicySource).assertExchangeReceived(0);
    PolicyType policy = policyExchange.getIn().getBody(PolicyType.class);

    ((MockEndpoint) mockRequestSource).expectedMessageCount(1);
    try (InputStream body = Resources.getResource("request1.xml").openStream()) {
      template.sendBody(REQUEST_UNMARSHALL, body);
    }
    RequestType requestBody;
    Exchange requestExchange = ((MockEndpoint) mockRequestSource).assertExchangeReceived(0);
    requestBody = requestExchange.getIn().getBody(RequestType.class);
    XacmlEvaluation resolution = new PdpTx(policy).evaluatePolicyAndRequest(requestBody);
    System.err.println("insert resolution endpoint here: " + resolution);
    // template.sendBody(RESOLUTION_SINK, resolution);

  }

  @Override
  protected RouteBuilder createRouteBuilder() throws Exception {
    return new RouteBuilder() {
      @Override
      public void configure() throws Exception {
        JaxbDataFormat jaxbDataFormat = new JaxbDataFormat() {
          {
            setContextPath(ObjectFactory.class.getPackage().getName());
          }
        };
        from(POLICY_UNMARSHALL).unmarshal(jaxbDataFormat).to(mockPolicySource);
        from(REQUEST_UNMARSHALL).unmarshal(jaxbDataFormat).to(mockRequestSource);
        // from(RESOLUTION_SINK).bean(XacmlEvaluation.class).to(mockResolutionSource);
      }
    };
  }
}
