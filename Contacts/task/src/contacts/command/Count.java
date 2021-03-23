package contacts.command;

import contacts.entity.PhoneBook;
import contacts.util.UIUtil;

public class Count implements Command {
    private PhoneBook phoneBook;

    public Count(PhoneBook phoneBook) {
        this.phoneBook = phoneBook;
    }

    @Override
    public void execute() {
        UIUtil.println("" + phoneBook.size() + " records.");
    }
}
