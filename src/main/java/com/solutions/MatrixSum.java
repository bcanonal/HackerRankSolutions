package com.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MatrixSum {

    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<List<Integer>>();
        List<Integer> first = Arrays.asList(3,2,6);
        List<Integer> second = Arrays.asList(4,5,6);;
        List<Integer> third = Arrays.asList(9,8,9);;
        arr.add(first);
        arr.add(second);
        arr.add(third);
        System.out.println(diagonalDifference(arr));
    }
    public static int diagonalDifference(List<List<Integer>> arr) {
        int secondSum = 0;
        int firstSum = 0;
        int h = 0;
        for(int i = 0; i < arr.size(); i++){
            secondSum += arr.get(i).get(i);
        }
        for(int j = arr.size() - 1; j >= 0; j--) {
            firstSum += arr.get(h).get(j);
            h++;
        }
        System.out.println(secondSum);
        System.out.println(firstSum);
        return arr.get(1).get(2);
    }

}



