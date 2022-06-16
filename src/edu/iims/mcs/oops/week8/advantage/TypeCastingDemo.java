package edu.iims.mcs.oops.week8.advantage;

import java.util.ArrayList;
import java.util.List;

public class TypeCastingDemo {

    static void typeCastingRequired() {
        List list = new ArrayList();
        list.add("hello");
        String s = (String) list.get(0);//typecasting
        System.out.println(s);
    }

    static void withoutTypeCasting() {
        List<String> list = new ArrayList<>();
        list.add("hello");
        String s = list.get(0);
        System.out.println(s);
    }

    public static void main(String[] args) {
        typeCastingRequired();
        withoutTypeCasting();
    }
}
