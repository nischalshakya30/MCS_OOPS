package edu.iims.mcs.oops.week2.wrapperclass;

public class WrapperClass {

    public static void main(String[] args) {
        int a = 10;
        Integer intA = a; // Autoboxing
        System.out.println(intA);

        Integer b = 10;
        int c = a; // Unboxing
        System.out.println(c);
    }
}
