package contacts.command;

import contacts.command.entity.CommandContext;
import contacts.entity.Contact;
import contacts.entity.PhoneBook;
import contacts.util.UIConstants;
import contacts.util.UIUtil;

public class Edit implements Command, PhoneBookHolder, IndexHolder {
    private PhoneBook phoneBook;
    private int idx;

    @Override
    public CommandContext execute() {
        Contact contact = phoneBook.get(idx);
        String field = UIUtil.getLine(String.format(UIConstants.SELECT_FIELD, String.join(", ", contact.getEditableFields())));
        String value = UIUtil.getLine(String.format(UIConstants.ENTER_FIELD, field));
        try {
            contact.getClass().getMethod(getSetterName(field), String.class).invoke(contact, value);
        } catch (Exception ignored) {
        }
        UIUtil.println(UIConstants.SAVED);
        UIUtil.println(contact.getInfo());
        return CommandContext.of("record", idx);
    }

    @Override
    public void setIndex(int idx) {
        this.idx = idx;
    }

    @Override
    public void setPhoneBook(PhoneBook phoneBook) {
        this.phoneBook = phoneBook;
    }

    private String getSetterName(String field) {
        return "set" + field.substring(0, 1).toUpperCase() + field.substring(1);
    }
}
