package Lesson2.Store;

public class Main {
    public static void main(String[] args) {
        Seller seller = new Seller("Vasya", 50, 100);
        Consumer consumer = new Consumer("Ivan", 100, 100);

        Item book = new Item(NameOfProducts.RichDadPoorDad, 20, 10, Category.BOOK);
        Item pizza = new Item(NameOfProducts.PIZZA, 10, 10, Category.FOOD);
        Item pencil = new Item(NameOfProducts.PENCIL, 100, 5, Category.USEFUL);

        seller.addItem(book.getNameOfItem(), book);
        seller.addItem(pizza.getNameOfItem(), pizza);
        seller.addItem(pencil.getNameOfItem(), pencil);
        seller.showInfo();
        seller.showItems();

        consumer.showInfo();
        consumer.showWishList();
        consumer.setWishList(NameOfProducts.PIZZA, new Item(NameOfProducts.PIZZA, 1, 10, Category.BOOK));
        consumer.showWishList();

        consumer.setBucket(NameOfProducts.RichDadPoorDad, new Item(NameOfProducts.RichDadPoorDad, 20, 10, Category.BOOK));
        seller.showInfo();
        consumer.showInfo();
        consumer.pay(seller);
        seller.showInfo();
        consumer.showInfo();
    }
}
