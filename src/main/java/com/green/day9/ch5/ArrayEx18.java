package com.green.day9.ch5;

public class ArrayEx18 {
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
            for (int z=0; z<score[i].length; z++) {
                System.out.printf("score[%d][%d] = %d\n", i, z, score[i][z]);
                sum = sum + score[i][z];
            }
        }
        System.out.println("sum : " + sum);

    }
}
