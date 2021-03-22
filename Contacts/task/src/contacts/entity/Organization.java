package contacts.entity;

import contacts.util.StringUtils;

public class Organization extends Contact {
    private String organizationName;
    private String address;

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    String getInfo() {
        return "Organization name: " + organizationName + StringUtils.NEW_LINE +
                "Address: " + address + StringUtils.NEW_LINE +
                "Time created: " + getCreatedAt() + StringUtils.NEW_LINE +
                "Time last edit: " + getModifiedAt() + StringUtils.NEW_LINE;
    }

    @Override
    String getSimpleName() {
        return organizationName;
    }
}
