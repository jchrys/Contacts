package contacts.entity;

import contacts.util.StringUtils;
import contacts.util.UIConstants;
import contacts.util.UIUtil;
import contacts.util.ValidationUtils;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.List;

public class Person extends Contact {
    private String name;
    private String surname;
    private LocalDate birthDate;
    private String gender;

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setBirthDate(String birthDate) {
        LocalDate localDate = null;
        try {
            localDate = LocalDate.parse(birthDate);
        } catch (DateTimeParseException e) {
            UIUtil.println(UIConstants.BAD_BIRTH_DATE);
        }
        this.birthDate = localDate;
    }

    public void setGender(String gender) {
        if (ValidationUtils.isValidGender(gender)) {
            this.gender = gender;
        } else {
            UIUtil.println(UIConstants.BAD_GENDER);
            this.gender = null;
        }
    }

    @Override
    public String getInfo() {
        return "Name: " + name + StringUtils.NEW_LINE +
                "Surname: " + surname + StringUtils.NEW_LINE +
                "Birth date: " + (birthDate == null ? StringUtils.NO_DATA : birthDate) + StringUtils.NEW_LINE +
                "Gender: " + (gender == null ? StringUtils.NO_DATA : gender) + StringUtils.NEW_LINE +
                "Number: " + (number == null ? StringUtils.NO_DATA : number) + StringUtils.NEW_LINE +
                "Time created: " + getCreatedAt() + StringUtils.NEW_LINE +
                "Time last edit: " + getModifiedAt() + StringUtils.NEW_LINE;
    }

    @Override
    public String getSimpleName() {
        return name + " " + surname;
    }

    @Override
    public List<String> getEditableFields() {
        return List.of("name", "surname", "birthDate", "gender", "number");
    }

}
