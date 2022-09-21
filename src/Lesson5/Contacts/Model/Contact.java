package Lesson5.Contacts.Model;

import java.io.Serializable;
import java.util.ArrayList;

public class Contact implements Serializable {
    private String name;
    private String sureName;
    private ArrayList<String> phoneNumbers;
    private String email;
    private  static int count = 0;
    private int id;
    {
        name = "";
        phoneNumbers = new ArrayList<>();
        sureName = "";
        email = "";
        id = count++;
    }


    public Contact(String name, String sureName, ArrayList<String> phoneNumbers, String email) {
        this.name = name;
        this.sureName = sureName;
        this.phoneNumbers = phoneNumbers;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Contact(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSureName() {
        return sureName;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }

    public ArrayList<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(String phoneNumber) {
        this.phoneNumbers.add(phoneNumber);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
