package contacts.command.factory;

import contacts.command.*;

public class CommandFactory extends AbstractCommandFactory {
    @Override
    protected Command createCommand(String type) {
        switch (type) {
            case "add":
                return new Add();
            case "list":
                return new List();
            case "count":
                return new Count();
            case "record":
                return new Record();
            case "edit":
                return new Edit();
            case "delete":
                return new Delete();
            case "search":
                return new Search();
            case "menu":
            case "back":
                return new Menu();
        }
        return null;
    }

}
