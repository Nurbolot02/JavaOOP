package Lesson2.Store;

import java.util.ArrayList;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        ArrayList<Seller> sellers = new ArrayList<>();
        ArrayList<Consumer> consumers = new ArrayList<>();
        Random random = new Random();

        ArrayList<Item> items = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            items.add(new Item());
        }

        for (int i = 0; i < 10; i++) {
            sellers.add(new Seller());
        }

        for (int i = 0; i < 10; i++) {
            consumers.add(new Consumer());
        }


        for (int i = 0; i < 10; i++) {
            consumers.get(i).showInfo(consumers.get(i));
            sellers.get(i).showInfo(sellers.get(i));
        }


        consumers.get(9).setBucket(items.get(9));
        consumers.get(9).setBucket(items.get(8));
        consumers.get(9).totalCost(consumers.get(9).bucket);
        consumers.get(9).areYouPoor(consumers.get(9));
    }
}
