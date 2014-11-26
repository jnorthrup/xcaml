package specified;

/**
 * The following XML attributes have values that are URIs. These may be extended by the creation of new URIs associated
 * with new semantics for these attributes.
 */
public enum XacmlExtensibilityPoints {
  Category, AttributeId, DataType, FunctionId, MatchId, ObligationId, AdviceId, PolicyCombiningAlgId, RuleCombiningAlgId, StatusCode, SubjectCategory;

  static public XacmlExtensibilityPoints from(String key) {
    return Xacml3.from(key, XacmlExtensibilityPoints.class);
  }

  public String token() {
    return Xacml3.token(this);
  }
}
