package specified;

import java.net.URLDecoder;
import java.util.LinkedHashMap;
import java.util.Map;

import static java.util.Arrays.asList;

public enum ReservedPrefixes {
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A3$2E0,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A2$2E0,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A2$2E0$3A__conformance$2Dtest,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A2$2E0$3A__context,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A2$2E0$3A__example,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3A__function,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A2$2E0$3A__function,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A2$2E0$3A__policy,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3A__subject,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3A__resource,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3A__action,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3A__environment,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3A__status,;
  public final String token = URLDecoder.decode(name().replace("_", "").replace('$', '%'));

  public static class Registry {
    public static final Map<String, Enum> tokens = new LinkedHashMap<>();

    static {
      asList(values()).stream().forEach(f -> tokens.put(f.token, f));
    }
  }
}

