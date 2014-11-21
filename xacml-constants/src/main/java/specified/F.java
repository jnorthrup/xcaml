package specified;

/**
 * Created by jn218y on 10/30/14.
 */
public interface F<T>
{

    default T apply(Object[] objects){throw new UnsupportedOperationException("function not implemented");};
}
