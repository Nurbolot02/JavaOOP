package Lesson2.Store;

import java.util.ArrayList;
import java.util.Random;

public class Consumer extends Human{
    ArrayList<Item> wishList = new ArrayList<>();
    ArrayList<Item> bucket = new ArrayList<>();
    private static int count;

    static {
        count = 0;
    }

    public Consumer(String name, double money, int loveIndex) {
        super(name, money, loveIndex);
    }

    public Consumer() {
        super(String.format("Consumer %d", count++), new Random().nextDouble(100), new Random().nextInt(10));
    }

    public ArrayList<Item> getWishList() {
        return wishList;
    }

    public void setWishList(ArrayList<Item> wishList) {
        this.wishList = wishList;
    }

    public ArrayList<Item> getBucket() {
        return bucket;
    }

    public void setBucket(Item bucket) {
        this.bucket.add(bucket);
        System.out.println("bucket add - " + bucket.getNameOfItem() + " \nprice: " + bucket.getCost());
    }

    @Override
    public void walkInStorage() {
        System.out.println("Смотрим есть ли данный товар в скаладе");
    }
}
