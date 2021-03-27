package contacts.command;

import contacts.command.entity.CommandContext;
import contacts.entity.PhoneBook;
import contacts.util.UIUtil;

public class Record implements Command, PhoneBookHolder, IndexHolder {
    private PhoneBook phoneBook;
    private int idx;

    @Override
    public CommandContext execute() {
        UIUtil.println(phoneBook.getInfo(idx));
        return CommandContext.of(UIUtil.getAction("record", "edit", "delete", "menu"), idx);
    }

    @Override
    public void setIndex(int idx) {
        this.idx = idx;
    }

    @Override
    public void setPhoneBook(PhoneBook phoneBook) {
        this.phoneBook = phoneBook;
    }
}
