package specified.impl;

import specified.BindUri;
import specified.F;

/**
 * A.3.10 Bag functions These functions operate on a bag of ‘type’ values, where type is one of the primitive
 * data-types, and x.x is a version of XACML where the function has been defined. Some additional conditions defined for
 * each function below SHALL cause the expression to evaluate to "Indeterminate".
 */
public enum BagOp implements F {

  /**
   * This function SHALL take a bag of ‘type’ values as an argument and SHALL return a value of ‘type’. It SHALL return
   * the only value in the bag. If the bag does not have one and only one value, then the expression SHALL evaluate to
   * "Indeterminate".
   */
  @BindUri("urn:oasis:names:tc:xacml:1.0:function:type-one-and-only")
  type_one_and_only,
  /**
   * This function SHALL take a bag of ‘type’ values as an argument and SHALL return an
   * “http://www.w3.org/2001/XMLSchema#integer” indicating the number of values in the bag.
   */
  @BindUri("urn:oasis:names:tc:xacml:x.x:function:type-bag-size")
  type_bag_size,
  /**
   * This function SHALL take an argument of ‘type’ as the first argument and a bag of ‘type’ values as the second
   * argument and SHALL return an “http://www.w3.org/2001/XMLSchema#boolean”. The function SHALL evaluate to "True" if
   * and only if the first argument matches by the "urn:oasis:names:tc:xacml:x.x:function:type-equal" any value in the
   * bag. Otherwise, it SHALL return “False”.
   */
  @BindUri("urn:oasis:names:tc:xacml:x.x:function:type-is-in")
  type_is_in,
  /**
   * This function SHALL take any number of arguments of ‘type’ and return a bag of ‘type’ values containing the values
   * of the arguments. An application of this function to zero arguments SHALL produce an empty bag of the specified
   * data-type.
   */
  @BindUri("urn:oasis:names:tc:xacml:x.x:function:type-bag")
  type_bag, ;
}
