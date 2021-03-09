package contacts.engine;

import contacts.common.UserInterface;
import contacts.entity.PhoneBook;
import contacts.module.ModuleRegistry;

public class Engine {

    private static final String ENTER_ACTION = "Enter action (add, remove, edit, count, list, exit):";

    private final PhoneBook phoneBook;
    private final UserInterface userInterface;

    public Engine(PhoneBook phoneBook, UserInterface userInterface) {
        this.phoneBook = phoneBook;
        this.userInterface = userInterface;
    }


    public void start() {
        String userInput;
        while (!"exit".equals(userInput = userInterface.read(ENTER_ACTION))) {
            ModuleRegistry.findByName(userInput).init(phoneBook, userInterface).start();
        }

    }
}
