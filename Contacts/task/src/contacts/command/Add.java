package contacts.command;

import contacts.entity.Contact;
import contacts.entity.PhoneBook;
import contacts.entity.factory.ContactFactory;
import contacts.util.UIConstants;
import contacts.util.UIUtil;

public class Add implements Command {
    private PhoneBook phoneBook;

    public Add(PhoneBook phoneBook) {
        this.phoneBook = phoneBook;
    }

    @Override
    public void execute() {
        ContactFactory contactFactory = new ContactFactory();
        Contact contact = contactFactory.create();
        phoneBook.add(contact);
        UIUtil.println(UIConstants.ADDED);
    }
}
