package Lesson5.Contacts.Model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Contacts implements Serializable {
    private Map<Integer, Contact> contactMap = new HashMap<>();

    {
        contactMap = new TreeMap<>();
    }

    public Contacts(Map<Integer, Contact> contactMap) {
        this.contactMap = contactMap;
    }

    public void setContactMap(Map<Integer, Contact> contactMap){
        this.contactMap = contactMap;
    }

    public Contacts() {
    }

    public Map<Integer, Contact> getContactMap() {
        return contactMap;
    }

    public void addContact(Contact contact) {
        this.contactMap.put(contact.getId(), contact);
    }
}
