package com.solutions;

import java.text.ParseException;

public class DatesAmtoPm {
    public static void main(String[] args) throws ParseException {

        System.out.println(timeConversion("03:01:00AM"));
    }

    static String timeConversion(String s) throws ParseException {
        String clock = null;
        if (s.endsWith("PM")) {
            if (s.startsWith("12")) {
                clock = s.substring(0, 8);
            } else {
                clock = Integer.valueOf(s.substring(0, 2)) + 12 + s.substring(2, 8);
            }
        } else {
            if (s.startsWith("12")) {
                clock = "00" + s.substring(2, 8);
            } else {
                clock = s.substring(0, 8);
            }
        }
        return clock;
    }
}
