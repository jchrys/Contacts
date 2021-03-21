package contacts.util;

import java.util.Scanner;

public class UIUtil {
    private UIUtil() {}

    public static String getLine(String message) {
        println(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void println(String message) {
        System.out.println(message);
    }
}
