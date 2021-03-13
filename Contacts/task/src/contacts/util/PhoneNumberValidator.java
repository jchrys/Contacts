package contacts.util;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValidator {
    private PhoneNumberValidator() {
    }

    private static String regex = "[+]?([a-zA-Z0-9]+([- ]([a-zA-Z0-9]){2,})?|\\([a-zA-Z0-9]+\\)([- ]([a-zA-Z0-9]){2,})?|([a-zA-Z0-9])+([- ]\\(([a-zA-Z0-9]){2,}\\))?)([ -][a-zA-Z0-9]{2,})*";
    private static Pattern pattern = Pattern.compile(regex);

    public static boolean isValid(String number) {
        Matcher matcher = pattern.matcher(number);
        return matcher.matches();
    }
}
