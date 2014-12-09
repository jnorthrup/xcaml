package specified.impl;

import specified.F;
import specified.XacmlFunction;

/**
 * A.3.6 Numeric comparison functions These functions form a minimal set for comparing two numbers, yielding a Boolean
 * result. For doubles they SHALL comply with the rules governed by IEEE 754 [IEEE754].
 */
public enum NumericComparison implements F {
  /**

     */
  integer_greater_than("urn:oasis:names:tc:xacml:1.0:function:integer-greater-than"),
  /**

     */
  integer_greater_than_or_equal(
      "urn:oasis:names:tc:xacml:1.0:function:integer-greater-than-or-equal"),
  /**

     */
  integer_less_than("urn:oasis:names:tc:xacml:1.0:function:integer-less-than"),
  /**

     */
  integer_less_than_or_equal("urn:oasis:names:tc:xacml:1.0:function:integer-less-than-or-equal"),
  /**

     */
  double_greater_than("urn:oasis:names:tc:xacml:1.0:function:double-greater-than"),
  /**

     */
  double_greater_than_or_equal("urn:oasis:names:tc:xacml:1.0:function:double-greater-than-or-equal"),
  /**

     */
  double_less_than("urn:oasis:names:tc:xacml:1.0:function:double-less-than"),
  /**





     */
  double_less_than_or_equal("urn:oasis:names:tc:xacml:1.0:function:double-less-than-or-equal"), ;
  private final XacmlFunction xacmlFunction;

  NumericComparison(String s) {
    this.xacmlFunction = XacmlFunction.from(s);
  }
}
