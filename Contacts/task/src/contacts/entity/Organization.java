package contacts.entity;

import contacts.util.StringUtils;

public class Organization extends Contact {
    private String organizationName;
    private String address;

    @Override
    String getInfo() {
        return "Organization name: " + organizationName + StringUtils.NEW_LINE +
                "Address: " + address + StringUtils.NEW_LINE +
                "Time created: " + createdAt + StringUtils.NEW_LINE +
                "Time last edit: " + modifiedAt + StringUtils.NEW_LINE;
    }
}
