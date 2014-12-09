package specified.impl;

import specified.BindUri;
import specified.F;

/**
 * A.3.7 Date and time arithmetic functions These functions perform arithmetic operations with date and time.
 */
public enum DateTimeArithmetic implements F {
  /**
   * This function SHALL take two arguments, the first SHALL be of data-type “http://www.w3.org/2001/XMLSchema#dateTime”
   * and the second SHALL be of data-type “http://www.w3.org/2001/XMLSchema#dayTimeDuration”. It SHALL return a result
   * of “http://www.w3.org/2001/XMLSchema#dateTime”. This function SHALL return the value by adding the second argument
   * to the first argument according to the specification of adding durations to date and time [XS] Appendix E.
   */
  @BindUri("urn:oasis:names:tc:xacml:3.0:function:dateTime-add-dayTimeDuration")
  dateTime_add_dayTimeDuration,
  /**
   * This function SHALL take two arguments, the first SHALL be a “http://www.w3.org/2001/XMLSchema#dateTime” and the
   * second SHALL be a “http://www.w3.org/2001/XMLSchema#yearMonthDuration”. It SHALL return a result of
   * “http://www.w3.org/2001/XMLSchema#dateTime”. This function SHALL return the value by adding the second argument to
   * the first argument according to the specification of adding durations to date and time [XS] Appendix E.
   */
  @BindUri("urn:oasis:names:tc:xacml:3.0:function:dateTime-add-yearMonthDuration")
  dateTime_add_yearMonthDuration,
  /**
   * This function SHALL take two arguments, the first SHALL be a “http://www.w3.org/2001/XMLSchema#dateTime” and the
   * second SHALL be a “http://www.w3.org/2001/XMLSchema#dayTimeDuration”. It SHALL return a result of
   * “http://www.w3.org/2001/XMLSchema#dateTime”. If the second argument is a positive duration, then this function
   * SHALL return the value by adding the corresponding negative duration, as per the specification [XS] Appendix E. If
   * the second argument is a negative duration, then the result SHALL be as if the function
   * “urn:oasis:names:tc:xacml:1.0:function:dateTime-add-dayTimeDuration” had been applied to the corresponding positive
   * duration.
   */
  @BindUri("urn:oasis:names:tc:xacml:3.0:function:dateTime-subtract-dayTimeDuration")
  dateTime_subtract_dayTimeDuration,
  /**
   * This function SHALL take two arguments, the first SHALL be a “http://www.w3.org/2001/XMLSchema#dateTime” and the
   * second SHALL be a “http://www.w3.org/2001/XMLSchema#yearMonthDuration”. It SHALL return a result of
   * “http://www.w3.org/2001/XMLSchema#dateTime”. If the second argument is a positive duration, then this function
   * SHALL return the value by adding the corresponding negative duration, as per the specification [XS] Appendix E. If
   * the second argument is a negative duration, then the result SHALL be as if the function
   * “urn:oasis:names:tc:xacml:1.0:function:dateTime-add-yearMonthDuration” had been applied to the corresponding
   * positive duration.
   */
  @BindUri("urn:oasis:names:tc:xacml:3.0:function:dateTime-subtract-yearMonthDuration")
  dateTime_subtract_yearMonthDuration,
  /**
   * This function SHALL take two arguments, the first SHALL be a “http://www.w3.org/2001/XMLSchema#date” and the second
   * SHALL be a “http://www.w3.org/2001/XMLSchema#yearMonthDuration”. It SHALL return a result of
   * “http://www.w3.org/2001/XMLSchema#date”. This function SHALL return the value by adding the second argument to the
   * first argument according to the specification of adding duration to date [XS] Appendix E.
   */
  @BindUri("urn:oasis:names:tc:xacml:3.0:function:date-add-yearMonthDuration")
  date_add_yearMonthDuration,
  /**
   * This function SHALL take two arguments, the first SHALL be a “http://www.w3.org/2001/XMLSchema#date” and the second
   * SHALL be a “http://www.w3.org/2001/XMLSchema#yearMonthDuration”. It SHALL return a result of
   * “http://www.w3.org/2001/XMLSchema#date”. If the second argument is a positive duration, then this function SHALL
   * return the value by adding the corresponding negative duration, as per the specification [XS] Appendix E. If the
   * second argument is a negative duration, then the result SHALL be as if the function
   * “urn:oasis:names:tc:xacml:1.0:function:date-add-yearMonthDuration” had been applied to the corresponding positive
   * duration.
   */
  @BindUri("urn:oasis:names:tc:xacml:3.0:function:date-subtract-yearMonthDuration")
  date_subtract_yearMonthDuration, ;

}
