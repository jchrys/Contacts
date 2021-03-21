package contacts.entity;

import java.time.LocalDateTime;

public abstract class Contact {
    protected String number;
    protected LocalDateTime modifiedAt;
    protected LocalDateTime createdAt;

    public void setNumber(String number) {
        this.number = number;
    }

    public void setModifiedAt(LocalDateTime modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt  = createdAt;
    }

    abstract String getInfo();
}
