package edu.iims.mcs.oops.week5.trycatch;

public class UncheckedExceptionScenario {

    static void exceptionNotHandled() {
        int a = 100 / 0;
        System.out.println("Exception is not handled");
    }

    static void exceptionHandled() {
        try {
            int a = 100 / 0;
            System.out.println("value of a " + a);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println("Finally block executed.");
        }
        System.out.println("2. Exception Handled");
    }

    public static void main(String[] args) {
        exceptionHandled();
    }
}
