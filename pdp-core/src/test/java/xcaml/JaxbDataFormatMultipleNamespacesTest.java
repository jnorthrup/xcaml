package xcaml;

import com.google.common.io.Resources;
import oasis.names.tc.xacml._3_0.core.schema.wd_17.ObjectFactory;
import oasis.names.tc.xacml._3_0.core.schema.wd_17.PolicyType;
import oasis.names.tc.xacml._3_0.core.schema.wd_17.TargetType;
import org.apache.camel.EndpointInject;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.model.dataformat.JaxbDataFormat;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Test;

import java.io.InputStream;

public class JaxbDataFormatMultipleNamespacesTest extends CamelTestSupport {

  public static final String MOCK_MARSHALL = "mock:marshall";
  public static final String MOCK_UNMARSHALL = "mock:unmarshall";
  public static final String DIRECT_MARSHALL = "direct:marshall";
  public static final String DIRECT_POLICY_UNMARSHALL = "direct:policy_unmarshall";
  @EndpointInject(uri = MOCK_MARSHALL)
  private MockEndpoint mockMarshall;

  @EndpointInject(uri = MOCK_UNMARSHALL)
  private MockEndpoint mockUnmarshall;

  @Test
  public void testUnarshallMultipleNamespaces() throws Exception {
    mockUnmarshall.expectedMessageCount(1);

    try (InputStream body = Resources.getResource("policy1.xml").openStream()) {
      template.sendBody(DIRECT_POLICY_UNMARSHALL, body);
    }
    assertMockEndpointsSatisfied();

    PolicyType policyType = (PolicyType) mockUnmarshall.getExchanges().get(0).getIn().getBody();
    TargetType target = policyType.getTarget();
    assertEquals("Medi Corp access control policy", policyType.getDescription().trim());
    assertEquals("urn:oasis:names:tc:xacml:3.0:example:SimplePolicy1", policyType.getPolicyId());
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

        from(DIRECT_POLICY_UNMARSHALL).unmarshal(jaxbDataFormat).to(MOCK_UNMARSHALL);
      }
    };
  }
}
