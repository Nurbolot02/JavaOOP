package Lesson5.Contacts.Model;

import java.util.Map;

public abstract class Export {
    public abstract boolean export(Map<Integer, Contact> contacts, String path);
}
