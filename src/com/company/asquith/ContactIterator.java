package com.company.asquith;


import java.util.Iterator;
import java.util.List;

public class ContactIterator implements Iterable<Contact> {

    private List<Contact> contactList;

    public ContactIterator(List<Contact> contactList) {
        this.contactList = contactList;
    }

    @Override
    public Iterator<Contact> iterator() {
        return contactList.iterator();
    }
}
