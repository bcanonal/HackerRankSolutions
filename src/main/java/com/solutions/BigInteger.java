package com.solutions;

import java.util.Scanner;

public class BigInteger {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        java.math.BigInteger first = scanner.nextBigInteger();
        java.math.BigInteger second = scanner.nextBigInteger();
        java.math.BigInteger sum =first.add(second);
        java.math.BigInteger mul =first.multiply(second);
        System.out.println(sum);
        System.out.println(mul);;


    }
}
