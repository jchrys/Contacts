package contacts.command;

import contacts.entity.PhoneBook;
import contacts.util.UIConstants;
import contacts.util.UIUtil;

public class Remove implements Command {
    private PhoneBook phoneBook;

    public Remove(PhoneBook phoneBook) {
        this.phoneBook = phoneBook;
    }


    @Override
    public void execute() {
        if (phoneBook.isEmpty()) {
            UIUtil.println(UIConstants.NO_RECORDS_TO_REMOVE);
        }
    }
}
