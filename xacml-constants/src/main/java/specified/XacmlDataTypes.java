package specified;

import com.google.common.base.Joiner;

import java.net.URLDecoder;
import java.util.LinkedHashMap;
import java.util.Map;

import static java.util.Arrays.asList;

public enum XacmlDataTypes {
  /**
   * urn:oasis:names:tc:xacml:1.0:resource:resource-id
   */urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Aresource$3A__resource_$2D_id,
  /**
   * urn:oasis:names:tc:xacml:2.0:resource:target-namespace
   */urn$3Aoasis$3Anames$3Atc$3Axacml$3A2$2E0$3Aresource$3A__target_$2D_namespace;
  public final String token = URLDecoder.decode(name().replace("_", "").replace('$', '%'));

  public XacmlDataTypes from(String key) {
    return Registry.tokens.get(key);
  }

  public static class Registry {
    public static final Map<String, XacmlDataTypes> tokens = new LinkedHashMap<>();

    static { asList(values()).stream().forEach(f -> tokens.put(f.token, f)); }

    public static void main(String[] args) {
      System.out.println("/**" + Joiner.on(",\n/**").withKeyValueSeparator(" */ ").join(tokens));
    }
  }

}