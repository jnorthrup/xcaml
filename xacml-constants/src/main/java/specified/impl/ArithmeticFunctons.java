package specified.impl;

import specified.BindUri;
import specified.F;

/**
 * Created by jim on 12/9/14.
 */
public enum ArithmeticFunctons implements F {
  /**
   * This function MUST accept two or more arguments.
   */
  @BindUri("urn:oasis:names:tc:xacml:1.0:function:integer-add")
  integer_add,
  /**
   * This function MUST accept two or more arguments.
   */
  @BindUri("urn:oasis:names:tc:xacml:1.0:function:double-add")
  double_add,
  /**
   * The result is the second argument subtracted from the first argument.
   */
  @BindUri("urn:oasis:names:tc:xacml:1.0:function:integer-subtract")
  integer_subtract,
  /**
   * The result is the second argument subtracted from the first argument.
   */
  @BindUri("urn:oasis:names:tc:xacml:1.0:function:double-subtract")
  double_subtract,
  /**
   * This function MUST accept two or more arguments.
   */
  @BindUri("urn:oasis:names:tc:xacml:1.0:function:integer-multiply")
  integer_multiply,
  /**
   * This function MUST accept two or more arguments.
   */
  @BindUri("urn:oasis:names:tc:xacml:1.0:function:double-multiply")
  double_multiply,
  /**
   * The result is the first argument divided by the second argument.
   */
  @BindUri("urn:oasis:names:tc:xacml:1.0:function:integer-divide")
  integer_divide,
  /**
   * The result is the first argument divided by the second argument.
   */
  @BindUri("urn:oasis:names:tc:xacml:1.0:function:double-divide")
  double_divide,
  /**
   * The result is remainder of the first argument divided by the second argument.
   */
  @BindUri("urn:oasis:names:tc:xacml:1.0:function:integer-mod")
  integer_mod,
  /**
   * The round and floor functions SHALL take a single argument of data-type “http://www.w3.org/2001/XMLSchema#double”
   * and return a value of the data-type “http://www.w3.org/2001/XMLSchema#double”.
   */
  @BindUri("urn:oasis:names:tc:xacml:1.0:function:integer-abs")
  integer_abs,
  /**
   * The round and floor functions SHALL take a single argument of data-type “http://www.w3.org/2001/XMLSchema#double”
   * and return a value of the data-type “http://www.w3.org/2001/XMLSchema#double”.
   */
  @BindUri("urn:oasis:names:tc:xacml:1.0:function:double-abs")
  double_abs,
  /**
   * The round and floor functions SHALL take a single argument of data-type “http://www.w3.org/2001/XMLSchema#double”
   * and return a value of the data-type “http://www.w3.org/2001/XMLSchema#double”.
   */
  @BindUri("urn:oasis:names:tc:xacml:1.0:function:round")
  round,
  /**
   * The round and floor functions SHALL take a single argument of data-type “http://www.w3.org/2001/XMLSchema#double”
   * and return a value of the data-type “http://www.w3.org/2001/XMLSchema#double”.
   */
  @BindUri("urn:oasis:names:tc:xacml:1.0:function:floor")
  floor;

}
