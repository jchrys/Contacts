package contacts.module;

import contacts.common.UserInputReader;
import contacts.entity.PhoneBook;

public interface Module {
    Module init(PhoneBook phoneBook, UserInputReader userInputReader);
    void start();
}