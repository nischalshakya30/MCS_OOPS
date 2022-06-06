package edu.iims.mcs.oops.week3.finalkeyword;

class Bike {
    int speedLimit = 90;

    void run() {
        speedLimit = 100;
    }
}

class Honda extends Bike {

    void run() {
        System.out.println("Override method");
    }
}

public class FinalKeywordDemo {

    public static void main(String[] args) {

    }
}
