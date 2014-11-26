package specified;

import java.net.URLDecoder;
import java.util.LinkedHashMap;
import java.util.Map;

import static java.util.Arrays.asList;

/**
 * Created by jim on 11/20/14.
 */
enum XacmlResolution {
  Indeterminate$7B__D__$7D(),
  Indeterminate$7B__P__$7D(),
  Indeterminate$7B__DP__$7D(),
  Indeterminate(),
  Deny(),
  Permit(),
  NotApplicable()
  ;
  public final String token = URLDecoder.decode(name().replace("_", "").replace('$', '%'));


  public static class Registry {
    public static final Map<String, Enum<XacmlResolution>> tokens = new LinkedHashMap<String, Enum<XacmlResolution>>();

    static {
      asList(values()).stream().forEach(f -> tokens.put(f.token, f));
    }
  }
}
