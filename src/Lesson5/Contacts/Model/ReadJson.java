package Lesson5.Contacts.Model;

import java.io.*;

public class ReadJson extends ReadContacts {
    @Override
    public Contacts readContacts() {
        String path = "src/Lesson5/Contacts/data";
        Contacts contacts = new Contacts();
        String str = "";
        try (
                BufferedReader bufferedReader = new BufferedReader(new FileReader(path))
        ) {
            while (true){
                str = bufferedReader.readLine();
                if (str != null && !str.isEmpty()){
                    contacts.addContact(parser(str.substring(str.indexOf("{") + 1, str.lastIndexOf("}"))));
                }else {
                    break;
                }

            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.out.println("can't read contacts!");
        }
        return contacts;
    }
    private Contact parser(String str){
        Contact contact= new Contact();
        String[] pars = str.split(" ");
        if (!pars[0].isEmpty()){
            contact.setName(pars[0]);
        }
        if (!pars[1].isEmpty()){
            contact.setSureName(pars[1]);
        }
        if (!pars[2].isEmpty()){
            String[] numbers = pars[2].split(";");
            for (String number: numbers){
                contact.setPhoneNumbers(number);
            }
        }
        if (pars.length > 3 && !pars[3].isEmpty()){
            contact.setEmail(pars[3]);
        }
        return contact;
    }
}
