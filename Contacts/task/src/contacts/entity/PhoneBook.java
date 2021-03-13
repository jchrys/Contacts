package contacts.entity;

import contacts.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PhoneBook {
    List<Contact> contacts;

    public PhoneBook() {
        this.contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        ContactMessage message = contact.isValid();
        this.contacts.add(contact);
        if (StringUtils.isNotEmpty(message.getMessage())) {
            System.out.println(message.getMessage());
        }
        System.out.println("The record added.");
    }

    public int count() {
        return this.contacts.size();
    }

    public Contact getAt(int idx) {
        return contacts.get(idx);
    }

    public List<String> getAllContacts() {
        return IntStream.range(0, contacts.size())
                .mapToObj(idx -> String.format("%d. %s, %s\n", idx + 1, contacts.get(idx).getFullName(), contacts.get(idx).getPhoneNumber()))
                .collect(Collectors.toList());
    }
}
