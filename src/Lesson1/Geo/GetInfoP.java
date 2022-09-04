package Lesson1.Geo;


public interface GetInfoP {
    default void showInfo() {
        ((Person) this).setIndex(0);
        while (((Person) this).hasNext()) {
            System.out.print(((Person) this).next() + " ");
        }
        System.out.println();
    }

}
