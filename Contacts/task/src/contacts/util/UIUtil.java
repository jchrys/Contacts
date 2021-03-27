package contacts.util;

import java.util.Scanner;

public abstract class UIUtil {
    private UIUtil() {}

    public static String getLine(String message) {
        println(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static String getAction(String name, String... actions) {
        String message = String.format(UIConstants.ENTER_ACTION, name, String.join(", ", actions));
        return getLine(message);
    }

    public static void println(String message) {
        System.out.println(message);
    }
}
