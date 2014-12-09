package specified.impl;

import specified.BindUri;

/**
 * A.3.16 Other functions
 */
public enum Other implements specified.F {
  /**
   * This function SHALL take an “http://www.w3.org/2001/XMLSchema#anyURI” and an
   * "http://www.w3.org/2001/XMLSchema#string" as arguments. The first argument SHALL be interpreted as an attribute
   * category. The second argument SHALL be interpreted as the XML content of an <Attributes> element with Category
   * equal to the first argument. The function evaluates to an "http://www.w3.org/2001/XMLSchema#boolean". This function
   * SHALL return "True" if and only if the policy evaluation described below returns the value of "Permit".
   * <p>
   * The following evaluation is described as if the context is actually instantiated, but it is only required that an
   * equivalent result be obtained.
   * <p>
   * The function SHALL construct a new context, by copying all the information from the current context, omitting any
   * <Attributes> element with Category equal to the first argument. The second function argument SHALL be added to the
   * context as the content of an <Attributes> element with Category equal to the first argument.
   * <p>
   * The function SHALL invoke a complete policy evaluation using the newly constructed context. This evaluation SHALL
   * be completely isolated from the evaluation which invoked the function, but shall use all current policies and
   * combining algorithms, including any per request policies.
   * <p>
   * The PDP SHALL detect any loop which may occur if successive evaluations invoke this function by counting the number
   * of total invocations of any instance of this function during any single initial invocation of the PDP. If the total
   * number of invocations exceeds the bound for such invocations, the initial invocation of this function evaluates to
   * Indeterminate with a “urn:oasis:names:tc:xacml:1.0:status:processing-error” status code. Also, see the security
   * considerations in section 9.1.8.
   */
  @BindUri("urn:oasis:names:tc:xacml:3.0:function:access-permitted")
  access_permitted, ;

}
