package contacts.entity;

import contacts.util.PhoneNumberValidator;
import contacts.util.StringUtils;

public class Contact {
    private String name;
    private String surName;
    private String phoneNumber;

    public Contact(String name, String surName, String phoneNumber) {
        this.name = name;
        this.surName = surName;
        this.phoneNumber = phoneNumber;
    }

    public String getFullName() {
        return name + (StringUtils.isEmpty(surName) ? "" : " " + surName);
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public ContactMessage isValid() {
        boolean isValid = PhoneNumberValidator.isValid(this.phoneNumber);
        if (!isValid) {
            this.phoneNumber = "[no number]";
        }
        return ContactMessage.ok(!isValid ? "Wrong number format!" : "");
    }

    public static ContactBuilder builder() {
        return new ContactBuilder();
    }

    public static final class ContactBuilder {
        private String name;
        private String surName;
        private String phoneNumber;

        private ContactBuilder() {
        }

        public static ContactBuilder aContact() {
            return new ContactBuilder();
        }

        public ContactBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public ContactBuilder withSurName(String surname) {
            this.surName = surname;
            return this;
        }

        public ContactBuilder withPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Contact build() {
            return new Contact(name, surName, phoneNumber);
        }
    }

    public ContactMessage editField(String field, String value) {
        if ("number".equalsIgnoreCase(field)) {
            this.phoneNumber = value;
        } else if ("name".equalsIgnoreCase(field)) {
            this.name = value;
        } else {
            this.surName = value;
        }
        return isValid();
    }
}
