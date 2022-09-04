package Lesson2.Store;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.TreeMap;
import java.util.function.Consumer;

public class Seller extends Human {
    private TreeMap<NameOfProducts, Item> items = new TreeMap<>();
    public static int count;

    static {
        count = 0;
    }

    public Seller(String name, double money, int loveIndex) {
        super(name, money, loveIndex);
        count++;
    }

    @Override
    public void Discount(Item bucket) {

    }


    public void showItems() {
        System.out.println("Seller products");
        for (Item items : items.values()) {
            System.out.printf("product name: %s \nCategory: %s \nPrice: %s$ \nCountOfProduct: %s \nSales: %s\n\n",
                    items.getNameOfItem(), items.getCategory(), items.getCost(), items.getCount(), items.getSales());
        }
        for (int i = 0; i < items.size(); i++) {

        }
    }

    public TreeMap<NameOfProducts, Item> getItems() {
        return items;
    }

    public void addItem(NameOfProducts name, Item item) {
        if (name.equals(item.getNameOfItem())) {
            items.put(name, item);
            System.out.printf("%s успешно добавлен в полку товаров!\n", item.getNameOfItem());
        } else {
            System.out.println("Не удалось добавить товар!");
        }
    }

    public int setItems(NameOfProducts name, Item item) {
        if (this.items.get(name).getCount() > 1) {
            this.items.get(name).setCount(this.items.get(name).getCount() - 1);
            this.setMoney(this.getMoney() + item.getCost());
            return 0;
        } else {
            System.out.println("продукта " + name + " пока что нету!");
            return -1;
        }
    }

    @Override
    public void walkInStorage() {
        System.out.println("Смотрим есть ли данный товар в скаладе");
    }
}
