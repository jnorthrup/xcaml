package specified.impl;

import specified.XacmlFunction;

/**
 * A.3.12 Higher-order bag functions
 * This section describes functions in XACML that perform operations on bags such that functions may be applied to the bags in general.
 */
public enum HigherOrderBagOps {
    /**
     * This function applies a Boolean function between specific primitive values and a bag of values, and SHALL return "True" if and only if the predicate is "True" for at least one element of the bag.
     * <p>
     * This function SHALL take n+1 arguments, where n is one or greater. The first argument SHALL be an <Function> element that names a Boolean function that takes n arguments of primitive types.  Under the remaining n arguments, n-1 parameters SHALL be values of primitive data-types and one SHALL be a bag of a primitive data-type.  The expression SHALL be evaluated as if the function named in the <Function> argument were applied to the n-1 non-bag arguments and each element of the bag argument and the results are combined with “urn:oasis:names:tc:xacml:1.0:function:or”.
     * <p>
     * For example, the following expression SHALL return "True":
     * <p>
     * <Apply FunctionId=”urn:oasis:names:tc:xacml:3.0:function:any-of”>
     * <Function FunctionId=”urn:oasis:names:tc:xacml:1.0:function:string-equal”/>
     * <AttributeValue DataType=”http://www.w3.org/2001/XMLSchema#string”>Paul</AttributeValue>
     * <Apply FunctionId=”urn:oasis:names:tc:xacml:1.0:function:string-bag”>
     * <AttributeValue DataType=”http://www.w3.org/2001/XMLSchema#string”>John</AttributeValue>
     * <AttributeValue DataType=”http://www.w3.org/2001/XMLSchema#string”>Paul</AttributeValue>
     * <AttributeValue DataType=”http://www.w3.org/2001/XMLSchema#string”>George</AttributeValue>
     * <AttributeValue DataType=”http://www.w3.org/2001/XMLSchema#string”>Ringo</AttributeValue>
     * </Apply>
     * </Apply>
     * This expression is "True" because the first argument is equal to at least one of the elements of the bag, according to the function.
     */
    any_of("urn:oasis:names:tc:xacml:3.0:function:any-of"),
    /**
     * This function applies a Boolean function between a specific primitive value and a bag of values, and returns "True" if and only if the predicate is "True" for every element of the bag.
     * <p>
     * This function SHALL take n+1 arguments, where n is one or greater.  The first argument SHALL be a <Function> element that names a Boolean function that takes n arguments of primitive types. Under the remaining n arguments, n-1 parameters SHALL be values of primitive data-types and one SHALL be a bag of a primitive data-type. The expression SHALL be evaluated as if the function named in the <Function> argument were applied to the n-1 non-bag arguments and each element of the bag argument and the results are combined with “urn:oasis:names:tc:xacml:1.0:function:and”.
     * <p>
     * For example, the following expression SHALL evaluate to "True":
     * <p>
     * <Apply FunctionId=”urn:oasis:names:tc:xacml:3.0:function:all-of”>
     * <Function FunctionId=”urn:oasis:names:tc:xacml:2.0:function:integer-greater-than”/>
     * <AttributeValue DataType=”http://www.w3.org/2001/XMLSchema#integer”>10</AttributeValue>
     * <Apply FunctionId=”urn:oasis:names:tc:xacml:1.0:function:integer-bag”>
     * <AttributeValue DataType=”http://www.w3.org/2001/XMLSchema#integer”>9</AttributeValue>
     * <AttributeValue DataType=”http://www.w3.org/2001/XMLSchema#integer”>3</AttributeValue>
     * <AttributeValue DataType=”http://www.w3.org/2001/XMLSchema#integer”>4</AttributeValue>
     * <AttributeValue DataType=”http://www.w3.org/2001/XMLSchema#integer”>2</AttributeValue>
     * </Apply>
     * </Apply>
     * This expression is "True" because the first argument (10) is greater than all of the elements of the bag (9,3,4 and 2).
     */
    all_of("urn:oasis:names:tc:xacml:3.0:function:all-of"),
    /**
     * This function applies a Boolean function on each tuple from the cross product on all bags arguments, and returns "True" if and only if the predicate is "True" for at least one inside-function call.
     * <p>
     * This function SHALL take n+1 arguments, where n is one or greater.  The first argument SHALL be an <Function> element that names a Boolean function that takes n arguments. The remaining arguments are either primitive data types or bags of primitive types.  The expression SHALL be evaluated as if the function named in the <Function> argument was applied between every tuple of the cross product on all bags and the primitive values, and the results were combined using “urn:oasis:names:tc:xacml:1.0:function:or”.  The semantics are that the result of the expression SHALL be "True" if and only if the applied predicate is "True" for at least one function call on the tuples from the bags and primitive values.
     * <p>
     * For example, the following expression SHALL evaluate to "True":
     * <p>
     * <Apply FunctionId=”urn:oasis:names:tc:xacml:3.0:function:any-of-any”>
     * <Function FunctionId=”urn:oasis:names:tc:xacml:1.0:function:string-equal”/>
     * <Apply FunctionId=”urn:oasis:names:tc:xacml:1.0:function:string-bag”>
     * <AttributeValue DataType=”http://www.w3.org/2001/XMLSchema#string”>Ringo</AttributeValue>
     * <AttributeValue DataType=”http://www.w3.org/2001/XMLSchema#string”>Mary</AttributeValue>
     * </Apply>
     * <Apply FunctionId=”urn:oasis:names:tc:xacml:1.0:function:string-bag”>
     * <AttributeValue DataType=”http://www.w3.org/2001/XMLSchema#string”>John</AttributeValue>
     * <AttributeValue DataType=”http://www.w3.org/2001/XMLSchema#string”>Paul</AttributeValue>
     * <AttributeValue DataType=”http://www.w3.org/2001/XMLSchema#string”>George</AttributeValue>
     * <AttributeValue DataType=”http://www.w3.org/2001/XMLSchema#string”>Ringo</AttributeValue>
     * </Apply>
     * </Apply>
     * This expression is "True" because at least one of the elements of the first bag, namely “Ringo”, is equal to at least one of the elements of the second bag.
     */
    any_of_any("urn:oasis:names:tc:xacml:3.0:function:any-of-any"),
    /**
     * This function applies a Boolean function between the elements of two bags.  The expression SHALL be “True” if and only if the supplied predicate is “True” between each element of the first bag and any element of the second bag.
     * <p>
     * This function SHALL take three arguments.  The first argument SHALL be an <Function> element that names a Boolean function that takes two arguments of primitive types.  The second argument SHALL be a bag of a primitive data-type.  The third argument SHALL be a bag of a primitive data-type.  The expression SHALL be evaluated as if the “urn:oasis:names:tc:xacml:3.0:function:any-of” function had been applied to each value of the first bag and the whole of the second bag using the supplied xacml:Function, and the results were then combined using “urn:oasis:names:tc:xacml:1.0:function:and”.
     * <p>
     * For example, the following expression SHALL evaluate to "True":
     * <p>
     * <Apply FunctionId=”urn:oasis:names:tc:xacml:1.0:function:all-of-any”>
     * <Function FunctionId=”urn:oasis:names:tc:xacml:2.0:function:integer-greater-than”/>
     * <Apply FunctionId=”urn:oasis:names:tc:xacml:1.0:function:integer-bag”>
     * <AttributeValue DataType=”http://www.w3.org/2001/XMLSchema#integer”>10</AttributeValue>
     * <AttributeValue DataType=”http://www.w3.org/2001/XMLSchema#integer”>20</AttributeValue>
     * </Apply>
     * <Apply FunctionId=”urn:oasis:names:tc:xacml:1.0:function:integer-bag”>
     * <AttributeValue DataType=”http://www.w3.org/2001/XMLSchema#integer”>1</AttributeValue>
     * <AttributeValue DataType=”http://www.w3.org/2001/XMLSchema#integer”>3</AttributeValue>
     * <AttributeValue DataType=”http://www.w3.org/2001/XMLSchema#integer”>5</AttributeValue>
     * <AttributeValue DataType=”http://www.w3.org/2001/XMLSchema#integer”>19</AttributeValue>
     * </Apply>
     * </Apply>
     * This expression is “True” because each of the elements of the first bag is greater than at least one of the elements of the second bag.
     */
    all_of_any("urn:oasis:names:tc:xacml:1.0:function:all-of-any"),
    /**
     * This function applies a Boolean function between the elements of two bags.  The expression SHALL be “True” if and only if the supplied predicate is “True” between each element of the second bag and any element of the first bag.
     * <p>
     * This function SHALL take three arguments.  The first argument SHALL be an <Function> element that names a Boolean function that takes two arguments of primitive types.  The second argument SHALL be a bag of a primitive data-type.  The third argument SHALL be a bag of a primitive data-type.  The expression SHALL be evaluated as if the ”urn:oasis:names:tc:xacml:3.0:function:any-of” function had been applied to each value of the second bag and the whole of the first bag using the supplied xacml:Function, and the results were then combined using “urn:oasis:names:tc:xacml:1.0:function:and”.
     * <p>
     * For example, the following expression SHALL evaluate to "True":
     * <p>
     * <Apply FunctionId=”urn:oasis:names:tc:xacml:1.0:function:any-of-all”>
     * <Function FunctionId=”urn:oasis:names:tc:xacml:2.0:function:integer-greater-than”/>
     * <Apply FunctionId=”urn:oasis:names:tc:xacml:1.0:function:integer-bag”>
     * <AttributeValue DataType=”http://www.w3.org/2001/XMLSchema#integer”>3</AttributeValue>
     * <AttributeValue DataType=”http://www.w3.org/2001/XMLSchema#integer”>5</AttributeValue>
     * </Apply>
     * <Apply FunctionId=”urn:oasis:names:tc:xacml:1.0:function:integer-bag”>
     * <AttributeValue DataType=”http://www.w3.org/2001/XMLSchema#integer”>1</AttributeValue>
     * <AttributeValue DataType=”http://www.w3.org/2001/XMLSchema#integer”>2</AttributeValue>
     * <AttributeValue DataType=”http://www.w3.org/2001/XMLSchema#integer”>3</AttributeValue>
     * <AttributeValue DataType=”http://www.w3.org/2001/XMLSchema#integer”>4</AttributeValue>
     * </Apply>
     * </Apply>
     * This expression is “True” because, for all of the values in the second bag, there is a value in the first bag that is greater.
     */
    any_of_all("urn:oasis:names:tc:xacml:1.0:function:any-of-all"),
    /**
     * This function applies a Boolean function between the elements of two bags.  The expression SHALL be "True" if and only if the supplied predicate is "True" between each and every element of the first bag collectively against all the elements of the second bag.
     * <p>
     * This function SHALL take three arguments.  The first argument SHALL be an <Function> element that names a Boolean function that takes two arguments of primitive types.  The second argument SHALL be a bag of a primitive data-type.  The third argument SHALL be a bag of a primitive data-type.  The expression is evaluated as if the function named in the <Function> element were applied between every element of the second argument and every element of the third argument  and the results were combined using “urn:oasis:names:tc:xacml:1.0:function:and”.  The semantics are that the result of the expression is "True" if and only if the applied predicate is "True" for all elements of the first bag compared to all the elements of the second bag.
     * <p>
     * For example, the following expression SHALL evaluate to "True":
     * <p>
     * <Apply FunctionId=”urn:oasis:names:tc:xacml:1.0:function:all-of-all”>
     * <Function FunctionId=”urn:oasis:names:tc:xacml:2.0:function:integer-greater-than”/>
     * <Apply FunctionId=”urn:oasis:names:tc:xacml:1.0:function:integer-bag”>
     * <AttributeValue DataType=”http://www.w3.org/2001/XMLSchema#integer”>6</AttributeValue>
     * <AttributeValue DataType=”http://www.w3.org/2001/XMLSchema#integer”>5</AttributeValue>
     * </Apply>
     * <Apply FunctionId=”urn:oasis:names:tc:xacml:1.0:function:integer-bag”>
     * <AttributeValue DataType=”http://www.w3.org/2001/XMLSchema#integer”>1</AttributeValue>
     * <AttributeValue DataType=”http://www.w3.org/2001/XMLSchema#integer”>2</AttributeValue>
     * <AttributeValue DataType=”http://www.w3.org/2001/XMLSchema#integer”>3</AttributeValue>
     * <AttributeValue DataType=”http://www.w3.org/2001/XMLSchema#integer”>4</AttributeValue>
     * </Apply>
     * </Apply>
     * This expression is "True" because all elements of the first bag, “5” and “6”, are each greater than all of the integer values “1”, ”2”, ”3”, ”4” of the second bag.
     */
    all_of_all("urn:oasis:names:tc:xacml:1.0:function:all-of-all"),
    /**
     * This function converts a bag of values to another bag of values.
     * <p>
     * This function SHALL take n+1 arguments, where n is one or greater.  The first argument SHALL be a <Function> element naming a function that takes a n arguments of a primitive data-type and returns a value of a primitive data-type Under the remaining n arguments, n-1 parameters SHALL be values of primitive data-types and one SHALL be a bag of a primitive data-type. The expression SHALL be evaluated as if the function named in the <Function> argument were applied to the n-1 non-bag arguments and each element of the bag argument and resulting in a bag of the converted value.  The result SHALL be a bag of the primitive data-type that is returned by the function named in the <xacml:Function> element.
     * <p>
     * For example, the following expression,
     * <p>
     * <Apply FunctionId=”urn:oasis:names:tc:xacml:3.0:function:map”>
     * <Function FunctionId=”urn:oasis:names:tc:xacml:1.0:function:string-normalize-to-lower-case”>
     * <Apply FunctionId=”urn:oasis:names:tc:xacml:1.0:function:string-bag”>
     * <AttributeValue DataType=”http://www.w3.org/2001/XMLSchema#string”>Hello</AttributeValue>
     * <AttributeValue DataType=”http://www.w3.org/2001/XMLSchema#string”>World!</AttributeValue>
     * </Apply>
     * </Apply>
     * evaluates to a bag containing “hello” and “world!”.
     */
    map("urn:oasis:names:tc:xacml:3.0:function:map"),;

    HigherOrderBagOps(String s) {
        this.xacmlFunction = XacmlFunction.from(s);
    }

    private final XacmlFunction xacmlFunction;
}
