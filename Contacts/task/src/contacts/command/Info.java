package contacts.command;

import contacts.entity.PhoneBook;
import contacts.util.UIConstants;
import contacts.util.UIUtil;

public class Info implements Command {
    private PhoneBook phoneBook;

    public Info(PhoneBook phoneBook) {
        this.phoneBook = phoneBook;
    }


    @Override
    public void execute() {
        UIUtil.println(phoneBook.list());
        String idxString = UIUtil.getLine(UIConstants.ENTER_INDEX);
        int idx = Integer.parseInt(idxString) - 1;
        UIUtil.println(phoneBook.getInfo(idx));
    }
}
