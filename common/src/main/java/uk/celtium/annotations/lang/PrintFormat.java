package uk.celtium.annotations.lang;

@Pattern(PrintFormatPattern.PRINT_FORMAT)
public @interface PrintFormat
{

}

class PrintFormatPattern
{

    // %[argument_index$][flags][width][.precision]conversion

    // Expression is taken from java.util.Formatter.fsPattern

    @Language("RegExp")
    private static final String ARG_INDEX = "(?:\\d+\\$)?";
    @Language("RegExp")
    private static final String FLAGS = "(?:[-#+ 0,(<]*)?";
    @Language("RegExp")
    private static final String WIDTH = "(?:\\d+)?";
    @Language("RegExp")
    private static final String PRECISION = "(?:\\.\\d+)?";
    @Language("RegExp")
    private static final String CONVERSION = "(?:[tT])?(?:[a-zA-Z%])";
    @Language("RegExp")
    private static final String TEXT = "[^%]|%%";

    @Language("RegExp")
    static final String PRINT_FORMAT = "(?:" + TEXT + "|" +
              "(?:%" +
              ARG_INDEX +
              FLAGS +
              WIDTH +
              PRECISION +
              CONVERSION + ")" +
              ")*";
}