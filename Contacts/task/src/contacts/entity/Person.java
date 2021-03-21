package contacts.entity;

import contacts.util.StringUtils;

import java.time.LocalDate;

public class Person extends Contact {
    private String name;
    private String surname;
    private LocalDate birthDate;
    private String gender;

    @Override
    public String getInfo() {
        return "Name: " + name + StringUtils.NEW_LINE +
                "Surname: " + surname + StringUtils.NEW_LINE +
                "Birth date: " + (birthDate == null ? StringUtils.NO_DATA : birthDate) + StringUtils.NEW_LINE +
                "Gender: " + (gender == null ? StringUtils.NO_DATA : gender) + StringUtils.NEW_LINE +
                "Number: " + (number == null ? StringUtils.NO_DATA : number) + StringUtils.NEW_LINE +
                "Time created: " + createdAt + StringUtils.NEW_LINE +
                "Time last edit: " + modifiedAt + StringUtils.NEW_LINE;
    }
}
