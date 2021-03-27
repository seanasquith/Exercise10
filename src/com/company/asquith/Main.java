package com.company.asquith;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Contact> contactList = new ArrayList<>();
        ContactIterator contactIterator = new ContactIterator(contactList);

        contactList.add(new Contact("Sean", "Sean@gmail.com"));
        contactList.add(new Contact("Elon", "Elon@aol.com"));
        contactList.add(new Contact("Richard", "Richard@hotmail.com"));
        contactList.add(new Contact("Cartman", "Cartman@yahoo.com"));

        for (Contact contact : contactIterator) {
            contact.display();
        }
    }
}
