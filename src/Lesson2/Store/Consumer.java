package Lesson2.Store;

import java.util.TreeMap;

public class Consumer extends Human {
    private TreeMap<NameOfProducts, Item> wishList = new TreeMap<>();
    private TreeMap<NameOfProducts, Item> bucket = new TreeMap<>();
    private static int count;

    static {
        count = 0;
    }

    public Consumer(String name, double money, int loveIndex) {
        super(name, money, loveIndex);
        count++;
    }

    @Override
    public void Discount(Item bucket) {

    }

    public TreeMap<NameOfProducts, Item> getWishList() {
        return wishList;
    }

    public void setWishList(NameOfProducts name, Item item) {
        this.wishList.put(name, item);
    }

    public void showWishList() {
        System.out.println("Consumer wishList");
        for (Item items : wishList.values()) {
            System.out.printf("product name: %s \nCategory: %s \nPrice: %s$ \nCountOfProduct: %s\n\n",
                    items.getNameOfItem(), items.getCategory(), items.getCost(), items.getCount());
        }
    }

    public TreeMap<NameOfProducts, Item> getBucket() {
        return bucket;
    }

    public void setBucket(NameOfProducts name, Item item) {
        this.bucket.put(name, item);
        System.out.println("bucket add - " + name);
    }

    @Override
    public void walkInStorage() {
        System.out.println("Вы не можете войти сюда!");
    }

    public void pay(Seller seller) {
        if (!areYouPoor()) {
            double res = 0;
            for (Item item : bucket.values()) {
                if (seller.setItems(item.getNameOfItem(), item) == 0) {
                    res += item.getCost();
                    setMoney(getMoney() - item.getCost());
                }
            }
            if (res < getMoney()) {
                System.out.println("Вы купили товаров на " + res + " $ у вас осталось " + getMoney() + " $");
            }
        } else {
            System.out.printf("У вач есть только %s долларов!", getMoney());
        }

    }
}
