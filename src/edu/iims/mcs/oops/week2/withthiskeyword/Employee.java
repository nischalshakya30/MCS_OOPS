package edu.iims.mcs.oops.week2.withthiskeyword;

public class Employee {

    long id;

    String name;

    double salary;

    Employee(long id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    Employee(){
        System.out.println("Default constructor called");
    }

    void display() {
        System.out.println(id + " " + name + " " + salary);
        this.displayTwo();
    }

    void displayTwo(){
        System.out.println("Hello world");
    }

    public static void main(String[] args) {
        Employee employee = new Employee(1L, "Nischal", 20.0);
        employee.display();
    }
}
