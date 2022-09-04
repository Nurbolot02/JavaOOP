package Lesson3;

public class Student implements GetInfo{
    private String name;
    private int age;
    private int height;
    private double weight;
    private boolean illness;

    public Student(String name, int age, int height, double weight, boolean illness) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.illness = illness;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isIllness() {
        return illness;
    }

    public void setIllness(boolean illness) {
        this.illness = illness;
    }
}
