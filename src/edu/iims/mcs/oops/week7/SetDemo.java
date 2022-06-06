package edu.iims.mcs.oops.week7;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {
        Set<String> numberSets = new HashSet<>();
        numberSets.add("One");
        numberSets.add("Two");
        numberSets.add("Three");
        numberSets.add("Four");
        numberSets.add("Five");
        numberSets.add("Five");

        for (String s : numberSets) {
            System.out.println(s);
        }
    }
}
