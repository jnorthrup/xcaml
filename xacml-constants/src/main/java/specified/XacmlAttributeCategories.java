package specified;

import java.net.URLDecoder;
import java.util.LinkedHashMap;

import static java.util.Arrays.asList;

public
enum XacmlAttributeCategories{
  
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A3$2E0$3Aattribute_$2D_category$3A__resource,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A3$2E0$3Aattribute_$2D_category$3A__action,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A3$2E0$3Aattribute_$2D_category$3A__environment,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Asubject_$2D_category$3A__access_$2D_subject,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Asubject_$2D_category$3A__recipient_$2D_subject,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Asubject_$2D_category$3A__intermediary_$2D_subject,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Asubject_$2D_category$3A__codebase,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Asubject_$2D_category$3A__requesting_$2D_machine,;

  public final String token = URLDecoder.decode(name().replace("_","").replace('$', '%'));

  static class Registry {

    public static final LinkedHashMap<String, Enum> tokens = new LinkedHashMap<>();

    static {
      asList(values()).stream().forEach(f->tokens.put(f.token,f));
    }
  }

}
