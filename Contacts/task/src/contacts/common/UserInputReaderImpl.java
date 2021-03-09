package contacts.common;

import java.util.Scanner;

public class UserInputReaderImpl implements UserInputReader {

    private final Scanner scanner;

    public UserInputReaderImpl() {
        this.scanner = new Scanner(System.in);
    }


    @Override
    public String read(String prompt) {
        System.out.println(prompt);
        return scanner.next();
    }
}
