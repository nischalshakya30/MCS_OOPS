package edu.iims.mcs.oops.week5.customexception;

public class InvalidAgeExceptionTest {

    static void validate(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age is not valid to vote.");
        } else {
            System.out.println("Welcome to the vote.");
        }
    }

    public static void main(String[] args) {
        try {
            validate(13);
        } catch (InvalidAgeException e) {
            e.printStackTrace();
        }
    }
}
