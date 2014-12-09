package specified.impl;

import specified.XacmlFunction;

/**
 * Created by jim on 12/9/14.
 */
public enum ArithmeticFunctons {
    /**
     * This function MUST accept two or more arguments.
     */
integer_add("urn:oasis:names:tc:xacml:1.0:function:integer-add"),
/**
 This function MUST accept two or more arguments.
 */
double_add("urn:oasis:names:tc:xacml:1.0:function:double-add"),
/**
 The result is the second argument subtracted from the first argument.
 */
integer_subtract("urn:oasis:names:tc:xacml:1.0:function:integer-subtract"),
/**
 The result is the second argument subtracted from the first argument.
 */
double_subtract("urn:oasis:names:tc:xacml:1.0:function:double-subtract"),
    /**
     This function MUST accept two or more arguments.

     */
integer_multiply("urn:oasis:names:tc:xacml:1.0:function:integer-multiply"),
    /**
     This function MUST accept two or more arguments.

     */
double_multiply("urn:oasis:names:tc:xacml:1.0:function:double-multiply"),
    /**
     The result is the first argument divided by the second argument.
     */
integer_divide("urn:oasis:names:tc:xacml:1.0:function:integer-divide"),
    /**
     The result is the first argument divided by the second argument.
     */
double_divide("urn:oasis:names:tc:xacml:1.0:function:double-divide"),
    /**
     The result is remainder of the first argument divided by the second argument.
     */
integer_mod("urn:oasis:names:tc:xacml:1.0:function:integer-mod"),
    /**The round and floor functions SHALL take a single argument of data-type “http://www.w3.org/2001/XMLSchema#double” and return a value of the data-type “http://www.w3.org/2001/XMLSchema#double”.*/
    integer_abs("urn:oasis:names:tc:xacml:1.0:function:integer-abs"),
    /**The round and floor functions SHALL take a single argument of data-type “http://www.w3.org/2001/XMLSchema#double” and return a value of the data-type “http://www.w3.org/2001/XMLSchema#double”.*/
    double_abs     ("urn:oasis:names:tc:xacml:1.0:function:double-abs"),
    /**The round and floor functions SHALL take a single argument of data-type “http://www.w3.org/2001/XMLSchema#double” and return a value of the data-type “http://www.w3.org/2001/XMLSchema#double”.*/
    round("urn:oasis:names:tc:xacml:1.0:function:round"),
    /**The round and floor functions SHALL take a single argument of data-type “http://www.w3.org/2001/XMLSchema#double” and return a value of the data-type “http://www.w3.org/2001/XMLSchema#double”.*/
    floor("urn:oasis:names:tc:xacml:1.0:function:floor")
    ;
    private final XacmlFunction xacmlFunction;

    ArithmeticFunctons(String s) {
        xacmlFunction = XacmlFunction.from(s);
    }

}
