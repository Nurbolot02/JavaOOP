package Lesson5.Contacts.Model;

import java.util.Map;

public abstract class Import {
    public abstract Map<Integer, Contact> importContacts(String path);
}
