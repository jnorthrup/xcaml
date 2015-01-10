package specified;

/**
 * todo: link through {@link javax.xml.datatype.DatatypeFactory
 * }
 */
public enum XacmlDataType {
  /**
   * http://www.w3.org/2001/XMLSchema#string
   */
  http$3A$2F$2Fwww$2Ew3$2Eorg$2F2001$2FXMLSchema$23__string,
  /**
   * http://www.w3.org/2001/XMLSchema#boolean
   */
  http$3A$2F$2Fwww$2Ew3$2Eorg$2F2001$2FXMLSchema$23__boolean,
  /**
   * http://www.w3.org/2001/XMLSchema#integer
   */
  http$3A$2F$2Fwww$2Ew3$2Eorg$2F2001$2FXMLSchema$23__integer,
  /**
   * http://www.w3.org/2001/XMLSchema#double
   */
  http$3A$2F$2Fwww$2Ew3$2Eorg$2F2001$2FXMLSchema$23__double,
  /**
   * http://www.w3.org/2001/XMLSchema#time
   */
  http$3A$2F$2Fwww$2Ew3$2Eorg$2F2001$2FXMLSchema$23__time,
  /**
   * http://www.w3.org/2001/XMLSchema#date
   */
  http$3A$2F$2Fwww$2Ew3$2Eorg$2F2001$2FXMLSchema$23__date,
  /**
   * http://www.w3.org/2001/XMLSchema#dateTime
   */
  http$3A$2F$2Fwww$2Ew3$2Eorg$2F2001$2FXMLSchema$23__dateTime,
  /**
   * http://www.w3.org/2001/XMLSchema#dayTimeDuration
   */
  http$3A$2F$2Fwww$2Ew3$2Eorg$2F2001$2FXMLSchema$23__dayTimeDuration,
  /**
   * http://www.w3.org/2001/XMLSchema#yearMonthDuration
   */
  http$3A$2F$2Fwww$2Ew3$2Eorg$2F2001$2FXMLSchema$23__yearMonthDuration,
  /**
   * http://www.w3.org/2001/XMLSchema#anyURI
   */
  http$3A$2F$2Fwww$2Ew3$2Eorg$2F2001$2FXMLSchema$23__anyURI,
  /**
   * http://www.w3.org/2001/XMLSchema#hexBinary
   */
  http$3A$2F$2Fwww$2Ew3$2Eorg$2F2001$2FXMLSchema$23__hexBinary,
  /**
   * http://www.w3.org/2001/XMLSchema#base64Binary
   */
  http$3A$2F$2Fwww$2Ew3$2Eorg$2F2001$2FXMLSchema$23__base64Binary,
  /**
   * urn:oasis:names:tc:xacml:1.0:data-type:rfc822Name
   * <p>
   * An RFC822 name consists of a local-part followed by "@" followed by a domain-part. The local-part is
   * case-sensitive, while the domain-part (which is usually a DNS name) is not case-sensitive.
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Adata_$2D_type$3A__rfc822Name {
    @Override
    public <R> R apply(String input) {
      return (R) Rfc822Name.create(input);
    }
  },
  /**
   * urn:oasis:names:tc:xacml:1.0:data-type:x500Name
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Adata_$2D_type$3A__x500Name,
  /**
   * urn:oasis:names:tc:xacml:3.0:data-type:xpathExpression
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A3$2E0$3Adata_$2D_type$3A__xpathExpression,
  /**
   * urn:oasis:names:tc:xacml:2.0:data-type:ipAddress
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A2$2E0$3Adata_$2D_type$3A__ipAddress,
  /**
   * urn:oasis:names:tc:xacml:2.0:data-type:dnsName
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A2$2E0$3Adata_$2D_type$3A__dnsName, RequestType, ContentType;

  public <R> R apply(String input) {// todo: should be abstract with 100% implementation above.
    throw new UnsupportedOperationException();
  }

  public String token() {
    return Xacml3.token(this);
  }

  static public XacmlDataType from(String key) {
    return Xacml3.from(key, XacmlDataType.class);
  }

}
