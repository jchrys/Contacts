package contacts.util;

public abstract class StringUtils {
    public static final String NEW_LINE = "\n";
    public static final String NO_DATA = "[no data]";

    private StringUtils() {
    }

    public static boolean isNotEmpty(String  string) {
        return !isEmpty(string);
    }

    public static boolean isEmpty(String string) {
        return null == string || string.length() == 0;
    }
}
