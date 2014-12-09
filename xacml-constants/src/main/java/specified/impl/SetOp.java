package specified.impl;

import specified.F;
import specified.XacmlFunction;

/**
 * A.3.11 Set functions These functions operate on bags mimicking sets by eliminating duplicate elements from a bag.
 */
public enum SetOp implements F {
  /**
   * This function SHALL take two arguments that are both a bag of ‘type’ values. It SHALL return a bag of ‘type’ values
   * such that it contains only elements that are common between the two bags, which is determined by
   * "urn:oasis:names:tc:xacml:x.x:function:type-equal". No duplicates, as determined by
   * "urn:oasis:names:tc:xacml:x.x:function:type-equal", SHALL exist in the result.
   */
  type_intersection("urn:oasis:names:tc:xacml:x.x:function:type-intersection"),
  /**
   * This function SHALL take two arguments that are both a bag of ‘type’ values. It SHALL return a
   * “http://www.w3.org/2001/XMLSchema#boolean”. The function SHALL evaluate to "True" if and only if at least one
   * element of the first argument is contained in the second argument as determined by
   * "urn:oasis:names:tc:xacml:x.x:function:type-is-in".
   */
  type_at_least_one_member_of("urn:oasis:names:tc:xacml:x.x:function:type-at-least-one-member-of"),
  /**
   * This function SHALL take two or more arguments that are both a bag of ‘type’ values. The expression SHALL return a
   * bag of ‘type’ such that it contains all elements of all the argument bags. No duplicates, as determined by
   * "urn:oasis:names:tc:xacml:x.x:function:type-equal", SHALL exist in the result.
   */
  type_union("urn:oasis:names:tc:xacml:x.x:function:type-union"),
  /**
   * This function SHALL take two arguments that are both a bag of ‘type’ values. It SHALL return a
   * “http://www.w3.org/2001/XMLSchema#boolean”. It SHALL return "True" if and only if the first argument is a subset of
   * the second argument. Each argument SHALL be considered to have had its duplicates removed, as determined by
   * "urn:oasis:names:tc:xacml:x.x:function:type-equal", before the subset calculation.
   */
  type_subset("urn:oasis:names:tc:xacml:x.x:function:type-subset"),
  /**
   * This function SHALL take two arguments that are both a bag of ‘type’ values. It SHALL return a
   * “http://www.w3.org/2001/XMLSchema#boolean”. It SHALL return the result of applying
   * "urn:oasis:names:tc:xacml:1.0:function:and" to the application of
   * "urn:oasis:names:tc:xacml:x.x:function:type-subset" to the first and second arguments and the application of
   * "urn:oasis:names:tc:xacml:x.x:function:type-subset" to the second and first arguments.
   */
  type_set_equals("urn:oasis:names:tc:xacml:x.x:function:type-set-equals"), ;

  SetOp(String s) {
    this.xacmlFunction = XacmlFunction.from(s);
  }

  private final XacmlFunction xacmlFunction;
}
