package Lesson5.Contacts.Model;

import java.util.Map;

public abstract class SaveContacts {
    public abstract boolean saveContacts(Map<Integer, Contact> contacts);
}
