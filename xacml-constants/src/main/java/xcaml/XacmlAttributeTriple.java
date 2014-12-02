package xcaml;

import com.google.auto.value.AutoValue;
import specified.XacmlDataType;

/**
 * Created by jim on 12/2/14.
 */
@AutoValue
public abstract class XacmlAttributeTriple {
  abstract String category();

  abstract String id();

  abstract XacmlDataType dataType();

  public static XacmlAttributeTriple create(String cat, String id, XacmlDataType dataType) {
    return new AutoValue_XacmlAttributeTriple(cat, id, dataType);
  }
}
