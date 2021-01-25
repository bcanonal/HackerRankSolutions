package com.solutions;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class OneLineIf {

    @DisplayName("Java If One Line")
    @Test
    void test1() {
        int a = 7;
        int b = 5;
        int max = (a > b) ? a : b;
        System.out.println(max);
    }
    @Test
    @DisplayName("Java If-Else")
    void test2() {

        int n = 36;
        if ((n > 20) && (n % 2 == 0) || (n == 2) || (n == 4)) {
            System.out.println("not weird");
        } else {
            System.out.println("weird");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            System.out.printf("%-15s%03d%n", s1, x);
        }
        System.out.println("================================");
    }

    @Test
    void test3() {
        int N = 2;
        for (int i = 1; i < 11; i++) {
            int result = N * i;
            System.out.println(N + " * " + i + " = " + result);
        }
    }

    @Test
    void test4() {

        int a = 5;
        int b = 3;
        int n = 5;
        int sum = a;
        for (int x = 0; x < n; x++) {
            sum += ((int) Math.pow(2, x) * b);
            System.out.print(sum + " ");
        }
        System.out.println();
    }

    @Test
    void test5() {
        // System.out.println(Math.abs(-50));
        long x = -100;
        if (x >= -128 && x <= 127) {
            System.out.println("* byte");
        }
        if ((x <= 32767) && (x >= -32768)) {
            System.out.println("* short");
        }
        if ((x <= (int) Math.pow(2, 31) - 1) && (x >= (Math.pow(2, -31)))) {
            System.out.println("* int");
        }
        if ((x <= (long) Math.pow(2, 63) - 1) && (x >= Math.pow(2, -63))) {
            System.out.println("* long");
        }


    }
}

