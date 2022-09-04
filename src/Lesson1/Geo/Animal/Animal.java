package Lesson1.Geo.Animal;

import java.util.Iterator;

public abstract class Animal implements Iterator<String>, GetInfo {
    private String name;
    private int age;
    private int index;
    {
        index = 0;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract String voice();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public boolean hasNext() {
        return index++ < 2;
    }

    @Override
    public String next() {
        switch (index){
            case 1:
                return name;
            case 2:
                return String.valueOf(age);
        }
        return null;
    }
}
