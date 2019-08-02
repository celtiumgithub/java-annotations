package uk.celtium.annotations.documentation;

import java.lang.annotation.*;

/**
 * Functionality annotated with Incubating might change in a future release. Basically means "Under heavy development, treat it as such"
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.CONSTRUCTOR})
public @interface Incubating
{

}