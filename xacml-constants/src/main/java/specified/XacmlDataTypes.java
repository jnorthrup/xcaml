package specified;

import java.net.URLDecoder;

public enum XacmlDataTypes {
  /**
   * urn:oasis:names:tc:xacml:1.0:resource:resource-id
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Aresource$3A__resource_$2D_id,
  /**
   * urn:oasis:names:tc:xacml:2.0:resource:target-namespace
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A2$2E0$3Aresource$3A__target_$2D_namespace;
  public final String token = URLDecoder.decode(name().replace("_", "").replace('$', '%'));

  static public XacmlDataTypes from(String key) {
    return Xacml3.from(key, XacmlDataTypes.class);
  }

  public String token() {
    return Xacml3.token(this);
  }
}