package specified;

import com.google.common.base.Joiner;

import java.net.URLDecoder;
import java.util.LinkedHashMap;
import java.util.Map;

import static java.util.Arrays.asList;

/**
 * Created by jim on 11/20/14.
 */

public enum XacmlActionAttributes {
  /**
   * urn:oasis:names:tc:xacml:1.0:action:action-id
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Aaction$3A__action_$2D_id,
  /**
   * urn:oasis:names:tc:xacml:1.0:action:implied-action
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Aaction$3A__implied_$2D_action;

  public final String token = URLDecoder.decode(name().replace("_", "").replace('$', '%'));

  public XacmlActionAttributes from(String key) {
    return Registry.tokens.get(key);
  }


  public static class Registry {
    public static final Map<String, XacmlActionAttributes> tokens = new LinkedHashMap<>();

    static {
      asList(values()).stream().forEach(f -> {
        tokens.put(f.token, f);
      });
    }
    public static void main(String[] args) {
      System.out.println("/**" + Joiner.on(",\n/**").withKeyValueSeparator(" */ ").join(tokens));
    }
  }

}
