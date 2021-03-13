package contacts.common;

import java.util.Scanner;

public class UserInterfaceImpl implements UserInterface {

    private final Scanner scanner;

    public UserInterfaceImpl() {
        this.scanner = new Scanner(System.in);
    }


    @Override
    public String read(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }

    @Override
    public void printf(String format, Object... args) {
        System.out.printf(format, args);
    }
}
