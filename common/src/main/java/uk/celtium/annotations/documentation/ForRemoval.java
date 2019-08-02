package uk.celtium.annotations.documentation;

import java.lang.annotation.*;

/**
 * Functionality annotated with ForRemoval will no longer be supported
 * and should not be used anymore in new code.
 *
 * Basically a more extreme version of @Deprecated / @DeprecatedSince.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})
public @interface ForRemoval
{

}