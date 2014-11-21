package specified;

import java.net.URLDecoder;
import java.util.LinkedHashMap;

import static java.util.Arrays.asList;

public enum XacmlSubjectAttributes {
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Asubject$3A__subject_$2D_id,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Asubject$3A__subject_$2D_id_$2D_qualifier,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Asubject$3A__key_$2D_info,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Asubject$3A__authentication_$2D_time,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Asubject$3A__authentication_$2D_method,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Asubject$3A__request_$2D_time,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Asubject$3A__session_$2D_start_$2D_time,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A3$2E0$3Asubject$3A__authn_$2D_locality$3Aip_$2D_address,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A3$2E0$3Asubject$3A__authn_$2D_locality$3Adns_$2D_name,;
  public final String token = URLDecoder.decode(name().replace("_", "").replace('$', '%'));

  static class Registry {

    public static final LinkedHashMap<String, Enum> tokens = new LinkedHashMap<>();

    static {
      asList(values()).stream().forEach(f -> tokens.put(f.token, f));
    }
  }
}
