package specified;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This defines {@link  specified.XacmlFunctionProto#apply(Object...)} parameters and return types in terms of {@link specified.XacmlDataType} placeholders. 
 * <p/>
 * runtime validation uses this to determine well formed {@link oasis.names.tc.xacml._3_0.core.schema.wd_17.AttributeAssignmentType#dataType}
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface XacmlSignature {
    /**
     * return value of the xacml function for the parent context.  defaults to boolean     
     */
    XacmlDataType returns() default XacmlDataType.http$3A$2F$2Fwww$2Ew3$2Eorg$2F2001$2FXMLSchema$23__boolean;

    /**
     *an array of {@link XacmlDataType} passed in.
     *
     */
    XacmlDataType[] value();
}
// needs en1.getClass().getField(((Enum)en1).name()).getAnnotations(); to crack
