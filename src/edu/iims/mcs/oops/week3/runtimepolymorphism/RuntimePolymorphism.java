package edu.iims.mcs.oops.week3.runtimepolymorphism;

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

class Car extends Vehicle {

    @Override
    void run() {
        System.out.println("Car is running");
    }
}


public class RuntimePolymorphism {

    public static void main(String[] args) {
        Vehicle v = new Bike();
        v.run();
        v = new Car();
        v.run();
    }
}
