package contacts.module;

import contacts.common.UserInterface;
import contacts.entity.PhoneBook;

public class RemoveModule implements Module{
    private PhoneBook phoneBook;
    private UserInterface userInterface;

    @Override
    public Module init(PhoneBook phoneBook, UserInterface userInterface) {
        this.phoneBook = phoneBook;
        this.userInterface = userInterface;
        return this;
    }

    @Override
    public void start() {
        if (phoneBook.count() == 0) {
            userInterface.printf("No records to remove!\n");
            return;
        }
        phoneBook.getAllContacts().forEach(userInterface::printf);
        int idx = Integer.parseInt(userInterface.read("Select a record:"));
        phoneBook.removeAt(idx - 1);
        userInterface.printf("The record removed!\n");
    }
}
