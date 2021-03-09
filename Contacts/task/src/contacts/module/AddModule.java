package contacts.module;

import contacts.common.UserInterface;
import contacts.entity.Contact;
import contacts.entity.PhoneBook;

public class AddModule implements Module{
    private PhoneBook phoneBook;
    private UserInterface userInterface;


    @Override
    public Module init(PhoneBook phoneBook, UserInterface userInterface) {
        this.phoneBook = phoneBook;
        this.userInterface = userInterface;
        return this;
    }

    @Override
    public void start() {
        String name = userInterface.read("Enter the name:");
        String surName = userInterface.read("Enter the surname:");
        String number = userInterface.read("Enter the number:");
        Contact contact = Contact.builder()
                .withName(name)
                .withSurName(surName)
                .withPhoneNumber(number)
                .build();
        phoneBook.addContact(contact);
        userInterface.printf("The Record Added");
    }
}
