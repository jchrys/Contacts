package contacts.command;


import contacts.command.entity.CommandContext;

public interface Command {
    CommandContext execute();
}
