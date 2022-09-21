package Lesson5.Calculator;

public class Presenter {
    public static void start() {
        String readText = View.getArithmetic();
        Parser parser = new Parser(readText);
        Rational rational = new Rational(parser);
        double res = rational.solve();

        View.printResult(res);
    }

}
