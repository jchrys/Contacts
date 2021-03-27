package contacts.command.entity;

import contacts.entity.Contact;

public class SearchResult {
    private int idx;
    private Contact contact;

    public SearchResult(int idx, Contact contact) {
        this.idx = idx;
        this.contact = contact;
    }

    public Contact getContact() {
        return this.contact;
    }
    public int getIndex() {
        return this.idx;
    }

}
