package com.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HackerRank {
    public static void main(String[] args) {

        Scanner solution = new Scanner(System.in);

        List<String> inputs = new ArrayList<String>(Arrays.asList(solution.nextLine()));

        for (int i = 1; i <= inputs.size(); i++ ){
            System.out.println(i +" "+ inputs.get(i-1));
            if(solution.hasNext()){
                inputs.add(solution.nextLine());
            }
        }
        solution.close();
    }
}
