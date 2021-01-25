package com.solutions;

import org.junit.jupiter.api.Test;

public class MinMaxSum {

    @Test
     void miniMaxSum() {
        int[] myArr = new int[]{256741038, 623958417, 467905213, 714532089, 938071625};

                long min = myArr[1];
                long max = myArr[1];
                long sum = 0;
                for (int i = 0; i < myArr.length; i++) {
                    if(myArr[i] < min){
                        min = myArr[i];
                    }
                    if(myArr[i] > max){
                        max = myArr[i];
                    }
                    sum += myArr[i];
                }
                System.out.println(sum - min);
                System.out.println(sum - max);
    }
}
