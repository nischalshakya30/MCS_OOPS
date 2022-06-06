package edu.iims.mcs.oops.week3.casting;

class Parent {
    String name;

    void display() {
        System.out.println("Parent method is called");
    }
}

class Child extends Parent {
    int age;

    @Override
    void display() {
        System.out.println("Child method is called");
    }
}

public class DownCasting {

    public static void main(String[] args) {
        Parent p = new Child(); // upcasting
        p.name = "Hari";

//        Child c = (Child) new Parent(); // gives ClassCastException in compile-time
        Child c = (Child) p;
        c.age = 10;

        System.out.println(c.name);
        System.out.println(c.age);

        c.display();

    }

}
