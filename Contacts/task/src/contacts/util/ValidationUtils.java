package contacts.util;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class ValidationUtils {
    private ValidationUtils() {
    }

    private static String regex = "[+]?([a-zA-Z0-9]+([- ]([a-zA-Z0-9]){2,})?|\\([a-zA-Z0-9]+\\)([- ]([a-zA-Z0-9]){2,})?|([a-zA-Z0-9])+([- ]\\(([a-zA-Z0-9]){2,}\\))?)([ -][a-zA-Z0-9]{2,})*";
    private static Pattern pattern = Pattern.compile(regex);

    public static boolean isValidNumber(String number) {
        Matcher matcher = pattern.matcher(number);
        return matcher.matches();
    }

    public static boolean isValidGender(String gender) {
        return "M".equals(gender) || "F".equals(gender);
    }
}
