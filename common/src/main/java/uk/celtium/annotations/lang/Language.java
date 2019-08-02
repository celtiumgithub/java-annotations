package uk.celtium.annotations.lang;

import uk.celtium.annotations.NonNls;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

@Retention(RetentionPolicy.CLASS)
@Target({ METHOD, FIELD, PARAMETER, LOCAL_VARIABLE, ANNOTATION_TYPE })

public @interface Language
{
    @NonNls String value();

    @NonNls String prefix() default "";
    @NonNls String suffix() default "";
}