package specified;

import java.net.URLDecoder;
import java.util.LinkedHashMap;
import java.util.Map;

import static java.util.Arrays.asList;

public
enum XacmlDataTypes {urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Aresource$3Aresource$2Did,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A2$2E0$3Aresource$3Atarget$2Dnamespace,
  ;

  public final String token = URLDecoder.decode(name().replace("_","").replace('$', '%'));

  public static class Registry {
    public static final Map<String, Enum> tokens = new LinkedHashMap<>();

    static {
      asList(values()).stream().forEach(f->tokens.put(f.token,f));
    }
  }
}