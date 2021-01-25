package com.solutions;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class JavaDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String two = "";

        for (int i = A.length() - 1; i >= 0; i--) {
            two += A.charAt(i);
        }
        if (A.equals(two)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    @Test
    void subString() {
        String S = "helloworld";
        int start = 3;
        int end = 7;
        String two = S.substring(start, end);
        System.out.println(two);
    }

    @Test
    void string() {
        String A = "java";
        String B = "hello";

        int ab = A.length() + B.length();
        System.out.println(ab);

        if (A.compareTo(B) > B.compareTo(A)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1) + " "
                + B.substring(0, 1).toUpperCase() + B.substring(1));
    }

    @Test
    void anagram() {
        String a = "anagram";
        String b = "margana";
        StringBuilder c = new StringBuilder(b);

        if (a.length() != b.length()) {
            System.out.println("no");
        }

        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < c.length(); j++) {
                if (a.charAt(i) == c.charAt(j)) {
                    c.deleteCharAt(j);
                    if (i == a.length() - 1 && c.length() == 0) {
                        System.out.println("ANAGRAM");
                        break;
                    }
                    break;
                }
            }

        }
    }

    @Test
    void tokens() {
        String s = "He is a very very good boy, isn't he?";
        String ss = s.replaceAll("[^a-zA-Z0-9]+ ", " ");
        String[] parts = ss.split(" ");
        System.out.println(parts.length);
        for (String part : parts) {
            System.out.println(part);
        }
    }
}


