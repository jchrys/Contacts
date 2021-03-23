package contacts.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PhoneBook {
    List<Contact> contacts;

    public PhoneBook() {
        this.contacts = new ArrayList<>();
    }

    public void add(Contact contact) {
        contacts.add(contact);
    }

    public String list() {
        return IntStream.range(0, contacts.size())
                .mapToObj(idx -> (idx + 1) + ". " + contacts.get(idx).getSimpleName())
                .collect(Collectors.joining("\n"));
    }

    public int size() {
        return contacts.size();
    }

    public boolean isEmpty() {
        return null == contacts || contacts.isEmpty();
    }

    public String getInfo(int idx) {
        return contacts.get(idx).getInfo();
    }

    public Contact get(int idx) {
        return contacts.get(idx);
    }
}
