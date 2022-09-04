package Lesson1.Geo;

import Lesson1.Geo.Animal.Animal;
import Lesson1.Geo.Animal.Cat;
import Lesson1.Geo.Animal.Dog;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Person irina = new Person("Ирина", Gender.FEMALE);
        Person vasya = new Person("Вася", Gender.MALE);
        Person masha = new Person("Маша", Gender.FEMALE);
        Person jane = new Person("Женя", Gender.FEMALE);
        Person ivan = new Person("Иван", Gender.MALE);
        Person jek = new Person("jek", Gender.MALE);
        GeoTree gt = new GeoTree();

        gt.append(irina, vasya, Relationship.PARENT);
        gt.append(irina, masha, Relationship.PARENT);
        gt.append(vasya, jane, Relationship.PARENT);
        gt.append(vasya, ivan, Relationship.PARENT);
        gt.append(irina, ivan, Relationship.PARENT);
        gt.append(jek, masha, Relationship.GRANDPA);

        Cat cat = new Cat("musya", 2);
        Dog dog = new Dog("Barsik", 4);
        vasya.call(cat);
        irina.call(dog);

        irina.searchRelatives(gt, Relationship.CHILD);
        irina.searchRelatives(gt, Relationship.PARENT);
        ivan.searchRelatives(gt, Relationship.PARENT);
        jek.getAllRelatives(gt);
        gt.append(jek, irina, Relationship.GRANDPA);
        gt.append(jane, irina, Relationship.GRANDMA);
        irina.getAllRelatives(gt);
        jane.getAllRelatives(gt);
        masha.play(ivan);


        cat.showInfo();
        dog.showInfo();
        irina.showInfo();

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);

        ArrayList<Person> people = new ArrayList<>();
        people.add(irina);
        people.add(jane);
        people.add(jek);
        people.add(vasya);

        System.out.println("-----------------------");
        for (Animal animal : animals) {
            animal.showInfo();
        }
        System.out.println("-----------------------");

        for (Person person : people) {
            person.showInfo();
        }
    }

}
