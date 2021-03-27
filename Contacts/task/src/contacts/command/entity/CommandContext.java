package contacts.command.entity;

public class CommandContext {
    private String type;
    private int idx;

    public static CommandContext of(String type) {
        return of(type, -1);
    }

    public static CommandContext of(String type, int idx) {
        CommandContext context = new CommandContext();
        context.type = type;
        context.idx = idx;
        return context;
    }

    public String getType() {
        return this.type;
    }

    public int getIndex() {
        return this.idx;
    }
}
