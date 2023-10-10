package com.green.day9.ch5;

public class ArrayEx18Result {
    public static void main(String[] args) {
        int[][] score = {
                 {101, 102, 103}
                ,{21, 22, 23}
                ,{31, 32, 33}
                ,{41, 42, 43}
        };
        /*
        리터럴 사용금지 (0만 사용가능)
        score[0][0] = 101
        score[0][1] = 102
        ...
        score[3][2] = 43
        sum = ??
         */

        int sum = 0;
        for (int i=0; i<score.length; i++) {
            int[] arr = score[i];
            for (int z=0; z<arr.length; z++) {
                 System.out.printf("score[%d][%d] = %d\n", i, z, arr[z]);
                 sum += arr[z];
//                System.out.printf("score[%d][%d] = %d\n", i, z, score[i][z]);
//                sum += score[i][z];
            }
        }
        System.out.println("sum : " + sum);


        // 향상된 for문을 이용하여 sum값을 구하고 싶다.
        int sum1 = 0;
        for (int[] arr : score) {
            for (int val : arr) {
                sum1 += val;
            }
        }
        System.out.println("sum1 : " + sum1);

    }
}
