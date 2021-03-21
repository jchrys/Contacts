package contacts.entity;

import java.time.LocalDateTime;

public abstract class Contact {
    protected String number;
    protected LocalDateTime modifiedAt;
    protected LocalDateTime createdAt;

    abstract String getInfo();
}
