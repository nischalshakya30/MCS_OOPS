package edu.iims.mcs.oops.week5.exceptionpropagation;

public class ExceptionPropagationScenario {

    void m() {
        int data = 50 / 0;
    }

    void n() {
        m();
    }

    void p() {
        try {
            n();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ExceptionPropagationScenario obj = new ExceptionPropagationScenario();
        obj.p();
        System.out.println("normal flow...");
    }
}
