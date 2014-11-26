package specified;

public enum XacmlElements {
  xacml$3A__Advice, xacml$3A__AdviceExpression, xacml$3A__AdviceExpressions, xacml$3A__AllOf, xacml$3A__AnyOf, xacml$3A__Apply, xacml$3A__AssociatedAdvice, xacml$3A__Attribute, xacml$3A__AttributeAssignment, xacml$3A__AttributeAssignmentExpression, xacml$3A__AttributeDesignator, xacml$3A__Attributes, xacml$3A__AttributeSelector, xacml$3A__AttributesReference, xacml$3A__AttributeValue, xacml$3A__CombinerParameter, xacml$3A__CombinerParameters, xacml$3A__Condition, xacml$3A__Content, xacml$3A__Decision, xacml$3A__Description, xacml$3A__Expression, xacml$3A__Function, xacml$3A__Match, xacml$3A__MissingAttributeDetail, xacml$3A__MultiRequests, xacml$3A__Obligation, xacml$3A__ObligationExpression, xacml$3A__ObligationExpressions, xacml$3A__Obligations, xacml$3A__Policy, xacml$3A__PolicyCombinerParameters, xacml$3A__PolicyDefaults, xacml$3A__PolicyIdentifierList, xacml$3A__PolicyIdReference, xacml$3A__PolicyIssuer, xacml$3A__PolicySet, xacml$3A__PolicySetDefaults, xacml$3A__PolicySetIdReference, xacml$3A__Request, xacml$3A__RequestDefaults, xacml$3A__RequestReference, xacml$3A__Response, xacml$3A__Result, xacml$3A__Rule, xacml$3A__RuleCombinerParameters, xacml$3A__Status, xacml$3A__StatusCode, xacml$3A__StatusDetail, xacml$3A__StatusMessage, xacml$3A__Target, xacml$3A__VariableDefinition, xacml$3A__VariableReference, xacml$3A__XPathVersion, ;

  static public XacmlElements from(String key) {
    return Xacml3.from(key, XacmlElements.class);

  }

  public String token() {
    return Xacml3.token(this);
  }
}
