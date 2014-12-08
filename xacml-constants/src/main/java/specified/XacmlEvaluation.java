package specified;

import com.google.common.collect.EnumBiMap;
import oasis.names.tc.xacml._3_0.core.schema.wd_17.DecisionType;
import oasis.names.tc.xacml._3_0.core.schema.wd_17.EffectType;

/**
 * Created by jim on 11/20/14.
 */
public enum XacmlEvaluation {
  Permit, Indeterminate$7B__P__$7D, Indeterminate, Indeterminate$7B__D__$7D, Deny, Indeterminate$7B__DP__$7D, NotApplicable;

  XacmlEvaluation() {
    try {
      Mapping.effectTypeXacmlEvaluationEnumBiMap.put(EffectType.fromValue(name()), this);
    } catch (Throwable e) {
    }
    try {
      Mapping.decisionTypeXacmlEvaluationEnumBiMap.put(DecisionType.fromValue(name()), this);
    } catch (Throwable e) {
    }
  }

  static public XacmlEvaluation from(String key) {
    return Xacml3.from(key, XacmlEvaluation.class);
  }

  public String token() {
    return Xacml3.token(this);
  }

  public static class Mapping {
    public static EnumBiMap<DecisionType, XacmlEvaluation> decisionTypeXacmlEvaluationEnumBiMap =
        EnumBiMap.create(DecisionType.class, XacmlEvaluation.class);
    public static EnumBiMap<EffectType, XacmlEvaluation> effectTypeXacmlEvaluationEnumBiMap =
        EnumBiMap.create(EffectType.class, XacmlEvaluation.class);
  }

  public static XacmlEvaluation from(DecisionType decisionType) {
    return Mapping.decisionTypeXacmlEvaluationEnumBiMap.get(decisionType);
  }

  public static XacmlEvaluation from(EffectType effectType) {
    return Mapping.effectTypeXacmlEvaluationEnumBiMap.get(effectType);
  }
}
