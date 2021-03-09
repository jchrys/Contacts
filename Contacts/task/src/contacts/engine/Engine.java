package contacts.engine;

import contacts.common.UserInputReader;
import contacts.entity.PhoneBook;
import contacts.module.ModuleRegistry;

public class Engine {

    private static final String ENTER_ACTION = "Enter action (add, remove, edit, count, list, exit):";

    private final PhoneBook phoneBook;
    private final UserInputReader userInputReader;

    public Engine(PhoneBook phoneBook, UserInputReader userInputReader) {
        this.phoneBook = phoneBook;
        this.userInputReader = userInputReader;
    }


    public void start() {
        String userInput;
        while (!"exit".equals(userInput = userInputReader.read(ENTER_ACTION))) {
            ModuleRegistry.findByName(userInput).init(phoneBook, userInputReader).start();
        }

    }
}
