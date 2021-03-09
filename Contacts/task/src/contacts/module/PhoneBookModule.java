package contacts.module;

import contacts.entity.PhoneBook;

public interface PhoneBookModule extends Module {
    void init(PhoneBook phoneBook);

    PhoneBook getPhoneBook();
}
