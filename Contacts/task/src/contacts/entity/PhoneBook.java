package contacts.entity;

import java.util.List;

public class PhoneBook {
    List<Contact> contacts;

    public void add(Contact contact) {
        contacts.add(contact);
    }
}
