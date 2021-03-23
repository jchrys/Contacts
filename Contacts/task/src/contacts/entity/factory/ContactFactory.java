package contacts.entity.factory;

import contacts.entity.Contact;
import contacts.entity.Organization;
import contacts.entity.Person;
import contacts.util.UIConstants;
import contacts.util.UIUtil;

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
        String birthDate = UIUtil.getLine(UIConstants.ENTER_BIRTH_DATE);
        String gender = UIUtil.getLine(UIConstants.ENTER_GENDER);
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
