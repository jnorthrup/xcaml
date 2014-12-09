package specified.impl;

import specified.BindUri;
import specified.F;

public enum EqualityPredicate implements F {
  /**
   * This function SHALL take two arguments of data-type “http://www.w3.org/2001/XMLSchema#string” and SHALL return an
   * “http://www.w3.org/2001/XMLSchema#boolean”. The function SHALL return "True" if and only if the value of both of
   * its arguments are of equal length and each string is determined to be equal. Otherwise, it SHALL return “False”.
   * The comparison SHALL use Unicode codepoint collation, as defined for the identifier
   * http://www.w3.org/2005/xpath-functions/collation/codepoint by [XF].
   */
  @BindUri("urn:oasis:names:tc:xacml:1.0:function:string-equal")
  string_equal,
  /**
   * This function SHALL take two arguments of data-type “http://www.w3.org/2001/XMLSchema#string” and SHALL return an
   * “http://www.w3.org/2001/XMLSchema#boolean”. The result SHALL be “True” if and only if the two strings are equal as
   * defined by urn:oasis:names:tc:xacml:1.0:function:string-equal after they have both been converted to lower case
   * with urn:oasis:names:tc:xacml:1.0:function:string-normalize-to-lower-case.
   */

  @BindUri("urn:oasis:names:tc:xacml:3.0:function:string-equal-ignore-case")
  string_equal_ignore_case,

  /**
   * This function SHALL take two arguments of data-type “http://www.w3.org/2001/XMLSchema#boolean” and SHALL return an
   * “http://www.w3.org/2001/XMLSchema#boolean”. The function SHALL return "True" if and only if the arguments are
   * equal. Otherwise, it SHALL return “False”.
   */

  @BindUri("urn:oasis:names:tc:xacml:1.0:function:boolean-equal")
  boolean_equal,

  /**
   * This function SHALL take two arguments of data-type “http://www.w3.org/2001/XMLSchema#integer” and SHALL return an
   * “http://www.w3.org/2001/XMLSchema#boolean”. The function SHALL return “True” if and only if the two arguments
   * represent the same number.
   */
  @BindUri("urn:oasis:names:tc:xacml:1.0:function:integer-equal")
  integer_equal,

  /**
   * This function SHALL take two arguments of data-type “http://www.w3.org/2001/XMLSchema#double” and SHALL return an
   * “http://www.w3.org/2001/XMLSchema#boolean”. It SHALL perform its evaluation on doubles according to IEEE 754
   * [IEEE754].
   */
  @BindUri("urn:oasis:names:tc:xacml:1.0:function:double-equal")
  double_equal,

  /**
   * This function SHALL take two arguments of data-type “http://www.w3.org/2001/XMLSchema#date” and SHALL return an
   * “http://www.w3.org/2001/XMLSchema#boolean”. It SHALL perform its evaluation according to the “op:date-equal”
   * function [XF] Section 10.4.9.
   */
  @BindUri("urn:oasis:names:tc:xacml:1.0:function:date-equal")
  date_equal,

  /**
   * This function SHALL take two arguments of data-type “http://www.w3.org/2001/XMLSchema#time” and SHALL return an
   * “http://www.w3.org/2001/XMLSchema#boolean”. It SHALL perform its evaluation according to the “op:time-equal”
   * function [XF] Section 10.4.12.
   */
  @BindUri("urn:oasis:names:tc:xacml:1.0:function:time-equal")
  time_equal,

  /**
   * This function SHALL take two arguments of data-type “http://www.w3.org/2001/XMLSchema#dateTime” and SHALL return an
   * “http://www.w3.org/2001/XMLSchema#boolean”. It SHALL perform its evaluation according to the “op:dateTime-equal”
   * function [XF] Section 10.4.6.
   */
  @BindUri("urn:oasis:names:tc:xacml:1.0:function:dateTime-equal")
  dateTime_equal,

  /**
   * This function SHALL take two arguments of data-type
   * "http://www.w3.org/2001/XMLSchema#dayTimeDuration” and SHALL return an "
   * http://www.w3.org/2001/XMLSchema#boolean".  This function shall perform its evaluation according to the "
   * op:duration-equal" function [XF] Section 10.4.5. Note that the lexical representation of each argument MUST be
   * converted to a value expressed in fractional seconds [XF] Section 10.3.2.
   */
  @BindUri("urn:oasis:names:tc:xacml:3.0:function:dayTimeDuration-equal")
  dayTimeDuration_equal,

  /**
   * This function SHALL take two arguments of data-type
   * "http://www.w3.org/2001/XMLSchema#yearMonthDuration” and SHALL return an "
   * http://www.w3.org/2001/XMLSchema#boolean".  This function shall perform its evaluation according to the "
   * op:duration-equal" function [XF] Section 10.4.5. Note that the lexical representation of each argument MUST be
   * converted to a value expressed in fractional seconds [XF] Section 10.3.2.
   */
  @BindUri("urn:oasis:names:tc:xacml:3.0:function:yearMonthDuration-equal")
  yearMonthDuration_equal,

  /**
   * This function SHALL take two arguments of data-type “http://www.w3.org/2001/XMLSchema#anyURI” and SHALL return an
   * “http://www.w3.org/2001/XMLSchema#boolean”. The function SHALL convert the arguments to strings with
   * urn:oasis:names:tc:xacml:3.0:function:string-from-anyURI and return “True” if and only if the values of the two
   * arguments are equal on a codepoint-by-codepoint basis.
   */
  @BindUri("urn:oasis:names:tc:xacml:1.0:function:anyURI-equal")
  anyURI_equal,

  /**
   * This function SHALL take two arguments of "urn:oasis:names:tc:xacml:1.0:data-type:x500Name" and SHALL return an
   * "http://www.w3.org/2001/XMLSchema#boolean". It SHALL return “True” if and only if each Relative Distinguished Name
   * (RDN) in the two arguments matches. Otherwise, it SHALL return “False”. Two RDNs shall be said to match if and only
   * if the result of the following operations is “True” .
   * <p>
   * 1. Normalize the two arguments according to IETF RFC 2253
   * "Lightweight Directory Access Protocol (v3): UTF-8 String Representation of Distinguished Names".
   * <p>
   * 2. If any RDN contains multiple attributeTypeAndValue pairs, re-order the Attribute ValuePairs in that RDN in
   * ascending order when compared as octet strings (described in ITU-T Rec. X.690 (1997 E) Section 11.6
   * "Set-of components").
   * <p>
   * 3. Compare RDNs using the rules in IETF RFC 3280
   * "Internet X.509 Public Key Infrastructure Certificate and Certificate Revocation List (CRL) Profile", Section
   * 4.1.2.4 "Issuer".
   */
  @BindUri("urn:oasis:names:tc:xacml:1.0:function:x500Name-equal")
  x500Name_equal,

  /**
   * This function SHALL take two arguments of data-type “urn:oasis:names:tc:xacml:1.0:data-type:rfc822Name” and SHALL
   * return an “http://www.w3.org/2001/XMLSchema#boolean”. It SHALL return “True” if and only if the two arguments are
   * equal. Otherwise, it SHALL return “False”. An RFC822 name consists of a local-part followed by "@" followed by a
   * domain-part. The local-part is case-sensitive, while the domain-part (which is usually a DNS host name) is not
   * case-sensitive. Perform the following operations:
   * <p>
   * 1. Normalize the domain-part of each argument to lower case
   * <p>
   * 2. Compare the expressions by applying the function “urn:oasis:names:tc:xacml:1.0:function:string-equal” to the
   * normalized arguments.
   */
  @BindUri("urn:oasis:names:tc:xacml:1.0:function:rfc822Name-equal")
  rfc822Name_equal,

  /**
   * This function SHALL take two arguments of data-type “http://www.w3.org/2001/XMLSchema#hexBinary” and SHALL return
   * an “http://www.w3.org/2001/XMLSchema#boolean”. It SHALL return "True" if the octet sequences represented by the
   * value of both arguments have equal length and are equal in a conjunctive, point-wise, comparison using the
   * “urn:oasis:names:tc:xacml:1.0:function:integer-equal” function. Otherwise, it SHALL return “False”. The conversion
   * from the string representation to an octet sequence SHALL be as specified in [XS] Section 3.2.15.
   */
  @BindUri("urn:oasis:names:tc:xacml:1.0:function:hexBinary-equal")
  hexBinary_equal,

  /**
   * This function SHALL take two arguments of data-type “http://www.w3.org/2001/XMLSchema#base64Binary” and SHALL
   * return an “http://www.w3.org/2001/XMLSchema#boolean”. It SHALL return "True" if the octet sequences represented by
   * the value of both arguments have equal length and are equal in a conjunctive, point-wise, comparison using the
   * “urn:oasis:names:tc:xacml:1.0:function:integer-equal” function. Otherwise, it SHALL return “False”. The conversion
   * from the string representation to an octet sequence SHALL be as specified in [XS] Section 3.2.16.
   */
  @BindUri("urn:oasis:names:tc:xacml:1.0:function:base64Binary-equal")
  base64Binary_equal,

}
