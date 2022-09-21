package Lesson5.Contacts.View;

import Lesson5.Contacts.Model.Contact;

import java.util.Scanner;

public class CreateContactV1 extends CreateContact {
    @Override
    public Contact createContact(Scanner scanner) {
        Contact contact = new Contact();
        contact.setName(readText("Enter the name: ", scanner));
        contact.setPhoneNumbers(readText("\nEnter phone number: ", scanner));
        return contact;
    }
    private String readText(String inStr, Scanner scanner){
        String  str = "";
        while (str.length() < 3) {
            System.out.print(inStr);
            str = scanner.nextLine();
            if (str.length() < 3){
                System.out.println("Введите больше трёх символов!");
            }
        }
        return str;
    }
}
