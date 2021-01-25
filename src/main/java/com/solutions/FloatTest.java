package com.solutions;

public class FloatTest {
    public static void main(String[] args) {

        int[] myList = {-4, 3, -9, 0, 4, 1};

       diagonalDifference(myList);
    }

    public static void diagonalDifference(int [] arr) {
        int pozNumbers = 0;
        int negNumbers = 0;
        int sero = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                pozNumbers++;
            } else if (arr[i] < 0) {
                negNumbers++;
            } else {
                sero++;
            }
        }
        System.out.printf("%.6f %n", (float) pozNumbers / arr.length);
        System.out.printf("%.6f %n", (float) negNumbers / arr.length);
        System.out.printf("%.6f %n", (float) sero / arr.length);
    }
}
