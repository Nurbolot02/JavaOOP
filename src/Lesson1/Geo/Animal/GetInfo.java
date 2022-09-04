package Lesson1.Geo.Animal;


import Lesson1.Geo.Person;

public interface GetInfo {
    default void showInfo(){
        ((Animal) this).setIndex(0);
        while (((Animal) this).hasNext()){
            System.out.print(((Animal) this).next() + " ");
        }
        System.out.println(" - лет");
    }
}
