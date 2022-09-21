package Lesson5.Contacts.Model;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class SaveAsJson extends SaveContacts{
    @Override
    public boolean saveContacts(Map<Integer, Contact> contacts) {
        if (contacts.isEmpty())return false;
        String path = "src/Lesson5/Contacts/data";
        try (
                FileWriter fileWriter = new FileWriter(path, false)
                ){
            for (Contact contact: contacts.values()){
                fileWriter.write(contact.getId());
                fileWriter.write(":");
                fileWriter.write("{");
                fileWriter.write(contact.getName());
                fileWriter.write(" ");
                fileWriter.write(contact.getSureName());
                fileWriter.write(" ");
                for (String number: contact.getPhoneNumbers()){
                    fileWriter.write(number);
                    fileWriter.write(";");
                }
                fileWriter.write(" ");
                fileWriter.write(contact.getEmail());
                fileWriter.write("}");
                fileWriter.write("\n");
                fileWriter.flush();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.out.println("can't write file to " + path);
        }
        return true;
    }
}
