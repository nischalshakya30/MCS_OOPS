package edu.iims.mcs.oops.week2.withoutencapsulation;

public class Student {

    long id;

    String name;

    public static void main(String[] args) {
        Student student = new Student();
        student.id = 1;
        student.name = "Nischal Shakya";

        System.out.println("Id: " + student.id);
        System.out.println("Name: " + student.name);
    }
}
