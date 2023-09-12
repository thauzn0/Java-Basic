package ArrayChallenges;

import java.util.ArrayList;

public class MobilePhone { // Create the Mobile Phone class
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) { // Create MobilePhone method
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    private int findContact(Contact contact) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).getName().equals(contact.getName())) {
                return i;
            }
        }
        return -1;
    }

    private int findContact(String name) {
        for (int i = 0; i < this.myContacts.size(); i++) {
            if (this.myContacts.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public boolean addNewContact(Contact contact) { // addNewContact method
        if (findContact(contact) == -1) {
            this.myContacts.add(contact);
            return true;
        }
        return false;
    }


    public boolean updateContact(Contact oldContact, Contact newContact) { // updateContact method
        int position = findContact(oldContact);
        if (position >= 0) {
            this.myContacts.set(position, newContact);
            return true;
        }
        return false;
    }

    public boolean removeContact(Contact contact) { // removeContact method
        int position = findContact(contact);
        if (position != -1) {
            this.myContacts.remove(contact);
            return true;
        }
        return false;
    }

    public Contact queryContact(String name) { // queryContact method
        int position = findContact(name);
        if (position >= 0) {
            return this.myContacts.get(position);
        }
        return null;
    }

    public void printContacts() { // printContacts method
        System.out.println("Contact list:");
        for (int i = 0; i < this.myContacts.size(); i++) {
            System.out.println((i + 1) + ". " + this.myContacts.get(i).getName() + " -> " + this.myContacts.get(i).getPhoneNumber());
        }
    }

}