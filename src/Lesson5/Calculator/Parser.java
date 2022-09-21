package Lesson5.Calculator;

public class Parser {
    private double fist;
    public double second;

    private String operation;

    public Parser(String str) {
        String[] s = str.split(" ");

        fist = Double.parseDouble(s[0]);
        operation = s[1];
        second = Double.parseDouble(s[2]);
    }

    public double getFist() {
        return fist;
    }
    public double getSecond() {
        return second;
    }

    public String getOperation() {
        return operation;
    }
}
