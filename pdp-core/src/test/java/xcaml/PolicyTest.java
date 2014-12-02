package xcaml;

import com.google.common.io.Resources;
import oasis.names.tc.xacml._3_0.core.schema.wd_17.*;
import org.apache.camel.EndpointInject;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.model.dataformat.JaxbDataFormat;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Test;
import specified.XacmlCombiningAlgorithm;
import specified.XacmlDataType;

import java.io.InputStream;
import java.util.List;
import java.util.stream.Collectors;

public class PolicyTest extends CamelTestSupport {

  public static final String MOCK_POLICY_SOURCE = "mock:policy_source";
  private static final String MOCK_REQUEST_SOURCE = "mock:request_source";;
  public static final String POLICY_UNMARSHALL = "direct:policy_unmarshall";
  public static final String REQUEST_UNMARSHALL = "direct:request_unmarshall";

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
        PolicyType policy =
                mockPolicySource.assertExchangeReceived(0).getIn().getBody(PolicyType.class);

        mockRequestSource.expectedMessageCount(1);
        try (InputStream body = Resources.getResource("request1.xml").openStream()) {
            template.sendBody(REQUEST_UNMARSHALL, body);
        }


        //parse policy
        String ruleCombiningAlgId = policy.getRuleCombiningAlgId();
        XacmlCombiningAlgorithm combiningAlgorithm = XacmlCombiningAlgorithm.from(ruleCombiningAlgId);
        System.err.println("combnie using " + ruleCombiningAlgId);
        String policyId = policy.getPolicyId();
        policy.getCombinerParametersOrRuleCombinerParametersOrVariableDefinition().stream().forEach(o -> {
            System.err.println("resolving: " + o.toString());
            if (!(o instanceof RuleType)) {
                throw new UnsupportedOperationException();
            }
            RuleType rule = (RuleType) o;
            System.err.println("eval Rule: " + rule.getRuleId());
            rule.getTarget().getAnyOf().stream()
                    .forEach(anyOfType -> anyOfType.getAllOf().stream()
                            .forEach(a -> a.getMatch().stream()
                                    .forEach(m -> {
                                        String matchId = m.getMatchId();
                                        System.err.println("eval match: " + matchId);
                                        AttributeDesignatorType attributeDesignator = m.getAttributeDesignator();
                                        AttributeValueType attributeValue = m.getAttributeValue();
                                        String dataType1 = attributeValue.getDataType();
                                        System.err.println("att type: " + XacmlDataType.from(dataType1));
                                        List<Object> content = attributeValue.getContent();
                                        System.err.println("att value: " + content.stream().map(String::valueOf).map(String::trim).collect(Collectors.joining(", ")));

                                        if (null != attributeDesignator) {
                                            String attId = attributeDesignator.getAttributeId();
                                            String category1 = attributeDesignator.getCategory();
                                            XacmlAttributeTriple xacmlAttributeTriple = XacmlAttributeTriple.create(category1, attId, XacmlDataType.from(attributeDesignator.getDataType()));
                                            System.err.println("policy triple: " + xacmlAttributeTriple);
                                        } else {
                                            AttributeSelectorType attributeSelector = m.getAttributeSelector();
                                            if (null != attributeSelector) {
                                                String category = attributeSelector.getCategory();
                                                System.err.println("eval cat: " + category);
                                                String contextSelectorId = attributeSelector.getContextSelectorId();
                                            }

                                        }


                                    })));
        });

        TargetType target = policy.getTarget();

        RequestType body = mockRequestSource.assertExchangeReceived(0).getIn().getBody(RequestType.class);
        body.getAttributes().stream().forEach(attributesType -> {
            String category = attributesType.getCategory();

            attributesType.getAttribute().forEach(attributeType -> {
                String attributeId = attributeType.getAttributeId();
                attributeType.getAttributeValue().forEach(attributeValueType -> {
                    String dataType = attributeValueType.getDataType();
                    XacmlAttributeTriple xacmlAttributeTriple = XacmlAttributeTriple.create(category, attributeId, XacmlDataType.from(dataType));
                    System.err.println("request triple:"+xacmlAttributeTriple.toString());
                });

            });
        });
      //todo: Pair<XacmlFunction,XacmlAttributeTriple> on {Policy,Request} XacmlAttributeTriple intersection
      //todo: CombinerAlgorithm pass
      //todo: Allow
    }

  @Override
  protected RouteBuilder createRouteBuilder() throws Exception {
    return new RouteBuilder() {
      @Override
      public void configure() throws Exception {
        JaxbDataFormat jaxbDataFormat = new JaxbDataFormat() {
          {
            setContextPath(ObjectFactory.class.getPackage().getName());
            // setFragment(Boolean.TRUE);
            // setPartClass(PolicyType.class.getCanonicalName());
          }
        };

        from(POLICY_UNMARSHALL).unmarshal(jaxbDataFormat).to(mockPolicySource);
        from(REQUEST_UNMARSHALL).unmarshal(jaxbDataFormat).to(mockRequestSource);

      }
    };
  }
}
