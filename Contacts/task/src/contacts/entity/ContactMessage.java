package contacts.entity;

import contacts.common.Message;
import contacts.common.MessageStatus;

public class ContactMessage implements Message {

    private MessageStatus status;
    private String message;

    private ContactMessage(MessageStatus status, String message) {
        this.status = status;
        this.message = message;
    }

    @Override
    public MessageStatus getStatus() {
        return this.status;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    public static ContactMessage ok(String message) {
        return new ContactMessage(MessageStatus.OK, message);
    }

    public static ContactMessage fail(String message) {
        return new ContactMessage(MessageStatus.FAIL, message);
    }
}
