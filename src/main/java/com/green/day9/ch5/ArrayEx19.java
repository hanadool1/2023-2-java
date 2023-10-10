package com.green.day9.ch5;

import java.util.Arrays;

public class ArrayEx19 {
    public static void main(String[] args) {
        int[][] score = {
                 {101, 102, 103}    // 1번사람의 국영수 점수
                ,{21, 22, 23}       // 2번사람의 국영수 점수
                ,{31, 32, 33}
                ,{41, 42, 43}
                ,{51, 52, 53}
        };
        /*
        번호 국어 영어 수학 총점 평균
        -------------------------
        1   101  102 103 306 102.0
        ...
        5   51   52  53  156 52.0
        -------------------------
        총점 ??  ??  ??
         */

        int sum = 0;
        int avg = 0;
        for (int i=0; i<score.length; i++) {
            for (int z=0; z<score[i].length; z++) {
                sum = sum + score[i][z];
                avg = sum / score[i].length;
            }
        }

//        for (int i=1; i<5; i++) {
//            for (int z=0; z<5; z++) {
//                int sum = score[i][z];
//
//                score[i][4] = score[i][z];
//                int sum = score[i][4];
//                int avg = score[i][4] / score[i].length;
//                System.out.printf("%d \t %d \t %d \t %d \t %d \t %d", i, score[i][z], score[i][z], score[i][z], sum, avg);
//                System.out.print();
//            }
//
//        }

    }
}
