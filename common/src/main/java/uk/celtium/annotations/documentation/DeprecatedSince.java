package uk.celtium.annotations.documentation;

import java.lang.annotation.*;

/**
 * In combination with {@link Deprecated} specifies when this feature was marked as deprecated.
 *
 * Example: @DeprecatedSince("1.4.2")
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})
public @interface DeprecatedSince
{
    String value();
}