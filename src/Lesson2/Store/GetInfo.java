package Lesson2.Store;

import Lesson1.Geo.Person;

public interface GetInfo {
    default void showInfo() {
        System.out.println((((Human) this).getClass().getSimpleName().equals("Seller") ? "Seller" : "Consumer"));
        System.out.printf("Name: %s\n", ((Human) this).getName());
        System.out.println("money: " + ((Human) this).getMoney());
        System.out.println("loveIndex: " + ((Human) this).getLoveIndex());
        System.out.println();
    }
    default void showInfoIterator() {
        ((Human) this).setIndex(0);
        while (((Human) this).hasNext()) {
            System.out.print(((Human) this).next() + " ");
        }
        System.out.println();
    }
}
