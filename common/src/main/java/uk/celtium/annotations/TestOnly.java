package uk.celtium.annotations;

import java.lang.annotation.*;

/**
 * A method/constructor annotated with TestOnly claims that it should be called from testing code only.
 * <p>
 * Apart from documentation purposes this annotation is intended to be used by static analysis tools
 * to validate against element contract violations.
 */
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.TYPE})
public @interface TestOnly
{

}