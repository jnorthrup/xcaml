package xcaml.pdp;

import com.google.auto.factory.AutoFactory;
import com.google.auto.factory.Provided;
import com.google.auto.value.AutoValue;
import com.google.common.collect.*;
import oasis.names.tc.xacml._3_0.core.schema.wd_17.*;
import specified.*;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by jim on 11/21/14.
 */
@AutoFactory
public class PdpTx {
  @AutoValue
  abstract static class Tuple {
    abstract RuleType ruleType();

    abstract MatchType matchType();

    abstract AttributeDesignatorType attributeDesignatorType();

    static Tuple tuple(RuleType ruleType, MatchType matchType,
        AttributeDesignatorType attributeDesignatorType) {
      return new AutoValue_PdpTx_Tuple(ruleType, matchType, attributeDesignatorType);
    }
  }

  private static PolicyType policy;
  final Multimap<List<String>, Tuple> policyIndex = ArrayListMultimap.create();

  public PdpTx( @Provided PolicyType policy) {
        PdpTx.policy = policy;
        assert policy.getTarget().getAnyOf().isEmpty() : "top level target not yet implemented"; //todo: impl
        policy.getCombinerParametersOrRuleCombinerParametersOrVariableDefinition().stream().forEach(o -> {
            System.err.println("resolving: " + o.toString());
            assert o instanceof RuleType : "only ruletype implemented";

            RuleType rule = (RuleType) o;
            System.err.println("eval Rule: " + rule.getRuleId());
            TargetType target1 = rule.getTarget();

            target1.getAnyOf().forEach(anyOfType -> anyOfType.getAllOf().forEach(allOfType -> allOfType.getMatch().forEach(action -> {
                String matchId = action.getMatchId();
                XacmlFunctionProto func = XacmlFunctionProto.from(matchId);
                assert func.returns == XacmlDataType.from("http://www.w3.org/2001/XMLSchema#boolean") : "we only support predicate operation in this test";//todo: impl
                System.err.println("eval match: " + matchId);
                AttributeDesignatorType attributeDesignator = action.getAttributeDesignator();
                if (attributeDesignator != null) {
                    String category = attributeDesignator.getCategory();
                    String attributeId = attributeDesignator.getAttributeId();
                    List<String> key = Arrays.asList(category, attributeId);

                    policyIndex.put(key, Tuple.tuple(rule, action, attributeDesignator));
                }
            })));
        });
    }

  /**
   * <ul>
   * todo:
   * <li>need a global singleton "direct:" endpoint per policy</li>
   * <li>need a per-tx "direct:" inbound endpoint per request</li>
   * <li>need a 2nd per-tx "direct:" outbound endpoint per request for the CombiningAlgorithm</li>
   * <li>pipe the combining algorithm into the inner loop as an endpoint</li>
   * <li>when the combining algorithm decides to exit early, end the resolver endpoints early and fire the combiner
   * endpoint</li>
   * </ul>
   * 
   * @param requestBody
   * @return algorithm specific resolution
   */
  public XacmlEvaluation evaluatePolicyAndRequest(RequestType requestBody) {
        Map<List<String>, AttributeType> reqIndex = new TreeMap<>();
        Multiset<XacmlEvaluation> resolutionBag= HashMultiset.create();
        requestBody.getAttributes().stream().forEach(attributesType -> {
            String category = attributesType.getCategory();
            attributesType.getAttribute().forEach(reqAtt -> {
                String attributeId = reqAtt.getAttributeId();
                List<String> key = Arrays.asList(category, attributeId);
                policyIndex.get(key).forEach(matchTypeAttributeDesignatorTypePair -> {
                    XacmlEvaluation eff = XacmlEvaluation.NotApplicable;

                    AtomicInteger c = new AtomicInteger(0);
                    List<Object> send = new ArrayList<>();
                    MatchType action = matchTypeAttributeDesignatorTypePair.matchType();
                    action.getAttributeValue().getContent().forEach(o1 -> {
                        c.getAndIncrement();
                        if (o1 instanceof String) {
                            o1 = String.valueOf(o1).trim();
                        }
                        send.add(o1);
                    });
                    matchTypeAttributeDesignatorTypePair.attributeDesignatorType();
                    XacmlFunctionProto func = XacmlFunctionProto.from(action.getMatchId());
                    reqAtt.getAttributeValue().forEach(attributeValueType -> {

                        attributeValueType.getContent().forEach(v -> {

                            XacmlDataType parm = func.parms[c.get()];
                            XacmlDataType from = XacmlDataType.from(attributeValueType.getDataType());
                            assert from == parm : "parameter type mismatch";

                            if (v instanceof String) {
                                v = String.valueOf(v).trim();
                            }
                            send.add(v);
                            c.getAndIncrement();

                        });
                    });

                    RuleType rule = matchTypeAttributeDesignatorTypePair.ruleType();
                    Object[] p = send.toArray();
                    eff = func.predicate(p) ? XacmlEvaluation.from(rule.getEffect()) : eff;
                    resolutionBag.add(eff);
                });
            });
        });

        String ruleCombiningAlgId = policy.getRuleCombiningAlgId();
        System.err.println("combine using " + ruleCombiningAlgId);
        String policyId = policy.getPolicyId();

        XacmlCombiningAlgorithm combiningAlgorithm = XacmlCombiningAlgorithm.from(ruleCombiningAlgId);

        return combiningAlgorithm.apply((XacmlEvaluation[]) resolutionBag.toArray(new XacmlEvaluation[resolutionBag.size()]));
    }
}
