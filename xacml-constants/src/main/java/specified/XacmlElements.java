package specified;

import java.net.URLDecoder;
import java.util.LinkedHashMap;
import java.util.Map;

import static java.util.Arrays.asList;

public enum XacmlElements {
  xacml$3AAdvice,
  xacml$3AAdviceExpression,
  xacml$3AAdviceExpressions,
  xacml$3AAllOf,
  xacml$3AAnyOf,
  xacml$3AApply,
  xacml$3AAssociatedAdvice,
  xacml$3AAttribute,
  xacml$3AAttributeAssignment,
  xacml$3AAttributeAssignmentExpression,
  xacml$3AAttributeDesignator,
  xacml$3AAttributes,
  xacml$3AAttributeSelector,
  xacml$3AAttributesReference,
  xacml$3AAttributeValue,
  xacml$3ACombinerParameter,
  xacml$3ACombinerParameters,
  xacml$3ACondition,
  xacml$3AContent,
  xacml$3ADecision,
  xacml$3ADescription,
  xacml$3AExpression,
  xacml$3AFunction,
  xacml$3AMatch,
  xacml$3AMissingAttributeDetail,
  xacml$3AMultiRequests,
  xacml$3AObligation,
  xacml$3AObligationExpression,
  xacml$3AObligationExpressions,
  xacml$3AObligations,
  xacml$3APolicy,
  xacml$3APolicyCombinerParameters,
  xacml$3APolicyDefaults,
  xacml$3APolicyIdentifierList,
  xacml$3APolicyIdReference,
  xacml$3APolicyIssuer,
  xacml$3APolicySet,
  xacml$3APolicySetDefaults,
  xacml$3APolicySetIdReference,
  xacml$3ARequest,
  xacml$3ARequestDefaults,
  xacml$3ARequestReference,
  xacml$3AResponse,
  xacml$3AResult,
  xacml$3ARule,
  xacml$3ARuleCombinerParameters,
  xacml$3AStatus,
  xacml$3AStatusCode,
  xacml$3AStatusDetail,
  xacml$3AStatusMessage,
  xacml$3ATarget,
  xacml$3AVariableDefinition,
  xacml$3AVariableReference,
  xacml$3AXPathVersion,;

  public final String token = URLDecoder.decode(name().replace("_","").replace('$', '%'));

  public static class Registry {
    public static final Map<String, Enum> tokens = new LinkedHashMap<>();

    static {
      asList(values()).stream().forEach(f->tokens.put(f.token,f));
    }
  }

}

