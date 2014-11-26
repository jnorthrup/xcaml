package specified;

/**
 * Created by jim on 11/20/14.
 */
enum XacmlResolution {
  Indeterminate$7B__D__$7D(), Indeterminate$7B__P__$7D(), Indeterminate$7B__DP__$7D(), Indeterminate(), Deny(), Permit(), NotApplicable();
  static public XacmlResolution from(String key) {
    return Xacml3.from(key, XacmlResolution.class);
  }

  public String token() {
    return Xacml3.token(this);
  }
}
