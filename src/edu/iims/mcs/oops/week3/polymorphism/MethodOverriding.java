package edu.iims.mcs.oops.week3.polymorphism;

class Vehicle {

    void run() {
        System.out.println("Vehicle is running");
    }
}

class Bike extends Vehicle {

    @Override
    void run() {
        System.out.println("Bike is running");
    }
}

public class MethodOverriding {

    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        Bike bike = new Bike();
        bike.run();

    }
}
