package contacts.entity;

import contacts.util.PhoneNumberValidator;

public class Contact {
    private String name;
    private String surName;
    private String phoneNumber;

    public Contact(String name, String surName, String phoneNumber) {
        this.name = name;
        this.surName = surName;
        this.phoneNumber = phoneNumber;
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
}
