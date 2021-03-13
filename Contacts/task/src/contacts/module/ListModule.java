package contacts.module;

import contacts.common.UserInterface;
import contacts.entity.Contact;
import contacts.entity.PhoneBook;

public class ListModule implements Module {
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
        for (int i = 0; i < phoneBook.count(); ++i) {
            Contact contact = phoneBook.getAt(i);
            userInterface.printf("%d. %s, %s\n", i + 1, contact.getFullName(), contact.getPhoneNumber());
        }
    }
}
