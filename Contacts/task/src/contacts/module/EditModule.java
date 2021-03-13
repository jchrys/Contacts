package contacts.module;

import contacts.common.UserInterface;
import contacts.entity.Contact;
import contacts.entity.ContactMessage;
import contacts.entity.PhoneBook;
import contacts.util.StringUtils;

public class EditModule implements Module {
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
            userInterface.printf("No records to edit!\n");
            return;
        }
        phoneBook.getAllContacts().forEach(userInterface::printf);
        int idx = Integer.parseInt(userInterface.read("Select a record:"));
        String field = userInterface.read("Select a field (name, surname, number):");
        String value = userInterface.read("Enter %s:", field);
        Contact contact = phoneBook.getAt(idx - 1);
        ContactMessage message = contact.editField(field, value);
        if (StringUtils.isNotEmpty(message.getMessage())) {
            userInterface.printf(message.getMessage() + "\n");
        }
        userInterface.printf("The record updated!\n");
    }
}
