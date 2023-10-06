package com.green.day8.ch5;

public class ArrayEx5 {
    public static void main(String[] args) {
        int[] score = { 100, 88, 100, 100, 90 }; // 누군가의 과목점수
        // 총점 점수
        // 평균 점수

        int total = 0;
        for (int i=0; i<score.length; i++) {
            total = total + score[i];   // total += score[i]
        }
        System.out.printf("총점 : %d\n", total);

        int avg = total / score.length;
        System.out.printf("평균 : %d\n", avg);
    }
}
