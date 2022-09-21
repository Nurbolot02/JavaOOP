package Lesson5.Contacts.Model;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Map;
import java.util.TreeMap;

public class ImportAsBin extends Import {
    @Override
    public Map<Integer, Contact> importContacts(String path) {
        Map<Integer, Contact> contacts = new TreeMap<>();
        try (
                FileInputStream fileInputStream = new FileInputStream(path);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        ) {
            contacts = (Map<Integer, Contact>) objectInputStream.readObject();
            System.out.println("\nThe contacts are imported from the file contacts.bin");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e1) {
            System.out.println(e1.getMessage());
            System.out.println("can't cast class object to class ArrayList<ArrayList<Task>>");
        }
        return contacts;
    }
}
