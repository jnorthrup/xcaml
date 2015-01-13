package specified;

import java.util.Collection;
import java.util.stream.Stream;

/**
 * Created by jn218y on 10/30/14.
 */
public interface F
{

    default <T> T apply(Object... objects){throw new UnsupportedOperationException("function not implemented");};
    default <T>T apply(Stream objects){return apply(objects.toArray());};
    default <T>T apply(Collection objects){return apply(objects.toArray());};
}
