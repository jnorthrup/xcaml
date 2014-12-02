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
import specified.XacmlFunction;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;

public class PolicyTest extends CamelTestSupport {

    public static final String MOCK_POLICY_SOURCE = "mock:policy_source";
    private static final String MOCK_REQUEST_SOURCE = "mock:request_source";
    ;
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

        Map<Object, AttributeType> theMap = new TreeMap<>();

        RequestType body = mockRequestSource.assertExchangeReceived(0).getIn().getBody(RequestType.class);
        body.getAttributes().stream().forEach(attributesType -> {
            String category = attributesType.getCategory();

            attributesType.getAttribute().forEach(attributeType -> {
                String attributeId = attributeType.getAttributeId();

                String x = category + ":" + attributeId;
                theMap.put(x, attributeType);
            });
        });

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
            TargetType target = rule.getTarget();
            ArrayList<Boolean> resolutions = new ArrayList<Boolean>();
            target.getAnyOf().forEach(anyOfType -> anyOfType.getAllOf().forEach(allOfType -> allOfType.getMatch().forEach(action -> {
                String matchId = action.getMatchId();
                XacmlFunction func = XacmlFunction.from(matchId);

                assert func.returns == XacmlDataType.http$3A$2F$2Fwww$2Ew3$2Eorg$2F2001$2FXMLSchema$23__boolean : "we only support predicate operation in this test";

                System.err.println("eval match: " + matchId);
                AttributeDesignatorType attributeDesignator = action.getAttributeDesignator();

                if (null != attributeDesignator) {
                    String k = attributeDesignator.getCategory() + ":" + attributeDesignator.getAttributeId();
                    AttributeType reqAtt = theMap.get(k);
                    if (null != reqAtt) {

                        AtomicInteger c = new AtomicInteger(0);
                        List<Object> send = new ArrayList<Object>();

                        action.getAttributeValue().getContent().forEach(o1 -> {
                            c.getAndIncrement();
                            if (o1 instanceof String) {
                                o1 = String.valueOf(o1).trim();
                            }
                            send.add(o1);
                        });
                        reqAtt.getAttributeValue().forEach(attributeValueType -> {

                            attributeValueType.getContent().forEach(v -> {

                                XacmlDataType parm = func.parms[c.get()];
                                XacmlDataType from = XacmlDataType.from(attributeValueType.getDataType());
                                assert from == parm : "paramter type mismatch";

                                {
                                    if (v instanceof String) {
                                        v = String.valueOf(v).trim();
                                    }
                                    send.add(v);
                                    c.getAndIncrement();
                                }
                            });
                        });
                        Object[] p = send.toArray();
                        boolean predicate = func.predicate(p);
                        resolutions.add(predicate);
                    }
                } else {
                    AttributeSelectorType attributeSelector = action.getAttributeSelector();
                    if (null != attributeSelector) {
                        String category = attributeSelector.getCategory();
                        String contextSelectorId1 = attributeSelector.getContextSelectorId();


                        System.err.println("eval cat: " + category);
                    }
                }
            })));
        });

        TargetType target = policy.getTarget();

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
