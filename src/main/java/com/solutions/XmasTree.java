package com.solutions;

public class XmasTree {
    public static void main(String[] args) {
        staircase(6);
    }
    static void staircase(int n) {
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= n - i; ++j) {
                System.out.print('0');
            }
            for (int j = n - i + 1; j <= n; ++j) {
                System.out.print('#');
            }
            System.out.println();
        }
    }
}
