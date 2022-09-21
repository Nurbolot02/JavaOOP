package Lesson5.Calculator;

public class Rational implements MathArithmetics {
    private double a;
    private double b;
    private String mathOperation;

    public Rational(Parser parser) {
        this.a = parser.getFist();
        this.b = parser.getSecond();
        this.mathOperation = parser.getOperation();
    }

    public double solve() {
        switch (mathOperation) {
            case "+":
                return sum();
            case "-":
                return sub();
            case "/":
                return div();
            case "*":
                return mul();
            default:
                throw new IllegalArgumentException("IllegalArgumentException");
        }
    }

    @Override
    public double sum() {
        return a + b;
    }

    @Override
    public double sub() {
        return a - b;
    }

    @Override
    public double mul() {
        return a * b;
    }

    @Override
    public double div() {
        return a / b;
    }
}
