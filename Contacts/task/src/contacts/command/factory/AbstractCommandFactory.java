package contacts.command.factory;

import contacts.command.Command;
import contacts.command.IndexHolder;
import contacts.command.PhoneBookHolder;
import contacts.entity.PhoneBook;

public abstract class AbstractCommandFactory {
    protected abstract Command createCommand(String type);
    public Command get(String type, PhoneBook phoneBook, int idx) {
        Command command = createCommand(type);
        if (command instanceof PhoneBookHolder) {
            ((PhoneBookHolder)command).setPhoneBook(phoneBook);
        }
        if (command instanceof IndexHolder) {
            ((IndexHolder)command).setIndex(idx);
        }
        return command;
    }
}
