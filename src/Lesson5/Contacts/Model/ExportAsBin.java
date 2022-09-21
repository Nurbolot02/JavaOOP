package Lesson5.Contacts.Model;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Map;

public class ExportAsBin extends Export{
    @Override
    public boolean export(Map<Integer, Contact> contacts, String path) {
        if (contacts.size() == 0){
            System.out.println("пока что нету задач для экспорта");
            return false;
        }
        try (
                FileOutputStream fileOutputStream = new FileOutputStream(path);
                ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
        ) {
            outputStream.writeObject(contacts);
            System.out.println("\nThe contacts are exported to contacts.bin");
        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.out.println("can't write file contacts.bin");
        }
        return true;
    }
}
