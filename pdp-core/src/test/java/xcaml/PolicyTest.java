package xcaml;

import com.google.common.io.Resources;
import oasis.names.tc.xacml._3_0.core.schema.wd_17.ObjectFactory;
import oasis.names.tc.xacml._3_0.core.schema.wd_17.PolicyType;
import oasis.names.tc.xacml._3_0.core.schema.wd_17.RequestType;
import org.apache.camel.EndpointInject;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.model.dataformat.JaxbDataFormat;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Test;
import specified.XacmlCombiningAlgorithm;

import java.io.InputStream;

public class PolicyTest extends CamelTestSupport {

  public static final String MOCK_MARSHALL = "mock:marshall";
  public static final String MOCK_POLICY_SOURCE = "mock:policy_source";
  private static final String MOCK_REQUEST_SOURCE = "mock:request_source";;
  public static final String POLICY_UNMARSHALL = "direct:policy_unmarshall";
  public static final String REQUEST_UNMARSHALL = "direct:request_unmarshall";
  @EndpointInject(uri = MOCK_MARSHALL)
  private MockEndpoint mockMarshall;

  @EndpointInject(uri = MOCK_POLICY_SOURCE)
  private MockEndpoint mockPolicySource;

  @EndpointInject(uri = MOCK_REQUEST_SOURCE)
  private MockEndpoint mockRequestSource;

  @Test
  public void testPolicy1() throws Exception {
    mockPolicySource.expectedMessageCount(1);

    try (InputStream body = Resources.getResource("policy1.xml").openStream()) {
      template.sendBody(POLICY_UNMARSHALL, body);
    }
    PolicyType policyType =
        mockPolicySource.assertExchangeReceived(0).getIn().getBody(PolicyType.class);

    mockRequestSource.expectedMessageCount(1);
    try (InputStream body = Resources.getResource("request1.xml").openStream()) {
      template.sendBody(REQUEST_UNMARSHALL, body);
    }

    RequestType requestType =
        mockRequestSource.assertExchangeReceived(0).getIn().getBody(RequestType.class);
    class Evaluator {

      XacmlCombiningAlgorithm combiningAlgorithm = XacmlCombiningAlgorithm.from(policyType
          .getRuleCombiningAlgId());

    }
  }

  @Override
  protected RouteBuilder createRouteBuilder() throws Exception {
    return new RouteBuilder() {
      @Override
      public void configure() throws Exception {
        JaxbDataFormat jaxbDataFormat = new JaxbDataFormat() {
          {
            setContextPath(ObjectFactory.class.getPackage().getName());
            setFragment(Boolean.TRUE);
            setPartClass(PolicyType.class.getCanonicalName());
          }
        };

        from(POLICY_UNMARSHALL).unmarshal(jaxbDataFormat).to(mockPolicySource);

        from(REQUEST_UNMARSHALL).unmarshal(jaxbDataFormat).to(mockRequestSource);

      }
    };
  }
}
