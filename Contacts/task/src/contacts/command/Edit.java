package contacts.command;

import contacts.entity.Contact;
import contacts.entity.PhoneBook;
import contacts.util.UIConstants;
import contacts.util.UIUtil;

public class Edit implements Command {
    private PhoneBook phoneBook;

    public Edit(PhoneBook phoneBook) {
        this.phoneBook = phoneBook;
    }

    @Override
    public void execute() {
        if (phoneBook.isEmpty()) {
            UIUtil.println(UIConstants.NO_RECORDS_TO_EDIT);
            return;
        }
        UIUtil.println(phoneBook.list());
        String idxPlusOne = UIUtil.getLine(UIConstants.SELECT_RECORD);
        int idx = Integer.parseInt(idxPlusOne) - 1;
        Contact contact = phoneBook.get(idx);
        String field = UIUtil.getLine(String.format(UIConstants.SELECT_FIELD, String.join(", ", contact.getEditableFields())));
        String value = UIUtil.getLine(String.format(UIConstants.ENTER_FIELD, field));
        try {
            contact.getClass().getMethod(getSetterName(field), String.class).invoke(contact, value);
        } catch (Exception ignored) {
        }
        UIUtil.println(UIConstants.RECORD_UPDATED);
    }

    private String getSetterName(String field) {
        return "set" + field.substring(0, 1).toUpperCase() + field.substring(1);
    }

}
