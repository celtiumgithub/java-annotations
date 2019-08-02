package uk.celtium.annotations.documentation;

import java.lang.annotation.*;

/**
 * Functionality annotated with ReplaceWith should be replaced immediately
 * with the mentioned code fragment. This is often used for things like naming changes.
 *
 * Example:
 *
 * Deprecated Method: getUnlocalizedName
 * New Method: getTranslationKey
 *
 * Apply this to getUnlocalizedName: @ReplaceWith("getTranslationKey")
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})
public @interface ReplaceWith
{
    String value();
}