package edu.iims.mcs.oops.week9.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {

    private int id;

    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class SerializationDemo {

    static void writeObjectInFile() {
        Student student = new Student(1, "Ram");
        try {
            FileOutputStream fos = new FileOutputStream("serialization.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(student);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void readObjectFormFile() {
        try {
            FileInputStream fis = new FileInputStream("serialization.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student s = (Student) ois.readObject();
            System.out.println("Id " + s.getId());
            System.out.println("Name " + s.getName());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        writeObjectInFile();
        readObjectFormFile();
    }
}
