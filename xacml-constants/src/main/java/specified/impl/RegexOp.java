package specified.impl;

import specified.BindUri;
import specified.Rfc822Name;

/**
 * Regular-expression-based functions These functions operate on various types using regular expressions and evaluate to
 * “http://www.w3.org/2001/XMLSchema#boolean”.
 */
public enum RegexOp implements specified.F {
  /**
   * This function decides a regular expression match. It SHALL take two arguments of
   * “http://www.w3.org/2001/XMLSchema#string” and SHALL return an “http://www.w3.org/2001/XMLSchema#boolean”. The first
   * argument SHALL be a regular expression and the second argument SHALL be a general string. The function
   * specification SHALL be that of the “xf:matches” function with the arguments reversed [XF] Section 7.6.2.
   */
  @BindUri("urn:oasis:names:tc:xacml:1.0:function:string-regexp-match")
  string_regexp_match,
  /**
   * This function decides a regular expression match. It SHALL take two arguments; the first is of type
   * “http://www.w3.org/2001/XMLSchema#string” and the second is of type “http://www.w3.org/2001/XMLSchema#anyURI”. It
   * SHALL return an “http://www.w3.org/2001/XMLSchema#boolean”. The first argument SHALL be a regular expression and
   * the second argument SHALL be a URI. The function SHALL convert the second argument to type
   * “http://www.w3.org/2001/XMLSchema#string” with urn:oasis:names:tc:xacml:3.0:function:string-from-anyURI, then apply
   * “urn:oasis:names:tc:xacml:1.0:function:string-regexp-match”.
   */
  @BindUri("urn:oasis:names:tc:xacml:2.0:function:anyURI-regexp-match")
  anyURI_regexp_match,
  /**
   * This function decides a regular expression match. It SHALL take two arguments; the first is of type
   * “http://www.w3.org/2001/XMLSchema#string” and the second is of type
   * “urn:oasis:names:tc:xacml:2.0:data-type:ipAddress”. It SHALL return an “http://www.w3.org/2001/XMLSchema#boolean”.
   * The first argument SHALL be a regular expression and the second argument SHALL be an IPv4 or IPv6 address. The
   * function SHALL convert the second argument to type “http://www.w3.org/2001/XMLSchema#string” with
   * urn:oasis:names:tc:xacml:3.0:function:string-from-ipAddress, then apply
   * “urn:oasis:names:tc:xacml:1.0:function:string-regexp-match”.
   */
  @BindUri("urn:oasis:names:tc:xacml:2.0:function:ipAddress-regexp-match")
  ipAddress_regexp_match,
  /**
   * This function decides a regular expression match. It SHALL take two arguments; the first is of type
   * “http://www.w3.org/2001/XMLSchema#string” and the second is of type
   * “urn:oasis:names:tc:xacml:2.0:data-type:dnsName”. It SHALL return an “http://www.w3.org/2001/XMLSchema#boolean”.
   * The first argument SHALL be a regular expression and the second argument SHALL be a DNS name. The function SHALL
   * convert the second argument to type “http://www.w3.org/2001/XMLSchema#string” with
   * urn:oasis:names:tc:xacml:3.0:function:string-from-dnsName, then apply
   * “urn:oasis:names:tc:xacml:1.0:function:string-regexp-match”.
   */
  @BindUri("urn:oasis:names:tc:xacml:2.0:function:dnsName-regexp-match")
  dnsName_regexp_match,
  /**
   * This function decides a regular expression match. It SHALL take two arguments; the first is of type
   * “http://www.w3.org/2001/XMLSchema#string” and the second is of type
   * “urn:oasis:names:tc:xacml:1.0:data-type:rfc822Name”. It SHALL return an “http://www.w3.org/2001/XMLSchema#boolean”.
   * The first argument SHALL be a regular expression and the second argument SHALL be an RFC 822 name. The function
   * SHALL convert the second argument to type “http://www.w3.org/2001/XMLSchema#string” with
   * urn:oasis:names:tc:xacml:3.0:function:string-from-rfc822Name, then apply
   * “urn:oasis:names:tc:xacml:1.0:function:string-regexp-match”.
   */
  @BindUri("urn:oasis:names:tc:xacml:2.0:function:rfc822Name-regexp-match")
  rfc822Name_regexp_match,
  /**
   * This function decides a regular expression match. It SHALL take two arguments; the first is of type
   * “http://www.w3.org/2001/XMLSchema#string” and the second is of type
   * “urn:oasis:names:tc:xacml:1.0:data-type:x500Name”. It SHALL return an “http://www.w3.org/2001/XMLSchema#boolean”.
   * The first argument SHALL be a regular expression and the second argument SHALL be an X.500 directory name. The
   * function SHALL convert the second argument to type “http://www.w3.org/2001/XMLSchema#string” with
   * urn:oasis:names:tc:xacml:3.0:function:string-from-x500Name, then apply
   * “urn:oasis:names:tc:xacml:1.0:function:string-regexp-match”.
   * <p>
   * A.3.14 Special match functions These functions operate on various types and evaluate to
   * “http://www.w3.org/2001/XMLSchema#boolean” based on the specified standard matching algorithm.
   */
  @BindUri("urn:oasis:names:tc:xacml:2.0:function:x500Name-regexp-match")
  x500Name_regexp_match,
  /**
   * This function shall take two arguments of "urn:oasis:names:tc:xacml:1.0:data-type:x500Name" and shall return an
   * "http://www.w3.org/2001/XMLSchema#boolean". It shall return “True” if and only if the first argument matches some
   * terminal sequence of RDNs from the second argument when compared using x500Name-equal.
   * <p>
   * As an example (non-normative), if the first argument is “O=Medico Corp,C=US” and the second argument is “cn=John
   * Smith,o=Medico Corp, c=US”, then the function will return “True”.
   */
  @BindUri("urn:oasis:names:tc:xacml:1.0:function:x500Name-match")
  x500Name_match,
  /**
   * This function SHALL take two arguments, the first is of data-type “http://www.w3.org/2001/XMLSchema#string” and the
   * second is of data-type “urn:oasis:names:tc:xacml:1.0:data-type:rfc822Name” and SHALL return an
   * “http://www.w3.org/2001/XMLSchema#boolean”. This function SHALL evaluate to "True" if the first argument matches
   * the second argument according to the following specification.
   * <p>
   * An RFC822 name consists of a local-part followed by "@" followed by a domain-part. The local-part is
   * case-sensitive, while the domain-part (which is usually a DNS name) is not case-sensitive.
   * <p>
   * The second argument contains a complete rfc822Name. The first argument is a complete or partial rfc822Name used to
   * select appropriate values in the second argument as follows.
   * <p>
   * In order to match a particular address in the second argument, the first argument must specify the complete mail
   * address to be matched. For example, if the first argument is “Anderson@sun.com”, this matches a value in the second
   * argument of “Anderson@sun.com” and “Anderson@SUN.COM”, but not “Anne.Anderson@sun.com”, “anderson@sun.com” or
   * “Anderson@east.sun.com”.
   * <p>
   * In order to match any address at a particular domain in the second argument, the first argument must specify only a
   * domain name (usually a DNS name). For example, if the first argument is “sun.com”, this matches a value in the
   * second argument of “Anderson@sun.com” or “Baxter@SUN.COM”, but not “Anderson@east.sun.com”.
   * <p>
   * In order to match any address in a particular domain in the second argument, the first argument must specify the
   * desired domain-part with a leading ".". For example, if the first argument is “.east.sun.com”, this matches a value
   * in the second argument of "Anderson@east.sun.com" and "anne.anderson@ISRG.EAST.SUN.COM" but not "Anderson@sun.com".
   * <p>
   * <p>
   * <p>
   */
  @BindUri("urn:oasis:names:tc:xacml:1.0:function:rfc822Name-match")
  rfc822Name_match {
    @Override
    public <R> R apply(Object... p) {
      Rfc822NameMatchInput unmarshal = new Rfc822NameMatchInput(p).invoke();
      return (R) (Boolean) rfc822NameMatch(unmarshal);
    }

    private boolean rfc822NameMatch(Rfc822NameMatchInput matchInput) {
      String match = matchInput.getMatch();
      Rfc822Name n = matchInput.getN();
      boolean ret;
      if (match.startsWith(".")) {
        ret = n.domain().toLowerCase().endsWith(match.toLowerCase());
      } else if (match.contains("@")) {
        String[] split = match.split("@", 2);
        ret = split[0].equals(n.name()) && split[1].equalsIgnoreCase(n.domain());
      } else
        ret = match.equalsIgnoreCase(n.domain());
      return ret;
    }
  };

  private static class Rfc822NameMatchInput {
    private Object[] p;
    private String match;
    private Rfc822Name n;

    public Rfc822NameMatchInput(Object... p) {
      this.p = p;
    }

    public String getMatch() {
      return match;
    }

    public Rfc822Name getN() {
      return n;
    }

    public Rfc822NameMatchInput invoke() {
      match = String.valueOf(p[0]);
      String email = String.valueOf(p[1]);
      n = Rfc822Name.create(email);
      return this;
    }
  }
}
