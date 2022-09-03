package Lesson2.Store;

public class Item {
    private NameOfProducts nameOfItem;
    private double cost;
    private Category category;
    private static int countOfItems;
    private int count;
    private int Sales;

    static {
        countOfItems = 0;
    }

    public Item(NameOfProducts nameOfItem, int count, double cost, Category category) {
        this.nameOfItem = nameOfItem;
        this.cost = cost;
        this.category = category;
        this.count = count;
        countOfItems++;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public NameOfProducts getNameOfItem() {
        return nameOfItem;
    }

    public void setNameOfItem(NameOfProducts nameOfItem) {
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

    public int getSales() {
        return Sales;
    }

    public void setSales(int sales) {
        Sales = sales;
    }
}
