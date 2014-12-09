package specified.impl;

import specified.F;
import specified.XacmlFunction;

/**
 * A.3.8 Non-numeric comparison functions These functions perform comparison operations on two arguments of
 * non-numerical types.
 */
public enum NonNumericComparison implements F {
  /**
   * This function SHALL take two arguments of data-type “http://www.w3.org/2001/XMLSchema#string” and SHALL return an
   * “http://www.w3.org/2001/XMLSchema#boolean”. It SHALL return "True" if and only if the first argument is
   * lexicographically strictly greater than the second argument. Otherwise, it SHALL return “False”. The comparison
   * SHALL use Unicode codepoint collation, as defined for the identifier
   * http://www.w3.org/2005/xpath-functions/collation/codepoint by [XF].
   */
  string_greater_than("urn:oasis:names:tc:xacml:1.0:function:string-greater-than"),
  /**
   * This function SHALL take two arguments of data-type “http://www.w3.org/2001/XMLSchema#string” and SHALL return an
   * “http://www.w3.org/2001/XMLSchema#boolean”. It SHALL return "True" if and only if the first argument is
   * lexicographically greater than or equal to the second argument. Otherwise, it SHALL return “False”. The comparison
   * SHALL use Unicode codepoint collation, as defined for the identifier
   * http://www.w3.org/2005/xpath-functions/collation/codepoint by [XF].
   */
  string_greater_than_or_equal("urn:oasis:names:tc:xacml:1.0:function:string-greater-than-or-equal"),
  /**
   * This function SHALL take two arguments of data-type “http://www.w3.org/2001/XMLSchema#string” and SHALL return an
   * “http://www.w3.org/2001/XMLSchema#boolean”. It SHALL return "True" if and only the first argument is
   * lexigraphically strictly less than the second argument. Otherwise, it SHALL return “False”. The comparison SHALL
   * use Unicode codepoint collation, as defined for the identifier
   * http://www.w3.org/2005/xpath-functions/collation/codepoint by [XF].
   */
  string_less_than("urn:oasis:names:tc:xacml:1.0:function:string-less-than"),
  /**
   * This function SHALL take two arguments of data-type “http://www.w3.org/2001/XMLSchema#string” and SHALL return an
   * “http://www.w3.org/2001/XMLSchema#boolean”. It SHALL return "True" if and only the first argument is
   * lexigraphically less than or equal to the second argument. Otherwise, it SHALL return “False”. The comparison SHALL
   * use Unicode codepoint collation, as defined for the identifier
   * http://www.w3.org/2005/xpath-functions/collation/codepoint by [XF].
   */
  string_less_than_or_equal("urn:oasis:names:tc:xacml:1.0:function:string-less-than-or-equal"),
  /**
   * This function SHALL take two arguments of data-type “http://www.w3.org/2001/XMLSchema#time” and SHALL return an
   * “http://www.w3.org/2001/XMLSchema#boolean”. It SHALL return "True" if and only if the first argument is greater
   * than the second argument according to the order relation specified for “http://www.w3.org/2001/XMLSchema#time” [XS]
   * Section 3.2.8. Otherwise, it SHALL return “False”. Note: it is illegal to compare a time that includes a time-zone
   * value with one that does not. In such cases, the time-in-range function should be used.
   */
  time_greater_than("urn:oasis:names:tc:xacml:1.0:function:time-greater-than"),
  /**
   * This function SHALL take two arguments of data-type “http://www.w3.org/2001/XMLSchema#time” and SHALL return an
   * “http://www.w3.org/2001/XMLSchema#boolean”. It SHALL return "True" if and only if the first argument is greater
   * than or equal to the second argument according to the order relation specified for
   * “http://www.w3.org/2001/XMLSchema#time” [XS] Section 3.2.8. Otherwise, it SHALL return “False”. Note: it is illegal
   * to compare a time that includes a time-zone value with one that does not. In such cases, the time-in-range function
   * should be used.
   */
  time_greater_than_or_equal("urn:oasis:names:tc:xacml:1.0:function:time-greater-than-or-equal"),
  /**
   * This function SHALL take two arguments of data-type “http://www.w3.org/2001/XMLSchema#time” and SHALL return an
   * “http://www.w3.org/2001/XMLSchema#boolean”. It SHALL return "True" if and only if the first argument is less than
   * the second argument according to the order relation specified for “http://www.w3.org/2001/XMLSchema#time” [XS]
   * Section 3.2.8. Otherwise, it SHALL return “False”. Note: it is illegal to compare a time that includes a time-zone
   * value with one that does not. In such cases, the time-in-range function should be used.
   */
  time_less_than("urn:oasis:names:tc:xacml:1.0:function:time-less-than"),
  /**
   * This function SHALL take two arguments of data-type “http://www.w3.org/2001/XMLSchema#time” and SHALL return an
   * “http://www.w3.org/2001/XMLSchema#boolean”. It SHALL return "True" if and only if the first argument is less than
   * or equal to the second argument according to the order relation specified for
   * “http://www.w3.org/2001/XMLSchema#time” [XS] Section 3.2.8. Otherwise, it SHALL return “False”. Note: it is illegal
   * to compare a time that includes a time-zone value with one that does not. In such cases, the time-in-range function
   * should be used.
   */
  time_less_than_or_equal("urn:oasis:names:tc:xacml:1.0:function:time-less-than-or-equal"),
  /**
   * This function SHALL take three arguments of data-type “http://www.w3.org/2001/XMLSchema#time” and SHALL return an
   * “http://www.w3.org/2001/XMLSchema#boolean”. It SHALL return "True" if the first argument falls in the range defined
   * inclusively by the second and third arguments. Otherwise, it SHALL return “False”. Regardless of its value, the
   * third argument SHALL be interpreted as a time that is equal to, or later than by less than twenty-four hours, the
   * second argument. If no time zone is provided for the first argument, it SHALL use the default time zone at the
   * context handler. If no time zone is provided for the second or third arguments, then they SHALL use the time zone
   * from the first argument.
   */
  time_in_range("urn:oasis:names:tc:xacml:2.0:function:time-in-range"),
  /**
   * This function SHALL take two arguments of data-type “http://www.w3.org/2001/XMLSchema#dateTime” and SHALL return an
   * “http://www.w3.org/2001/XMLSchema#boolean”. It SHALL return "True" if and only if the first argument is greater
   * than the second argument according to the order relation specified for “http://www.w3.org/2001/XMLSchema#dateTime”
   * by [XS] part 2, section 3.2.7. Otherwise, it SHALL return “False”. Note: if a dateTime value does not include a
   * time-zone value, then an implicit time-zone value SHALL be assigned, as described in [XS].
   */
  dateTime_greater_than("urn:oasis:names:tc:xacml:1.0:function:dateTime-greater-than"),
  /**
   * This function SHALL take two arguments of data-type “http://www.w3.org/2001/XMLSchema#dateTime” and SHALL return an
   * “http://www.w3.org/2001/XMLSchema#boolean”. It SHALL return "True" if and only if the first argument is greater
   * than or equal to the second argument according to the order relation specified for
   * “http://www.w3.org/2001/XMLSchema#dateTime” by [XS] part 2, section 3.2.7. Otherwise, it SHALL return “False”.
   * Note: if a dateTime value does not include a time-zone value, then an implicit time-zone value SHALL be assigned,
   * as described in [XS].
   */
  dateTime_greater_than_or_equal(
      "urn:oasis:names:tc:xacml:1.0:function:dateTime-greater-than-or-equal"),
  /**
   * This function SHALL take two arguments of data-type “http://www.w3.org/2001/XMLSchema#dateTime” and SHALL return an
   * “http://www.w3.org/2001/XMLSchema#boolean”. It SHALL return "True" if and only if the first argument is less than
   * the second argument according to the order relation specified for “http://www.w3.org/2001/XMLSchema#dateTime” by
   * [XS, part 2, section 3.2.7]. Otherwise, it SHALL return “False”. Note: if a dateTime value does not include a
   * time-zone value, then an implicit time-zone value SHALL be assigned, as described in [XS].
   */
  dateTime_less_than("urn:oasis:names:tc:xacml:1.0:function:dateTime-less-than"),
  /**
   * This function SHALL take two arguments of data-type “http://www.w3.org/2001/XMLSchema# dateTime” and SHALL return
   * an “http://www.w3.org/2001/XMLSchema#boolean”. It SHALL return "True" if and only if the first argument is less
   * than or equal to the second argument according to the order relation specified for
   * “http://www.w3.org/2001/XMLSchema#dateTime” by [XS] part 2, section 3.2.7. Otherwise, it SHALL return “False”.
   * Note: if a dateTime value does not include a time-zone value, then an implicit time-zone value SHALL be assigned,
   * as described in [XS].
   */
  dateTime_less_than_or_equal("urn:oasis:names:tc:xacml:1.0:function:dateTime-less-than-or-equal"),
  /**
   * This function SHALL take two arguments of data-type “http://www.w3.org/2001/XMLSchema#date” and SHALL return an
   * “http://www.w3.org/2001/XMLSchema#boolean”. It SHALL return "True" if and only if the first argument is greater
   * than the second argument according to the order relation specified for “http://www.w3.org/2001/XMLSchema#date” by
   * [XS] part 2, section 3.2.9. Otherwise, it SHALL return “False”. Note: if a date value does not include a time-zone
   * value, then an implicit time-zone value SHALL be assigned, as described in [XS].
   */
  date_greater_than("urn:oasis:names:tc:xacml:1.0:function:date-greater-than"),
  /**
   * This function SHALL take two arguments of data-type “http://www.w3.org/2001/XMLSchema#date” and SHALL return an
   * “http://www.w3.org/2001/XMLSchema#boolean”. It SHALL return "True" if and only if the first argument is greater
   * than or equal to the second argument according to the order relation specified for
   * “http://www.w3.org/2001/XMLSchema#date” by [XS] part 2, section 3.2.9. Otherwise, it SHALL return “False”. Note: if
   * a date value does not include a time-zone value, then an implicit time-zone value SHALL be assigned, as described
   * in [XS].
   */
  date_greater_than_or_equal("urn:oasis:names:tc:xacml:1.0:function:date-greater-than-or-equal"),
  /**
   * This function SHALL take two arguments of data-type “http://www.w3.org/2001/XMLSchema#date” and SHALL return an
   * “http://www.w3.org/2001/XMLSchema#boolean”. It SHALL return "True" if and only if the first argument is less than
   * the second argument according to the order relation specified for “http://www.w3.org/2001/XMLSchema#date” by [XS]
   * part 2, section 3.2.9. Otherwise, it SHALL return “False”. Note: if a date value does not include a time-zone
   * value, then an implicit time-zone value SHALL be assigned, as described in [XS].
   */
  date_less_than("urn:oasis:names:tc:xacml:1.0:function:date-less-than"),
  /**
   * This function SHALL take two arguments of data-type “http://www.w3.org/2001/XMLSchema#date” and SHALL return an
   * “http://www.w3.org/2001/XMLSchema#boolean”. It SHALL return "True" if and only if the first argument is less than
   * or equal to the second argument according to the order relation specified for
   * “http://www.w3.org/2001/XMLSchema#date” by [XS] part 2, section 3.2.9. Otherwise, it SHALL return “False”. Note: if
   * a date value does not include a time-zone value, then an implicit time-zone value SHALL be assigned, as described
   * in [XS].
   * <p>
   */
  date_less_than_or_equal("urn:oasis:names:tc:xacml:1.0:function:date-less-than-or-equal"), ;

  NonNumericComparison(String s) {
    this.xacmlFunction = XacmlFunction.from(s);
  }

  private final XacmlFunction xacmlFunction;
}
