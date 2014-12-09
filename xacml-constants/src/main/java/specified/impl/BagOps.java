package specified.impl;

import specified.XacmlFunction;

/**
 * A.3.10 Bag functions
 * These functions operate on a bag of ‘type’ values, where type is one of the primitive data-types, and x.x is a version of XACML where the function has been defined.    Some additional conditions defined for each function below SHALL cause the expression to evaluate to "Indeterminate".
 */
public enum BagOps{

/**
 This function SHALL take a bag of ‘type’ values as an argument and SHALL return a value of ‘type’.  It SHALL return the only value in the bag.  If the bag does not have one and only one value, then the expression SHALL evaluate to "Indeterminate".

 */
        type_one_and_only("urn:oasis:names:tc:xacml:x.x:function:type-one-and-only"),
/**
 This function SHALL take a bag of ‘type’ values as an argument and SHALL return an “http://www.w3.org/2001/XMLSchema#integer” indicating the number of values in the bag.

 */
        type_bag_size("urn:oasis:names:tc:xacml:x.x:function:type-bag-size"),
/**
 This function SHALL take an argument of ‘type’ as the first argument and a bag of ‘type’ values as the second argument and SHALL return an “http://www.w3.org/2001/XMLSchema#boolean”.  The function SHALL evaluate to "True" if and only if the first argument matches by the "urn:oasis:names:tc:xacml:x.x:function:type-equal" any value in the bag.  Otherwise, it SHALL return “False”.

 */
        type_is_in("urn:oasis:names:tc:xacml:x.x:function:type-is-in"),
/**
 This function SHALL take any number of arguments of ‘type’ and return a bag of ‘type’ values containing the values of the arguments.  An application of this function to zero arguments SHALL produce an empty bag of the specified data-type.

 A.3.11 Set functions
 These functions operate on bags mimicking sets by eliminating duplicate elements from a bag.
 */
        type_bag("urn:oasis:names:tc:xacml:x.x:function:type-bag"),
/**
 This function SHALL take two arguments that are both a bag of ‘type’ values.  It SHALL return a bag of ‘type’ values such that it contains only elements that are common between the two bags, which is determined by "urn:oasis:names:tc:xacml:x.x:function:type-equal".  No duplicates, as determined by "urn:oasis:names:tc:xacml:x.x:function:type-equal", SHALL exist in the result.

 */
        type_intersection("urn:oasis:names:tc:xacml:x.x:function:type-intersection"),
/**
 This function SHALL take two arguments that are both a bag of ‘type’ values.  It SHALL return a “http://www.w3.org/2001/XMLSchema#boolean”.  The function SHALL evaluate to "True" if and only if at least one element of the first argument is contained in the second argument as determined by "urn:oasis:names:tc:xacml:x.x:function:type-is-in".

 */
        type_at_least_one_member_of("urn:oasis:names:tc:xacml:x.x:function:type-at-least-one-member-of"),
/**
 This function SHALL take two or more arguments that are both a bag of ‘type’ values.  The expression SHALL return a bag of ‘type’ such that it contains all elements of all the argument bags.  No duplicates, as determined by "urn:oasis:names:tc:xacml:x.x:function:type-equal", SHALL exist in the result.

 */
        type_union("urn:oasis:names:tc:xacml:x.x:function:type-union"),
/**
 This function SHALL take two arguments that are both a bag of ‘type’ values.  It SHALL return a “http://www.w3.org/2001/XMLSchema#boolean”.  It SHALL return "True" if and only if the first argument is a subset of the second argument.  Each argument SHALL be considered to have had its duplicates removed, as determined by "urn:oasis:names:tc:xacml:x.x:function:type-equal", before the subset calculation.

 */
        type_subset("urn:oasis:names:tc:xacml:x.x:function:type-subset"),
/**
 This function SHALL take two arguments that are both a bag of ‘type’ values.  It SHALL return a “http://www.w3.org/2001/XMLSchema#boolean”.  It SHALL return the result of applying "urn:oasis:names:tc:xacml:1.0:function:and" to the application of "urn:oasis:names:tc:xacml:x.x:function:type-subset" to the first and second arguments and the application of "urn:oasis:names:tc:xacml:x.x:function:type-subset" to the second and first arguments.

 */
        type_set_equals("urn:oasis:names:tc:xacml:x.x:function:type-set-equals"),;

    BagOps(String s) {
        this.xacmlFunction = XacmlFunction.from(s);
    }

    private final XacmlFunction xacmlFunction;
}
