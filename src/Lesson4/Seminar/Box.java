package Lesson4.Seminar;

import java.util.ArrayList;

public class Box<E extends Fruit> implements Comparable<Box> {
    private ArrayList<E> fruits;

    public Box() {
        this.fruits = new ArrayList<>();
    }

    public ArrayList<E> getFruits() {
        return fruits;
    }

    public void setFruits(ArrayList<E> fruits) {
        this.fruits = fruits;
    }

    public void add(E fruit) {
        fruits.add(fruit);
    }

    public float getWeight() {
        float res = 0;
        for (int i = 0; i < fruits.size(); i++) {
            res += fruits.get(i).getWeight();
        }
        return res;
    }

    public boolean compare(Box box) {
        return compareTo(box) == 0;
    }

    @Override
    public int compareTo(Box o) {
        return (int) (this.getWeight() - o.getWeight());
    }
}
