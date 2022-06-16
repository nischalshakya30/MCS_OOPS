package edu.iims.mcs.oops.week8.generic.genericmethod;

public class ArrayGenerics {

    public static <E> void printArray(E[] elements) {
        for (E element : elements) {
            System.out.println(element);
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Integer[] intArray = {10, 20, 30, 40, 50};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O', 'W', 'O', 'R', 'L', 'D'};

        System.out.println("Printing Integer Array");
        printArray(intArray);

        System.out.println("Printing Character Array");
        printArray(charArray);
    }
}
