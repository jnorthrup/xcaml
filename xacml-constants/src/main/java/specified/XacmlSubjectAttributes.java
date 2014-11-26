package specified;

public enum XacmlSubjectAttributes {

  /**
   * urn:oasis:names:tc:xacml:1.0:subject:subject-id
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Asubject$3A__subject_$2D_id,
  /**
   * urn:oasis:names:tc:xacml:1.0:subject:subject-id-qualifier
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Asubject$3A__subject_$2D_id_$2D_qualifier,
  /**
   * urn:oasis:names:tc:xacml:1.0:subject:key-info
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Asubject$3A__key_$2D_info,
  /**
   * urn:oasis:names:tc:xacml:1.0:subject:authentication-time
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Asubject$3A__authentication_$2D_time,
  /**
   * urn:oasis:names:tc:xacml:1.0:subject:authentication-method
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Asubject$3A__authentication_$2D_method,
  /**
   * urn:oasis:names:tc:xacml:1.0:subject:request-time
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Asubject$3A__request_$2D_time,
  /**
   * urn:oasis:names:tc:xacml:1.0:subject:session-start-time
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Asubject$3A__session_$2D_start_$2D_time,
  /**
   * urn:oasis:names:tc:xacml:3.0:subject:authn-locality:ip-address
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A3$2E0$3Asubject$3A__authn_$2D_locality$3Aip_$2D_address,
  /**
   * urn:oasis:names:tc:xacml:3.0:subject:authn-locality:dns-name
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A3$2E0$3Asubject$3A__authn_$2D_locality$3Adns_$2D_name;

  static public XacmlSubjectAttributes from(String key) {
    return Xacml3.from(key, XacmlSubjectAttributes.class);
  }

  public String token() {
    return Xacml3.token(this);
  }

}
