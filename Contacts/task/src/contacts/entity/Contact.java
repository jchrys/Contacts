package contacts.entity;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public abstract class Contact {
    protected String number;
    protected LocalDateTime modifiedAt;
    protected LocalDateTime createdAt;

    private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm");

    public void setNumber(String number) {
        this.number = number;
    }

    public void setModifiedAt(LocalDateTime modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt  = createdAt;
    }

    public String getModifiedAt() {
        return dateTimeFormatter.format(modifiedAt);

    }

    public String getCreatedAt() {
        return dateTimeFormatter.format(createdAt);
    }

    public List<String> getEditableFields() {
        return List.of("number");
    }

    abstract String getInfo();
    abstract String getSimpleName();
}
