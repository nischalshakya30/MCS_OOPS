package edu.iims.mcs.oops.week5.throwscenario;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsKeyword {


    /**
     * If the age is less than 18, throw an ArithmeticException, otherwise print a message
     *
     * @param age The age of the person.
     */
    static void validAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Not eligible for the vote.");
        } else {
            System.out.println("Eligible for the vote.");
        }
    }

    /**
     * ReadFromFile() throws a FileNotFoundException if the file is not found.
     */
    static void readFromFile() throws FileNotFoundException {
        FileReader file = new FileReader("abc.txt");
        BufferedReader fileInput = new BufferedReader(file);
    }

    public static void main(String[] args) {
        // Throwing the unchecked exception
        try {
            validAge(15);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // Throwing checked exception
        try {
            readFromFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
