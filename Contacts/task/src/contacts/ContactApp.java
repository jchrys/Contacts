package contacts;

import contacts.command.Command;
import contacts.command.Menu;
import contacts.command.entity.CommandContext;
import contacts.command.factory.CommandFactory;
import contacts.entity.PhoneBook;
import contacts.invoker.Invoker;
import contacts.util.UIUtil;

public class ContactApp {
    public void start() {
        Invoker invoker = new Invoker();
        PhoneBook phoneBook = new PhoneBook();
        CommandFactory commandFactory = new CommandFactory();
        Command command = commandFactory.get("menu", phoneBook, 0);

        while (command != null) {
            invoker.setCommand(command);
            if (command instanceof Menu) {
                UIUtil.println("");
            }
            CommandContext commandContext = invoker.execute();
            command = commandFactory.get(commandContext.getType(), phoneBook, commandContext.getIndex());
        }
    }
}
