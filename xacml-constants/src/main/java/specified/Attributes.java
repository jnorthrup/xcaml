package specified;

import java.net.URLDecoder;
import java.util.LinkedHashMap;
import java.util.Map;

import static java.util.Arrays.asList;

public enum Attributes {
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Aenvironment$3Acurrent_$2D_time,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Aenvironment$3Acurrent_$2D_date,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Aenvironment$3Acurrent_$2D_dateTime,;
  public final String token = URLDecoder.decode(name().replace("_", "").replace('$', '%'));

  static public Attributes from(String key) {
    return Registrar.from(key, Attributes.class);

  }

  public String token() {
    return Registrar.token(this);
  }
}
