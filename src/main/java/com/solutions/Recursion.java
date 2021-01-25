package com.solutions;

public class Recursion {
    public static void main(String[] args) {
        rec(4, 5);
    }
    public static void rec(int n, int m) {
        if (n == 0) {
            System.out.println(n);
        } else {
            System.out.println(n);
            n--;
            rec(n, m);
        }
    }
}
