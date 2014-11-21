package specified;

import java.net.URLDecoder;
import java.util.LinkedHashMap;
import java.util.Map;

import static java.util.Arrays.asList;

public enum XacmlCombiningAlgorithms {
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A3$2E0$3Arule_$2D_combining_$2D_algorithm$3Adeny_$2D_overrides,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A3$2E0$3Apolicy_$2D_combining_$2D_algorithm$3Adeny_$2D_overrides,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A3$2E0$3Arule_$2D_combining_$2D_algorithm$3Apermit_$2D_overrides,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A3$2E0$3Apolicy_$2D_combining_$2D_algorithm$3Apermit_$2D_overrides,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Arule_$2D_combining_$2D_algorithm$3Afirst_$2D_applicable,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Apolicy_$2D_combining_$2D_algorithm$3Afirst_$2D_applicable,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Apolicy_$2D_combining_$2D_algorithm$3Aonly_$2D_one_$2D_applicable,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A3$2E0$3Arule_$2D_combining_$2D_algorithm$3Aordered_$2D_deny_$2D_overrides,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A3$2E0$3Apolicy_$2D_combining_$2D_algorithm$3Aordered_$2D_deny_$2D_overrides,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A3$2E0$3Arule_$2D_combining_$2D_algorithm$3Aordered_$2D_permit_$2D_overrides,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A3$2E0$3Apolicy_$2D_combining_$2D_algorithm$3Aordered_$2D_permit_$2D_overrides,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A3$2E0$3Arule_$2D_combining_$2D_algorithm$3Adeny_$2D_unless_$2D_permit,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A3$2E0$3Arule_$2D_combining_$2D_algorithm$3Apermit_$2D_unless_$2D_deny,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A3$2E0$3Apolicy_$2D_combining_$2D_algorithm$3Adeny_$2D_unless_$2D_permit,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A3$2E0$3Apolicy_$2D_combining_$2D_algorithm$3Apermit_$2D_unless_$2D_deny,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Arule_$2D_combining_$2D_algorithm$3Adeny_$2D_overrides,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Apolicy_$2D_combining_$2D_algorithm$3Adeny_$2D_overrides,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Arule_$2D_combining_$2D_algorithm$3Apermit_$2D_overrides,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Apolicy_$2D_combining_$2D_algorithm$3Apermit_$2D_overrides,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E1$3Arule_$2D_combining_$2D_algorithm$3Aordered_$2D_deny_$2D_overrides,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E1$3Apolicy_$2D_combining_$2D_algorithm$3Aordered_$2D_deny_$2D_overrides,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E1$3Arule_$2D_combining_$2D_algorithm$3Aordered_$2D_permit_$2D_overrides,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E1$3Apolicy_$2D_combining_$2D_algorithm$3Aordered_$2D_permit_$2D_overrides,;
  ;
  public final String token = URLDecoder.decode(name().replace("_","").replace('$', '%'));

  public static class Registry {
    public static final Map<String, Enum<XacmlCombiningAlgorithms>> tokens = new LinkedHashMap<String, Enum<XacmlCombiningAlgorithms>>();

    static {
      asList(values()).stream().forEach(f -> tokens.put(f.token, f));
    }
  }

}

