package Lesson2.Store;

import java.util.Iterator;

public abstract class Human implements Communication, GetInfo, Dispute, Iterator<String> {
    private String name;
    private double money;
    private int loveIndex;
    private int maxLoveIndex;
    private int index = 0;

    public Human(String name, double money, int loveIndex) {
        this.name = name;
        this.money = money;
        this.loveIndex = loveIndex;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public int getMaxLoveIndex() {
        return maxLoveIndex;
    }

    public void setMaxLoveIndex(int maxLoveIndex) {
        this.maxLoveIndex = maxLoveIndex;
    }

    public int getLoveIndex() {
        return loveIndex;
    }

    public void setLoveIndex(int loveIndex) {
        this.loveIndex = loveIndex;
    }

    public abstract void Discount(Item bucket);

    @Override
    public boolean hasNext() {
        return index++ < 4;
    }

    @Override
    public String next() {
        switch (index){
            case 1:
                return name;
            case 2:
                return String.valueOf(money);
            case 3:
                return String.valueOf(loveIndex);
            case 4:
                return String.valueOf(maxLoveIndex);
        }
        return "";
    }
}
