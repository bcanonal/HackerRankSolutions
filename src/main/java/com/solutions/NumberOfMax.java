package com.solutions;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberOfMax {

    @Test
    void findNumberOfDublicatedElement(){

        List<Integer> myList = new ArrayList<Integer>(Arrays.asList(5,5,5,5,5,3,3,2,4));

        int numberOfOccurrence = 0;
        int maxNumber = myList.get(0);
        for (int i = 0; i < myList.size(); i++){
            if (myList.get(i) > maxNumber){
                maxNumber = myList.get(i);
            }
        }
        for (int i = 0; i < myList.size(); i++){
            if (maxNumber == myList.get(i)) {
                numberOfOccurrence++;
            }
        }
        System.out.println(numberOfOccurrence);
    }
}
