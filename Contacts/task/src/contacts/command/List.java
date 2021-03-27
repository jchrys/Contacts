package contacts.command;

import contacts.command.entity.CommandContext;
import contacts.entity.PhoneBook;
import contacts.util.UIUtil;

public class List implements Command, PhoneBookHolder {
    private PhoneBook phoneBook;

    @Override
    public CommandContext execute() {
        UIUtil.println(phoneBook.list());
        String action = UIUtil.getAction("list", "[number]", "back");
        if ("back".equals(action)) {
            return CommandContext.of("menu");
        }
        int idx = Integer.parseInt(action) - 1;
        return CommandContext.of("record", idx);
    }

    @Override
    public void setPhoneBook(PhoneBook phoneBook) {
        this.phoneBook = phoneBook;
    }
}
