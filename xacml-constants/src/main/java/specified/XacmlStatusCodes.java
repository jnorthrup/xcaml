package specified;

import java.net.URLDecoder;
import java.util.LinkedHashMap;
import java.util.Map;

import static java.util.Arrays.asList;

public
enum XacmlStatusCodes{urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Astatus$3Aok,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Astatus$3Amissing$2Dattribute,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Astatus$3Asyntax$2Derror,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Astatus$3Aprocessing$2Derror,
  ;

  public final String token = URLDecoder.decode(name().replace('$', '%'));

  public static class Registry {
    public static final Map<String, Enum> tokens = new LinkedHashMap<>();

    static {
      asList(values()).stream().forEach(f->tokens.put(f.token,f));
    }
  }

}
