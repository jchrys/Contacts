package contacts.module;

import contacts.common.UserInputReader;
import contacts.entity.PhoneBook;

public class CountModule implements Module {

    private PhoneBook phoneBook;

    @Override
    public Module init(PhoneBook phoneBook, UserInputReader userInputReader) {
        this.phoneBook = phoneBook;
        return this;
    }

    @Override
    public void start() {
        System.out.printf("The Phone Book has %d records.", phoneBook.count());
    }

}
