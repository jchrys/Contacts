package contacts.module;

import contacts.common.UserInterface;
import contacts.entity.PhoneBook;

public class CountModule implements Module {

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
        this.userInterface.printf("The Phone Book has %d records.", phoneBook.count());
    }

}
