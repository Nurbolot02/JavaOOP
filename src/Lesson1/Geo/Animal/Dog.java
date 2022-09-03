package Lesson1.Geo.Animal;

public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public String voice() {
        return "гав-гав";
    }
}
