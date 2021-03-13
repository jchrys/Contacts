package contacts.util;

public class StringUtils {
    private StringUtils() {
    }

    public static boolean isNotEmpty(String  string) {
        return !isEmpty(string);
    }

    public static boolean isEmpty(String string) {
        return null == string || string.length() == 0;
    }
}
