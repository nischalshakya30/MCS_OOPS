package edu.iims.mcs.oops.week2.arrays;

public class MultiDimensional {

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {2, 4, 5}, {4, 4, 5}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Value of array at index arr[" + i + "][" + j + "] " + arr[i][j]);
            }
            System.out.println();
        }
    }
}
