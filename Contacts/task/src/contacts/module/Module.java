package contacts.module;

import contacts.common.UserInterface;
import contacts.entity.PhoneBook;

public interface Module {
    Module init(PhoneBook phoneBook, UserInterface userInterface);
    void start();
}