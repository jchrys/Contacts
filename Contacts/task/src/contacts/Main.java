package contacts;

import contacts.common.UserInterface;
import contacts.common.UserInterfaceImpl;
import contacts.engine.Engine;
import contacts.entity.PhoneBook;

public class Main {

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        UserInterface userInterface = new UserInterfaceImpl();

        Engine engine = new Engine(phoneBook, userInterface);

        engine.start();
    }
}
