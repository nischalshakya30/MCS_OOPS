package edu.iims.mcs.oops.week8.advantage;

import java.util.ArrayList;
import java.util.List;

public class TypeSafetyDemo {

    static void withoutTypeSafety() {
        List list = new ArrayList<>();
        list.add(1);
        list.add("String");

        System.out.println(list);
    }

    static void withTypeSafety() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);

        System.out.println(numbers);
    }

    public static void main(String[] args) {
        withoutTypeSafety();
        withTypeSafety();
    }
}
