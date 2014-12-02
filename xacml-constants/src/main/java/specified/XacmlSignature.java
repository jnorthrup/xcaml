package specified;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * needs en1.getClass().getField(((Enum)en1).name()).getAnnotations(); to crack
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface XacmlSignature {
  XacmlDataType returns() default XacmlDataType.http$3A$2F$2Fwww$2Ew3$2Eorg$2F2001$2FXMLSchema$23__boolean;

  XacmlDataType[] value();
}
