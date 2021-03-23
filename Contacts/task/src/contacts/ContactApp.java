package contacts;

import contacts.command.*;
import contacts.entity.PhoneBook;
import contacts.invoker.Invoker;
import contacts.util.UIConstants;
import contacts.util.UIUtil;

public class ContactApp {
    public void start() {
        Invoker invoker = new Invoker();
        PhoneBook phoneBook = new PhoneBook();

        String userInput;
        while (!UIConstants.EXIT.equals(userInput = UIUtil.getLine(UIConstants.ENTER_ACTION))) {
            if (UIConstants.ADD.equals(userInput)) {
                invoker.setCommand(new Add(phoneBook));
            } else if (UIConstants.INFO.equals(userInput)) {
                invoker.setCommand(new Info(phoneBook));
            } else if (UIConstants.EDIT.equals(userInput)) {
                invoker.setCommand(new Edit(phoneBook));
            } else if (UIConstants.COUNT.equals(userInput)) {
                invoker.setCommand(new Count(phoneBook));
            } else if (UIConstants.REMOVE.equals(userInput)) {
                invoker.setCommand(new Remove(phoneBook));
            }
            invoker.execute();
        }
    }
}
