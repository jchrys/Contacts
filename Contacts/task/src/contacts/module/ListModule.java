package contacts.module;

import contacts.common.UserInterface;
import contacts.entity.Contact;
import contacts.entity.PhoneBook;

import java.util.stream.Collectors;

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
        phoneBook.getAllContacts()
                .forEach(userInterface::printf);
    }
}
