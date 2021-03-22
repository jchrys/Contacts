package contacts.entity.factory;

import contacts.entity.Contact;
import contacts.util.ValidationUtils;
import contacts.util.UIConstants;
import contacts.util.UIUtil;

import java.time.LocalDateTime;

public abstract class AbstractContactFactory {
    abstract protected Contact createContact(String type);

    public Contact create() {
        String type = UIUtil.getLine(UIConstants.ENTER_TYPE);
        Contact contact = createContact(type);
        if (contact != null) {
            String numberString = UIUtil.getLine(UIConstants.ENTER_NUMBER);
            String number = null;
            if (ValidationUtils.isValidNumber(numberString)) { //TODO +0 (123) 456-789-ABcd -> (123) 456-789-ABcd
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
