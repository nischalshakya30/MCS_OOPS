package edu.iims.mcs.oops.week2.withoutthiskeyword;

public class Employee {

    long id;

    String name;

    double salary;

    Employee(long id, String name, double salary) {
        id = id;
        name = name;
        salary = salary;
    }

    void display() {
        System.out.println(id + " " + name + " " + salary);
    }

    public static void main(String[] args) {
        Employee employee = new Employee(1L, "Nischal", 20.0);
        employee.display();
    }

}
