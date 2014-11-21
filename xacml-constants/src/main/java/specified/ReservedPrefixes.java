package specified;

import java.net.URLDecoder;
import java.util.LinkedHashMap;
import java.util.Map;

import static java.util.Arrays.asList;

public
enum ReservedPrefixes{urn$3Aoasis$3Anames$3Atc$3Axacml$3A3$2E0,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A2$2E0,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A2$2E0$3Aconformance$2Dtest,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A2$2E0$3Acontext,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A2$2E0$3Aexample,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Afunction,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A2$2E0$3Afunction,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A2$2E0$3Apolicy,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Asubject,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Aresource,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Aaction,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Aenvironment,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Astatus
  ,;
  public final String token = URLDecoder.decode(name().replace("_","").replace('$', '%'));

  public static class Registry {
    public static final Map<String, Enum> tokens = new LinkedHashMap<>();

    static {
      asList(values()).stream().forEach(f->tokens.put(f.token,f));
    }
  }
}

