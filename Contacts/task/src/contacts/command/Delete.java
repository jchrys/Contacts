package contacts.command;

import contacts.command.entity.CommandContext;
import contacts.entity.PhoneBook;

public class Delete implements Command, PhoneBookHolder, IndexHolder {
    private PhoneBook phoneBook;
    private int idx;

    @Override
    public CommandContext execute() {
        phoneBook.remove(idx);
        return CommandContext.of("menu");
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
