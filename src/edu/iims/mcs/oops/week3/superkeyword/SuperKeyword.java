package edu.iims.mcs.oops.week3.superkeyword;

class Person {

    int id;

    String name;

    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("Id " + this.id);
        System.out.println("Name " + this.name);
    }

}

class Employee extends Person {

    float salary;

    Employee(int id, String name, float salary) {
        super(id, name); // call parent class constructor
        this.salary = salary;
    }

    void display() {
        System.out.println("Id " + super.id); // call parent class instance variable
        System.out.println("Name " + super.name); // call parent class instance variable
        System.out.println("Salary " + salary);
    }

    void callParentMethod() {
        super.display(); // call parent class method
    }

}

public class SuperKeyword {

    public static void main(String[] args) {
        Employee employee = new Employee(1, "Ram", 200.00f);
        employee.display();
        System.out.println("----------------------------------");
        employee.callParentMethod();
    }

}
