package specified;

/**
 * Created by jim on 11/20/14.
 */

public enum XacmlActionAttributes {
  /**
   * urn:oasis:names:tc:xacml:1.0:action:action-id
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Aaction$3A__action_$2D_id,
  /**
   * urn:oasis:names:tc:xacml:1.0:action:implied-action
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Aaction$3A__implied_$2D_action;

  public String token() {
    return Xacml3.token(this);
  }

  static public XacmlActionAttributes from(String key) {
    return Xacml3.from(key, XacmlActionAttributes.class);
  }
}
