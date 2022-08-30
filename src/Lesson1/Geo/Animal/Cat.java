package Lesson1.Geo.Animal;

public class Cat extends Animal{
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public String voice() {
        return "мяу";
    }
}
