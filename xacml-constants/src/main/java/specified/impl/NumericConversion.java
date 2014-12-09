package specified.impl;

import specified.BindUri;

/**
 * The following functions convert between the data-type “http://www.w3.org/2001/XMLSchema#integer” and”
 * http://www.w3.org/2001/XMLSchema#double” primitive types.
 */
public enum NumericConversion implements specified.F {
  /*
   * This function SHALL take one argument of data-type “http://www.w3.org/2001/XMLSchema#double” and SHALL truncate its
   * numeric value to a whole number and return an element of data-type “http://www.w3.org/2001/XMLSchema#integer”.
   */@BindUri("urn:oasis:names:tc:xacml:1.0:function:double-to-integer")
  double_to_integer,

  /*
   * This function SHALL take one argument of data-type “http://www.w3.org/2001/XMLSchema#integer” and SHALL promote its
   * value to an element of data-type “http://www.w3.org/2001/XMLSchema#double” with the same numeric value. If the
   * integer argument is outside the range which can be represented by a double, the result SHALL be Indeterminate, with
   * the status code “urn:oasis:names:tc:xacml:1.0:status:processing-error”.
   */@BindUri("urn:oasis:names:tc:xacml:1.0:function:integer-to-double")
  integer_to_double, ;

}
