package specified;

import com.google.common.base.Joiner;

import java.net.URLDecoder;
import java.util.LinkedHashMap;
import java.util.Map;

import static java.util.Arrays.asList;

public enum XacmlStatusCodes {
  /**
   * urn:oasis:names:tc:xacml:1.0:status:ok
   */urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Astatus$3A__ok,
/**
   * urn:oasis:names:tc:xacml:1.0:status:missing-attribute
   */urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Astatus$3A__missing_$2D_attribute,
/**
   * urn:oasis:names:tc:xacml:1.0:status:syntax-error
   */urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Astatus$3A__syntax_$2D_error,
/**
   * urn:oasis:names:tc:xacml:1.0:status:processing-error
   */urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Astatus$3A__processing_$2D_error;

  public final String token = URLDecoder.decode(name().replace("_", "").replace('$', '%'));

  public static class Registry {
    public static final Map<String, Enum> tokens = new LinkedHashMap<>();

    static {
      asList(values()).stream().forEach(f -> tokens.put(f.token, f));
    }

    public static void main(String[] args) {
      System.out.println("/**" + Joiner.on(",\n/**").withKeyValueSeparator(" */ ").join(tokens));
    }
  }
}
