package contacts.entity;

public class Contact {
    private final String name;
    private final String surName;
    private final String phoneNumber;

    public Contact(String name, String surName, String phoneNumber) {
        this.name = name;
        this.surName = surName;
        this.phoneNumber = phoneNumber;
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
