package Lesson2.Store;

import java.util.List;
import java.util.TreeMap;

public interface Communication {

    default double costOfItem(Item item) {
        return item.getCost();
    }

    default void isItemsInStorage(Seller seller, List<Item> wishListOfConsumer) {
        for (Item item : wishListOfConsumer) {
            if (!seller.getItems().containsKey(item)) {
                System.out.println("У нас нет " + item.getNameOfItem());
            }
        }
    }

    //Дописать метод
    default double totalCost(TreeMap<NameOfProducts, Item> items) {
        double resCost = 0;
        for (Item item : items.values()) {
            System.out.println(item.getNameOfItem() + " " + item.getCost());
            resCost += costOfItem(item);
        }
        System.out.println("final cost: " + resCost);
        return resCost;
    }

    default boolean areYouPoor() {
        if (totalCost(((Consumer) this).getBucket()) > ((Consumer) this).getMoney()) {
            System.out.println("Ты нищеброд");
            return true;
        } else {
            return false;
        }
    }

    void walkInStorage();
}
