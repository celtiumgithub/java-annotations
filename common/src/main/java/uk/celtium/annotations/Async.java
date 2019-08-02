package uk.celtium.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Helper annotations for asynchronous computation.
 * Used in DogeEdit's debugger for async stacktraces feature.
 */
public interface Async
{

    /**
     * Indicates that the marked method schedules async computation.
     * Scheduled object is either {@code this}, or the annotated parameter value.
     */
    @Retention(RetentionPolicy.CLASS)
    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.PARAMETER})
    @interface Schedule {}

    /**
     * Indicates that the marked method executes async computation.
     * Executed object is either {@code this}, or the annotated parameter value.
     * This object needs to match with the one annotated with {@link Schedule}
     */
    @Retention(RetentionPolicy.CLASS)
    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.PARAMETER})
    @interface Execute {}
}