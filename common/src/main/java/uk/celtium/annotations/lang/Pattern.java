package uk.celtium.annotations.lang;

import static java.lang.annotation.ElementType.*;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ METHOD, FIELD, PARAMETER, LOCAL_VARIABLE, ANNOTATION_TYPE })
public @interface Pattern
{
    @Language("RegExp")
    String value();
}