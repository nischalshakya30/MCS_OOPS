package edu.iims.mcs.oops.week2.withencapsulation;

public class Student {

    private long id;

    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.setId(1);
        student.setName("Nischal Shakya");

        System.out.println("Id: " + student.getId());
        System.out.println("Name: " + student.getName());
    }
}
