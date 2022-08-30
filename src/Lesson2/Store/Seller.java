package Lesson2.Store;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Seller extends Human{
    private List<Item> items = new ArrayList<>();
    public static int count;

    static {
        count = 0;
    }

    public Seller(String name, double money, int loveIndex) {
        super(name, money, loveIndex);
    }
    public Seller(){
        super(String.format("Seller %d", count++), new Random().nextDouble(100), new Random().nextInt(10));

    }

    public List<Item> getItems() {
        return items;
    }



    @Override
    public void walkInStorage() {
        System.out.println("Смотрим есть ли данный товар в скаладе");
    }
}
