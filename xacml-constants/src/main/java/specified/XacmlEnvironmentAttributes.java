package specified;

/**
 * Created by jim on 11/20/14.
 */
public enum XacmlEnvironmentAttributes {
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Aenvironment$3Acurrent_$2D_time, urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Aenvironment$3Acurrent_$2D_date, urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Aenvironment$3Acurrent_$2D_dateTime, ;

  static public XacmlEnvironmentAttributes from(String key) {
    return Xacml3.from(key, XacmlEnvironmentAttributes.class);
  }

  public String token() {
    return Xacml3.token(this);
  }
}
