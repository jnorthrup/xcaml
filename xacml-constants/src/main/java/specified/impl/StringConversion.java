package specified.impl;

import specified.BindUri;

/**
 * The following functions convert between values of the data-type “http://www.w3.org/2001/XMLSchema#string” primitive
 * types.
 */
public enum StringConversion implements specified.F {

  /**
   * This function SHALL take one argument of data-type “http://www.w3.org/2001/XMLSchema#string” and SHALL normalize
   * the value by stripping off all leading and trailing white space characters. The whitespace characters are defined
   * in the metasymbol S (Production 3) of [XML].
   */
  @BindUri("urn:oasis:names:tc:xacml:1.0:function:string-normalize-space")
  string_normalize_space,

  /**
   * This function SHALL take one argument of data-type “http://www.w3.org/2001/XMLSchema#string” and SHALL normalize
   * the value by converting each upper case character to its lower case equivalent. Case mapping shall be done as
   * specified for the fn:lower-case function in [XF] with no tailoring for particular languages or environments.
   */
  @BindUri("urn:oasis:names:tc:xacml:1.0:function:string-normalize-to-lower-case")
  string_normalize_to_lower_case;

}
