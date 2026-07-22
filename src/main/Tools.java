package main;

public class Tools {
    public static char option = 'A';
    public char alternative = 'a';

    public static void printOption() {
        char altern = 'a';
        System.out.println(option);
        System.out.println(altern);
    }

    public void printAlternative() {
        char altern = 'a';
        System.out.println(alternative);
        System.out.println(altern);
        printOption();
    }

    public void printOp() {
        System.out.println(option);
    }

    public static void display(String str) {
        System.out.println(str);
    }

    public static void display(double num) {
        System.out.println(num);
    }

    public static void display(int n1, int n2) {
        System.out.println("" + n1 + n2);
    }

    public static void display(int num) {
        System.out.println(num);
    }

    public static double sum(double num1, double num2) {
        double result = num1 + num2;
        System.out.println("O resultado da soma é: " + result + ".");
        return result;
    }
}
