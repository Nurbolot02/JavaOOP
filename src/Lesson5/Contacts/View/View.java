package Lesson5.Contacts.View;

import Lesson5.Contacts.Model.Contact;
import Lesson5.Contacts.Model.Contacts;

import java.util.Scanner;

public class View {
    private Scanner scanner = new Scanner(System.in);
    private CreateContactV1 createContactV1 = new CreateContactV1();

    public boolean showContacts(Contacts contacts) {
        if (contacts.getContactMap().isEmpty()) {
            System.out.println("No contacts");
            return false;
        }
        int counter = 1;
        System.out.println("\nContacts");
        for (Contact contact: contacts.getContactMap().values()){
            System.out.println();
            System.out.print(counter++ + " :");
            System.out.printf("\tname: %s\n", contact.getName());
            int count = 1;
            for (String number: contact.getPhoneNumbers()){
                System.out.println("\t" + count++ + "- phone number: " + number);
            }
            System.out.println("\temail: " + contact.getEmail());
        }
        return true;
    }

    public boolean showContact(Contact contact) {
        if (contact == null) {
            System.out.println("No contacts");
        }

        System.out.println();
        System.out.printf("\tname: %s\n", contact.getName());
        int count = 1;
        for (String number: contact.getPhoneNumbers()){
            System.out.println("\t" + count++ + "- phone number: " + number);
        }
        System.out.println("\temail: " + contact.getEmail());
        return true;
    }

    public String showMenu() {
        System.out.print(
                "\nfunctions" +
                        "\nn - creat contact " +
                        "\nq - close program" +
                        "\ni - import" +
                        "\ne - export" +
                        "\nr - refresh the page \n" +
                        "\nchoose function or contact:");
        return scanner.nextLine();
    }

    public String showContactFunctions(){
        System.out.println();
        System.out.println(
                "1 - добавить номер" +
                "\n2 - изменить имя" +
                        "\n3 - изменить email" +
                        "\nd - удалить контакт" +
                        "\nb - вернутся в главное меню" +
                        "\nВыберите функцию: ");
        return scanner.nextLine();
    }

    public Contact createContact() {
        return createContactV1.createContact(scanner);
    }
}
