package com.solutions;

public class NumberLineJumps {
    public static void main(String[] args) {
        // kangaroo(0,2,5,3);
        System.out.println(kangaroo(0, 3, 4, 2));
    }
    static String kangaroo(int x1, int v1, int x2, int v2) {
        for (int i = 0; i <10000; i++) {
            x1 += v1;
            x2 += v2;
            if (x1 == x2) {
                return "YES";
            }
        }
        return "NO";
    }
}
