package specified;

import java.net.URLDecoder;
import java.util.LinkedHashMap;
import java.util.Map;

import static java.util.Arrays.asList;

public enum Attributes{urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Aenvironment$3Acurrent$2Dtime,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Aenvironment$3Acurrent$2Ddate,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Aenvironment$3Acurrent$2DdateTime,
  ;  public final String token = URLDecoder.decode(name().replace('$', '%'));

  public static class Registry {
    public static final Map<String, Enum> tokens = new LinkedHashMap<>();

    static {
      asList(values()).stream().forEach(f->tokens.put(f.token,f));
    }
  }
}
