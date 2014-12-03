package specified;

/**
 * Created by jim on 11/20/14.
 */
public enum XacmlEvaluation {
  Permit, Indeterminate$7B__P__$7D, Indeterminate, Indeterminate$7B__D__$7D, Deny, Indeterminate$7B__DP__$7D, NotApplicable;
  static public XacmlEvaluation from(String key) {
    return Xacml3.from(key, XacmlEvaluation.class);
  }

  public String token() {
    return Xacml3.token(this);
  }

  public static XacmlEvaluation from(oasis.names.tc.xacml._3_0.core.schema.wd_17.EffectType effect) {
    return from(effect.value());
  }
}
