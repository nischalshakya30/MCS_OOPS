package edu.iims.mcs.oops.week3.polymorphism;

public class MethodOverloading {

    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        int resultOne = add(1, 2);
        System.out.println("With two int parameter " + resultOne);

        int resultTwo = add(1, 2, 3);
        System.out.println("With two int parameter " + resultTwo);

        double resultThree = add(2.1, 4.2);
        System.out.println("With two double parameter " + resultThree);
    }

}
