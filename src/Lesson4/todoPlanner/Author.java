package Lesson4.todoPlanner;

import java.util.Calendar;

public class Author {
    private final int id;
    private String name;
    private String sureName;
    private String patronymic;
    private Calendar dateOfBirth;
    private final Gender gender;
    private String  phoneNumber;
    private String Email;
    private static int count;

    static {
        count = 0;
    }

    public Author(String name, String sureName, Gender gender, String phoneNumber, String email) {
        this.id = count++;
        this.name = name;
        this.sureName = sureName;
        this.patronymic = "";
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        Email = email;
    }

    public int getId(){
        return id;
    }

    public int getCount() {
        return count;
    }

    public Gender getGender() {
        return gender;
    }

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

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Calendar getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Calendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
