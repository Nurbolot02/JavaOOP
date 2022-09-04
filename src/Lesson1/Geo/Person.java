package Lesson1.Geo;


import Lesson1.Geo.Animal.Animal;

import java.util.Iterator;
import java.util.Objects;

public class Person implements Communication, SearchRelatives, Iterator<String>, GetInfoP {
    private String fullName;
    private Gender gender;

    public Person(String fullName, Gender gender) {
        this.fullName = fullName;
        this.gender = gender;
    }

    public String getFullName() {
        return fullName;
    }

    public Gender getGender() {
        return this.gender;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(fullName, person.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName);
    }

    @Override
    public void call(Animal animal) {
        System.out.printf("%s called %s, %s said %s\n", this.fullName, animal.getName(), animal.getName(), animal.voice());
    }

    @Override
    public void play(Person person) {
        System.out.printf("%s play with %s \n", this.getFullName(), person.fullName);
    }

    int index = 0;

    @Override
    public boolean hasNext() {
        return index++ < 2;
    }

    @Override
    public String next() {
        switch (index) {
            case 1:
                return fullName;
            case 2:
                return String.valueOf(String.valueOf(gender));
        }
        return null;
    }
}
