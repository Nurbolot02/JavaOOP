package Lesson2.Store;

import java.util.Random;

public class Item {
    private String nameOfItem;
    private double cost;
    private Category category;
    private static int count;

    static {
        count = 0;
    }

    public Item(String nameOfItem, double cost, Category category) {
        this.nameOfItem = nameOfItem;
        this.cost = cost;
        this.category = category;
    }

    public Item() {
        this(String.format("product %d", count++), new Random().nextDouble(100), ((new Random().nextInt(4) == 0) ? Category.Food : Category.Hygiene));
    }

    public String getNameOfItem() {
        return nameOfItem;
    }

    public void setNameOfItem(String nameOfItem) {
        this.nameOfItem = nameOfItem;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
