package edu.iims.mcs.oops.week2.callbyvalue;

public class CallByReference {

    int data = 50;

    void change(CallByReference callByReference) {
        callByReference.data = callByReference.data + 100;
    }

    public static void main(String[] args) {
        CallByReference callByReference = new CallByReference();
        System.out.println("before change " + callByReference.data);

        callByReference.data = 100;
        callByReference.change(callByReference);

        System.out.println("after change " + callByReference.data);
    }
}
