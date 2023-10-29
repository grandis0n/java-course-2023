package edu.hw3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Task5 {
    public static class Contact {
        private final String firstName;
        private final String lastName;

        public Contact(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getFirstName() {
            return firstName;
        }
    }

    public static class ContactSorter {
        public static List<Contact> parseContacts(String[] names, String sortOrder) {
            if (names == null || names.length == 0) {
                return new ArrayList<>();
            }

            List<Contact> contacts = new ArrayList<>();
            for (String name : names) {
                String[] nameParts = name.split(" ");
                String firstName = nameParts[0];
                String lastName = nameParts.length > 1 ? nameParts[1] : nameParts[0];
                contacts.add(new Contact(firstName, lastName));
            }

            if (sortOrder.equals("ASC")) {
                contacts.sort(Comparator.comparing(Contact::getLastName)
                    .thenComparing(Contact::getFirstName));
            } else if (sortOrder.equals("DESC")) {
                contacts.sort(Comparator.comparing(Contact::getLastName)
                    .reversed().thenComparing(Contact::getFirstName));
            }

            return contacts;
        }
    }
}
