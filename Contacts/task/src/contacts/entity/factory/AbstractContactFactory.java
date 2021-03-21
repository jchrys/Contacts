package contacts.entity.factory;

import contacts.entity.Contact;
import contacts.util.ValidationUtils;
import contacts.util.UIConstants;
import contacts.util.UIUtil;

import java.time.LocalDateTime;

public abstract class AbstractContactFactory {
    abstract Contact createContact(String type);

    Contact newInstance() {
        String type = UIUtil.getLine("Enter the type: ");
        Contact contact = createContact(type);
        if (contact != null) {
            String numberString = UIUtil.getLine(UIConstants.ENTER_NUMBER);
            String number = null;
            if (ValidationUtils.isValidNumber(numberString)) {
                number = numberString;
            } else {
                UIUtil.println(UIConstants.BAD_NUMBER);
            }
            contact.setNumber(number);
            LocalDateTime now = LocalDateTime.now();
            contact.setModifiedAt(now);
            contact.setCreatedAt(now);
        }
        return contact;
    }
}
