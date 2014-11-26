package specified;

import com.google.auto.value.AutoValue;

/**
 * Created by jim on 11/25/14.
 */
@AutoValue
abstract public class Rfc822Name {

  static public Rfc822Name create(String in) {
    String[] split = in.split("@", 2);
    return new AutoValue_Rfc822Name(split[0], split[1]);
  }

  public abstract String name();

  public abstract String domain();
}
