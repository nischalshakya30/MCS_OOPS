package edu.iims.mcs.oops.week5.multiplecatchblock;

public class MultipleCatchBlockScenario {

    public static void main(String[] args) {
        try {
            int a[] = new int[5];
            a[3] = 30 / 2;

            String s = null;
            System.out.println(s.toUpperCase());

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("rest of the code");
    }
}
