package specified;

import java.net.URLDecoder;
import java.util.EnumMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static java.util.Arrays.asList;

/**
 * Created by jim on 11/20/14.
 */
enum XacmlResolution {
  Indeterminate$7BD$7D(),
  Indeterminate$7BP$7D(),
  Indeterminate$7BDP$7D(),
  Indeterminate(),
  Deny(),
  Permit(),
  NotApplicable(),;
  ;
  public final String token = URLDecoder.decode(name().replace("_","").replace('$', '%'));

  public static class Subsumption {
    public static Map resolution = new EnumMap(XacmlResolution.class) {
      {
        put(NotApplicable, NotApplicable);
        put(Permit, Indeterminate$7BP$7D);
        put(Deny, Indeterminate$7BD$7D);
        put(Indeterminate, Indeterminate$7BDP$7D);
        put(Indeterminate$7BDP$7D, Indeterminate$7BDP$7D);
        put(Indeterminate$7BP$7D, Indeterminate$7BP$7D);
        put(Indeterminate$7BD$7D, Indeterminate$7BD$7D);
      }
    };
  }

  public static class Registry {
    public static final Map<String, Enum<XacmlResolution>> tokens = new LinkedHashMap<String, Enum<XacmlResolution>>();

    static {
      asList(values()).stream().forEach(f -> tokens.put(f.token, f));
    }
  }
}
