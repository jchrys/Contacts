package contacts.command;

import contacts.command.entity.CommandContext;
import contacts.util.UIUtil;

public class Menu implements Command {

    @Override
    public CommandContext execute() {
        return CommandContext.of(UIUtil.getAction("menu", "add", "list", "search", "count", "exit"));
    }
}
