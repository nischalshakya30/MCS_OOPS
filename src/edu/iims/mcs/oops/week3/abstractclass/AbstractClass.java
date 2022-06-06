package edu.iims.mcs.oops.week3.abstractclass;

abstract class Bike {

    int value =10;

    Bike() {
        System.out.println("Bike is created");
    }

    abstract void run();

    void changeGear() {
        System.out.println("Gear changed");
    }
}

class Honda extends Bike {


    @Override
    void run() {
        System.out.println("Honda is running");
    }
}

public class AbstractClass {

    public static void main(String[] args) {
        Bike b = new Honda();
        b.changeGear();
        b.run();
    }
}
