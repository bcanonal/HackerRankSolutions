package com.solutions;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GradingStudents {

    @Test
    public void gradingStudents() {
        List<Integer> grades = new ArrayList<Integer>(Arrays.asList(73, 67, 39, 33));

        System.out.println(getRoundedList(grades));
    }
    public List<Integer> getRoundedList(List<Integer> grades) {
        List<Integer> roundedList = new ArrayList<Integer>();
        for (int i = 0; i < grades.size(); i++) {
            if (grades.get(i) < 38) {
                roundedList.add(grades.get(i));
            } else {
                if (grades.get(i) % 5 >= 3) {
                    roundedList.add(grades.get(i) + (5 - grades.get(i) % 5));
                } else {
                    roundedList.add(grades.get(i));
                }
            }
        }
        return roundedList;
    }
}
