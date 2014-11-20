package specified;

import java.util.function.Function;

/**
 * Created by jn218y on 10/30/14.
 */
public interface F<T> extends Function<Object[],T> {
    @Override
    default T apply(Object[] objects){throw new UnsupportedOperationException("function not implemented");};
}
