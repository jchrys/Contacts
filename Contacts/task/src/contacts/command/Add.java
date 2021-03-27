package contacts.command;

import contacts.command.entity.CommandContext;
import contacts.entity.Contact;
import contacts.entity.PhoneBook;
import contacts.entity.factory.ContactFactory;
import contacts.util.UIConstants;
import contacts.util.UIUtil;

public class Add implements Command, PhoneBookHolder {
    private PhoneBook phoneBook;

    @Override
    public CommandContext execute() {
        ContactFactory contactFactory = new ContactFactory();
        Contact contact = contactFactory.create();
        phoneBook.add(contact);
        UIUtil.println(UIConstants.ADDED);
        return CommandContext.of("menu");
    }

    @Override
    public void setPhoneBook(PhoneBook phoneBook) {
        this.phoneBook = phoneBook;
    }
}
