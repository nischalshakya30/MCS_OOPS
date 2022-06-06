package edu.iims.mcs.oops.week2.inheritance;

class Person {
    String name;

    protected void display(){
        System.out.println("This is person class");
    }
}

public class Teacher extends Person{

    Double salary;

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.name = "Hari Maharjan";
        teacher.salary = 100.0;

        System.out.println("Teacher name " + teacher.name);
        System.out.println("Teacher salary " + teacher.salary);

        teacher.display();
    }
}
