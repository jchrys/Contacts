package contacts.entity.factory;

import contacts.entity.Contact;
import contacts.entity.Organization;
import contacts.entity.Person;
import contacts.util.UIConstants;
import contacts.util.UIUtil;
import contacts.util.ValidationUtils;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class ContactFactory extends AbstractContactFactory {
    private static final String PERSON = "PERSON";
    private static final String ORGANIZATION = "ORGANIZATION";

    @Override
    protected Contact createContact(String type) {
        if (PERSON.equalsIgnoreCase(type)) {
            return createPerson();
        }
        if (ORGANIZATION.equalsIgnoreCase(type)) {
            return createOrganization();

        }
        return null;
    }

    private Person createPerson() {
        String name = UIUtil.getLine(UIConstants.ENTER_NAME);
        String surname = UIUtil.getLine(UIConstants.ENTER_SURNAME);
        String birthDateString = UIUtil.getLine(UIConstants.ENTER_BIRTH_DATE);
        LocalDate birthDate = null;
        try {
            birthDate = LocalDate.parse(birthDateString);
        } catch (DateTimeParseException e) {
            UIUtil.println(UIConstants.BAD_BIRTH_DATE);
        }
        String genderString = UIUtil.getLine(UIConstants.ENTER_GENDER);
        String gender = null;
        if (ValidationUtils.isValidGender(genderString)) {
            gender = genderString;
        } else {
            UIUtil.println(UIConstants.BAD_GENDER);
        }
        Person person = new Person();
        person.setName(name);
        person.setSurname(surname);
        person.setBirthDate(birthDate);
        person.setGender(gender);
        return person;
    }

    private Organization createOrganization() {
        String orgName = UIUtil.getLine(UIConstants.ENTER_ORG_NAME);
        String address = UIUtil.getLine(UIConstants.ENTER_ADDRESS);
        Organization organization = new Organization();
        organization.setOrganizationName(orgName);
        organization.setAddress(address);
        return organization;
    }
}
