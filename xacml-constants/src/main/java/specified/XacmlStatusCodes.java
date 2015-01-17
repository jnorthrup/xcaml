package specified;

public enum XacmlStatusCodes {
  /**
   * urn:oasis:names:tc:xacml:1.0:status:ok
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Astatus$3A__ok,
  /**
   * urn:oasis:names:tc:xacml:1.0:status:missing-attribute
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Astatus$3A__missing_$2D_attribute,
  /**
   * urn:oasis:names:tc:xacml:1.0:status:syntax-error
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Astatus$3A__syntax_$2D_error,
  /**
   * urn:oasis:names:tc:xacml:1.0:status:processing-error
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Astatus$3A__processing_$2D_error;

  static public XacmlStatusCodes from(String key) {
    return Registrar.from(key, XacmlStatusCodes.class);
  }

  public String token() {
    return Registrar.token(this);
  }
}
