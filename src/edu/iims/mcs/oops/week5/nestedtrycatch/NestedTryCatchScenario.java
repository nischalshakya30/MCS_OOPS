package edu.iims.mcs.oops.week5.nestedtrycatch;

public class NestedTryCatchScenario {

    public static void main(String[] args) {

        try {
            try {
                System.out.println("going to divide by 0");
                int b = 39 / 0;
            } catch (ArithmeticException e) {
                System.out.println(e);
            }

            try {
                int a[] = new int[5];
                a[5] = 4;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }

            String s = null;
            System.out.println(s.toUpperCase());

            System.out.println("other statement");
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("normal flow..");
    }
}

