package specified;

public enum XacmlAttributeCategories {
  /**
   * urn:oasis:names:tc:xacml:3.0:attribute-category:resource
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A3$2E0$3Aattribute_$2D_category$3A__resource,
  /**
   * urn:oasis:names:tc:xacml:3.0:attribute-category:action
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A3$2E0$3Aattribute_$2D_category$3A__action,
  /**
   * urn:oasis:names:tc:xacml:3.0:attribute-category:environment
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A3$2E0$3Aattribute_$2D_category$3A__environment,
  /**
   * urn:oasis:names:tc:xacml:1.0:subject-category:access-subject
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Asubject_$2D_category$3A__access_$2D_subject,
  /**
   * urn:oasis:names:tc:xacml:1.0:subject-category:recipient-subject
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Asubject_$2D_category$3A__recipient_$2D_subject,
  /**
   * urn:oasis:names:tc:xacml:1.0:subject-category:intermediary-subject
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Asubject_$2D_category$3A__intermediary_$2D_subject,
  /**
   * urn:oasis:names:tc:xacml:1.0:subject-category:codebase
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Asubject_$2D_category$3A__codebase,
  /**
   * urn:oasis:names:tc:xacml:1.0:subject-category:requesting-machine
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Asubject_$2D_category$3A__requesting_$2D_machine;

  public String token() {
    return Registrar.token(this);
  }

  static public XacmlAttributeCategories from(String key) {
    return Registrar.from(key, XacmlAttributeCategories.class);
  }
}
