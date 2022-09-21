package Lesson5.Contacts.Model;


import Lesson5.Contacts.View.View;

import java.util.Scanner;

public class ContactFunctions {
    private Scanner scanner = new Scanner(System.in);

    public void contactFunctions(int userInput, View view, SaveAsJson saveAsJson, Contacts contacts) {
        String userInputting;
        boolean flag = true;

        while (!contacts.getContactMap().isEmpty() && flag) {
            view.showContact(contacts.getContactMap().get(userInput));
            userInputting = view.showContactFunctions();
            System.out.println();
            switch (userInputting) {
                case "1" -> {
                    change("Введите новый номер: ", 6, contacts.getContactMap().get(userInput), "number");
                    System.out.println("номер добавлен!");
                }
                case "2" -> {
                    change("Введите новое имя: ", 3, contacts.getContactMap().get(userInput), "name");
                    System.out.println("имя изменен!");
                }
                case "3" -> {
                    change("Введите новый email: ", 3, contacts.getContactMap().get(userInput), "email");
                    System.out.println("email изменен!");
                }
                case "a" -> {
                    change("Введите номер: ", 3, contacts.getContactMap().get(userInput), "email");
                    System.out.println("email изменен!");
                }

                case "d" -> {
                    System.out.println("контакт " + contacts.getContactMap().get(userInput).getSureName() + " удален!");
                    contacts.getContactMap().remove(userInput);
                    flag = false;
                }
                case "b" -> {
                    System.out.println();
                    flag = false;
                }
                default -> System.out.println("wrong function try again!");
            }
            saveAsJson.saveContacts(contacts.getContactMap());
        }
    }

    public void change(String text, int length, Contact contact, String type) {
        System.out.print(text);
        String str = "";
        while (true) {
            str = scanner.nextLine();
            if (str.length() < length) {
                System.out.println("длина не должно быть меньше " + length);
            } else {
                break;
            }
        }
        switch (type) {
            case "number" -> {
                contact.setPhoneNumbers(str);
            }
            case "name" -> {
                contact.setName(str);
            }
            case "email" -> {
                contact.setEmail(str);
            }
        }

    }
}
