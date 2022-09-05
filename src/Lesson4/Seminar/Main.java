package Lesson4.Seminar;

public class Main {
    /*
    Задача:
    Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
    Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
    Для хранения фруктов внутри коробки можно использовать ArrayList;
    Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество: вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);

    Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той,
    которую подадут в compare() в качестве параметра. true – если их массы равны,
    false в противоположном случае. Можно сравнивать коробки с яблоками и апельсинами;

     */
    public static void main(String[] args) {
        Apple apple = new Apple(1.0f);
        Apple apple2 = new Apple(1.0f);
        Apple apple3 = new Apple(1.0f);
        Orange orange = new Orange(1.5f);
        Orange orange2 = new Orange(1.5f);
        Orange orange3 = new Orange(1.5f);
        Box<Apple> appleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();

        appleBox.add(apple);
        appleBox.add(apple2);
        appleBox.add(apple3);
        orangeBox.add(orange);
        orangeBox.add(orange2);
        orangeBox.add(orange3);

        System.out.println("Orange: " + orangeBox.getWeight());
        System.out.println("apple: " + appleBox.getWeight());
        System.out.println(appleBox.compare(orangeBox));
    }
}
