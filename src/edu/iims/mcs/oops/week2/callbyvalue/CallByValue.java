package edu.iims.mcs.oops.week2.callbyvalue;

public class CallByValue {

    int data = 50;

    void change(int data) {
        data = data + 100;
        System.out.println(data);
    }

    void display() {
        System.out.println("after change " + data);
    }

    public static void main(String args[]) {
        CallByValue op = new CallByValue();
        System.out.println("before change " + op.data);
        op.change(500);
        op.display();
    }
}
