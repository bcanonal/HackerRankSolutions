package com.solutions;

import org.junit.Test;

public class AppleAndOrange {

    @Test
    public void appleAndOrange() {
        int[] apples = {2, 3, -4};
        countApplesAndOranges(7, 10, 4, 12, apples, new int[]{3, -2, -4});
    }

    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int samsApples = 0;
        for (int i = 0; i < apples.length; i++) {
            if ((a + apples[i] >= s) && (a + apples[i] <= t)) {
                samsApples++;
            }
        }
        int samsOrranges = 0;
        for (int i = 0; i < oranges.length; i++) {
            if ((b + oranges[i] <= t) && (b + oranges[i] >= s)) {
                samsOrranges++;
            }
        }
        System.out.println(samsApples);
        System.out.println(samsOrranges);
    }
}
