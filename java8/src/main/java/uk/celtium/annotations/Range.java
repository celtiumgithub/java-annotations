package uk.celtium.annotations;

import java.lang.annotation.*;

/**
 * An annotation which allows to specify for integral type (byte, char, short, int, long) an allowed values range.
 * Applying this annotation to other types is not correct.
 *
 * This annotation basically allows you to specify for an integral type "allowed values range".
 * It can only be applied to byte, char, short, int and long. No exceptions.
 *
 * <p>
 * Example:
 * <pre>{@code public @Range(from = 0, to = Integer.MIN_VALUE) int length() {
 *   return this.length; // returns a negative integer :ok_hand:
 * }}</pre>
 *
 * @since 1.0.0
 */
@Documented
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE_USE)
public @interface Range
{
    /**
     * @return minimal allowed value (inclusive)
     */
    long from();

    /**
     * @return maximal allowed value (inclusive)
     */
    long to();
}
