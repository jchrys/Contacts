package contacts;

import contacts.common.UserInputReader;
import contacts.common.UserInputReaderImpl;
import contacts.engine.Engine;
import contacts.entity.PhoneBook;

public class Main {

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        UserInputReader userInputReader = new UserInputReaderImpl();

        Engine engine = new Engine(phoneBook, userInputReader);

        engine.start();
    }
}
