package specified.impl;

import specified.XacmlFunction;

/**
 * A.3.5 Logical functions
 * This section contains the specification for logical functions that operate on arguments of data-type “http://www.w3.org/2001/XMLSchema#boolean”.
 */
public enum LogicalFunction {
    /**
     * This function SHALL return "False" if it has no arguments and SHALL return "True" if at least one of its arguments evaluates to "True".  The order of evaluation SHALL be from first argument to last.  The evaluation SHALL stop with a result of "True" if any argument evaluates to "True", leaving the rest of the arguments unevaluated.
     */
    or("urn:oasis:names:tc:xacml:1.0:function:or"),
    /**
     * This function SHALL return "True" if it has no arguments and SHALL return "False" if one of its arguments evaluates to "False".  The order of evaluation SHALL be from first argument to last.  The evaluation SHALL stop with a result of "False" if any argument evaluates to "False", leaving the rest of the arguments unevaluated.
     */
    and("urn:oasis:names:tc:xacml:1.0:function:and"),
    /**
     * The first argument to this function SHALL be of data-type http://www.w3.org/2001/XMLSchema#integer.  The remaining arguments SHALL be of data-type http://www.w3.org/2001/XMLSchema#boolean.  The first argument specifies the minimum number of the remaining arguments that MUST evaluate to "True" for the expression to be considered "True".  If the first argument is 0, the result SHALL be "True".  If the number of arguments after the first one is less than the value of the first argument, then the expression SHALL result in "Indeterminate".  The order of evaluation SHALL be: first evaluate the integer value, and then evaluate each subsequent argument.  The evaluation SHALL stop and return "True" if the specified number of arguments evaluate to "True".  The evaluation of arguments SHALL stop if it is determined that evaluating the remaining arguments will not satisfy the requirement.
     */
    n_of("urn:oasis:names:tc:xacml:1.0:function:n-of"),

    /**
     * This function SHALL take one argument of data-type “http://www.w3.org/2001/XMLSchema#boolean”.  If the argument evaluates to "True", then the result of the expression SHALL be "False".  If the argument evaluates to "False", then the result of the expression SHALL be "True".
     * <p>
     * Note: When evaluating and, or, or n-of, it MAY NOT be necessary to attempt a full evaluation of each argument in order to determine whether the evaluation of the argument would result in "Indeterminate".  Analysis of the argument regarding the availability of its attributes, or other analysis regarding errors, such as "divide-by-zero", may render the argument error free.  Such arguments occurring in the expression in a position after the evaluation is stated to stop need not be processed.
     */
    not("urn:oasis:names:tc:xacml:1.0:function:not"),;
    private final XacmlFunction xacmlFunction;

    LogicalFunction(String s) {
        this.xacmlFunction = XacmlFunction.from(s);
    }
}

