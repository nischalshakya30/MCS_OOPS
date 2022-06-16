package edu.iims.mcs.oops.week8.generic.genericclass;

public class GenericClassDemo {

    public static void main(String[] args) {
        MyGeneric<String> strings = new MyGeneric<>();
        strings.add("Hello world");
        System.out.println(strings.get());

        MyGeneric<Integer> integers = new MyGeneric<>();
        integers.add(1);
        System.out.println(integers.get());
    }
}
