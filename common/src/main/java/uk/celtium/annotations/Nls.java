package uk.celtium.annotations;

import java.lang.annotation.*;

/**
 * Specifies that an element of the program is an user-visible string which needs to be localized.
 * This annotation is intended to be used by localization tools for
 * detecting strings which should be reported as requiring localization.
 *
 * @see NonNls
 */
@Documented
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE, ElementType.PACKAGE})
public @interface Nls
{

    enum Capitalization
    {

        NotSpecified,
        /**
         * e.g. This Is a Title
         */
        Title,
        /**
         * e.g. This is a sentence
         */
        Sentence
    }

    Capitalization capitalization() default Capitalization.NotSpecified;
}