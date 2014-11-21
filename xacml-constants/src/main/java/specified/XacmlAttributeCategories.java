package specified;

import java.net.URLDecoder;
import java.util.LinkedHashMap;

import static java.util.Arrays.asList;

public
enum XacmlAttributeCategories{
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A3$2E0$3Aattribute$2Dcategory$3Aresource,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A3$2E0$3Aattribute$2Dcategory$3Aaction,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A3$2E0$3Aattribute$2Dcategory$3Aenvironment,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Asubject$2Dcategory$3Aaccess$2Dsubject,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Asubject$2Dcategory$3Arecipient$2Dsubject,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Asubject$2Dcategory$3Aintermediary$2Dsubject,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Asubject$2Dcategory$3Acodebase,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Asubject$2Dcategory$3Arequesting$2Dmachine,;

  public final String token = URLDecoder.decode(name().replace("_","").replace('$', '%'));

  static class Registry {

    public static final LinkedHashMap<String, Enum> tokens = new LinkedHashMap<>();

    static {
      asList(values()).stream().forEach(f->tokens.put(f.token,f));
    }
  }

}
