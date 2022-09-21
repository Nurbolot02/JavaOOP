package Lesson5.Calculator;

import java.util.Scanner;

public class View {
    public static String getArithmetic(){
        System.out.print("Enter MathArithmetics (+-*/): ");
        return new Scanner(System.in).nextLine();
    }
    public static void printResult(double str){
        System.out.println(str);
    }
}

