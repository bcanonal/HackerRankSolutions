package com.solutions;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ValidUsername {
    @Test
    void userValidation() {
        List<String> id = new ArrayList<>(Arrays.asList("Julia", "Samantha", "Samantha_21", "1Samantha",
                "Samantha?10_2A", "JuliaZ007", "Julia@007", "_Julia007"));
        String abc = "";

        for (int i = 0; i < id.size(); i++) {
            abc = id.get(i);
            if (abc.length() >= 8 && abc.length() <= 30) {
                if (abc.matches("^[0-9].*$")) {
                    System.out.println(id.get(i) + " = invalid username");
                } else {
                    String abd = abc.replaceAll("(\\W|^_)*", "");
                    if (abd.length() != abc.length()) {
                        System.out.println(id.get(i) + " = invalid username");
                    } else {
                        System.out.println(id.get(i) + " = valid username");
                    }
                }

            } else {
                System.out.println(id.get(i) + " = invalid username");
            }
        }
    }
}