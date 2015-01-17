package specified;

import java.lang.reflect.InvocationTargetException;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * a utility class to provide registries of uri mappings to xacml constant enums that use url/dollarsign encoded names.
 */
public class Registrar {
  static Map<Class<Enum<?>>, Map<String, Enum>> tokens = new LinkedHashMap<>();

  public static <T extends Enum<T>, C extends Class<T>> T from(String key, C c) {
        Map<String, Enum> stringEnumMap = tokens.computeIfAbsent((Class<Enum<?>>) c, enumClass -> {
            try {
                return Arrays.asList((T[]) enumClass.getMethod("values").invoke(null)).stream().collect(Collectors.toMap(e -> token(e), e -> e));
            } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
                System.err.println("not a mapped constant: "+key);
            }
            return null;
        });
        return (T) stringEnumMap.get(key);
    }

  public static <T extends Enum<T>> String token(T e) {
    return URLDecoder.decode(e.name().replace("_", "").replace('$', '%'));
  }
}
