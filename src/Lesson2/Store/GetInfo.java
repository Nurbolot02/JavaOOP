package Lesson2.Store;

public interface GetInfo {
    default void showInfo(Human human){
        System.out.println("Name: " + human.getName());
        System.out.println("money: " + human.getMoney());
        System.out.println("loveIndex: " + human.getLoveIndex());
        System.out.println();

    }
}
