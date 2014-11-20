package specified;

import java.net.URLDecoder;
import java.util.LinkedHashMap;

import static java.util.Arrays.asList;

public
enum XacmlSubjectAttributes {urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Asubject$3Asubject$2Did,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Asubject$3Asubject$2Did$2Dqualifier,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Asubject$3Akey$2Dinfo,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Asubject$3Aauthentication$2Dtime,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Asubject$3Aauthentication$2Dmethod,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Asubject$3Arequest$2Dtime,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Asubject$3Asession$2Dstart$2Dtime,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A3$2E0$3Asubject$3Aauthn$2Dlocality$3Aip$2Daddress,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A3$2E0$3Asubject$3Aauthn$2Dlocality$3Adns$2Dname,;
  public final String token = URLDecoder.decode(name().replace('$', '%'));

  static class Registry {

    public static final LinkedHashMap<String, Enum> tokens = new LinkedHashMap<>();

    static {
      asList(values()).stream().forEach(f->tokens.put(f.token,f));
    }
  }
}
