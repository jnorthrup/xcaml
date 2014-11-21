package specified;

import java.net.URLDecoder;
import java.util.LinkedHashMap;
import java.util.Map;

import static java.util.Arrays.asList;

/**
 * Created by jim on 11/20/14.
 */
public enum XacmlActionAttributes {
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Aaction$3A__action_$2D_id,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Aaction$3A__implied_$2D_action,;

  public final String token = URLDecoder.decode(name().replace("_", "").replace('$', '%'));

  public static class Registry {
    public static final Map<String, Enum> tokens = new LinkedHashMap<>();

    static {
      asList(values()).stream().forEach(f -> tokens.put(f.token, f));
    }
  }
}
