package Lesson5.Contacts.Presenter;

import Lesson5.Contacts.Model.*;
import Lesson5.Contacts.View.View;

import static Lesson5.Contacts.Model.IsNumber.isNumber;

public class Presenter {
    public static void start() {
        System.out.println("Welcome!");
        ReadJson readJson = new ReadJson();
        View view = new View();
        Model model = new Model();
        Contacts contacts = readJson.readContacts();
        String userDir = System.getProperty("user.dir");
        SaveAsJson saveAsJson = new SaveAsJson();
        String path = userDir.concat("/src/Lesson5/Contacts/contacts.bin");
        ContactFunctions contactFunctions = new ContactFunctions();

        while (true) {
            String userInput = "";

            while (true) {
                view.showContacts(contacts);
                userInput = view.showMenu();
                if (userInput.equalsIgnoreCase("n")) {
                    contacts.addContact(view.createContact());
                    System.out.println("contact created");
                } else if (userInput.equalsIgnoreCase("q")) {
                    System.out.println("goodbye see you later!");
                    System.exit(0);
                } else if (userInput.equalsIgnoreCase("e")) {
                    ExportAsBin exportAsBin = new ExportAsBin();
                    exportAsBin.export(contacts.getContactMap(), path);
                } else if (userInput.equalsIgnoreCase("r")) {
                    break;
                } else if (userInput.equalsIgnoreCase("i")) {
                    ImportAsBin importAsBin = new ImportAsBin();
                    Contacts contacts1 = new Contacts();
                    contacts1.setContactMap(importAsBin.importContacts(path));
                    for (Contact contact : contacts1.getContactMap().values()) {
                        if (!contacts.getContactMap().containsKey(contact.getId())) {
                            contacts.addContact(contact);
                        }
                    }
                } else if (
                        isNumber(userInput) && ((Integer.parseInt(userInput) > 0)
                                && contacts.getContactMap().size() > 0
                                && contacts.getContactMap().size() >= Integer.parseInt(userInput))) {
                    System.out.println("");
                    contactFunctions.contactFunctions(Integer.parseInt(userInput) - 1, view, saveAsJson, contacts);}
                else {
                    System.out.println("\nwrong function try again please!");
                }
                saveAsJson.saveContacts(contacts.getContactMap());
            }
        }
    }
}
