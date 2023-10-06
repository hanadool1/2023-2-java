package com.green.day8.ch5;

public class ArrayEx5Result {
    public static void main(String[] args) {
        int[] score = { 100, 88, 100, 100, 90 }; // 누군가의 과목점수
        // 총점 점수
        // 평균 점수

        int sum = 0;
        for (int i=0; i<score.length; i++) {
            sum = sum + score[i];   // sum += score[i]
        }
        System.out.printf("총점 : %d\n", sum);
        System.out.printf("평균 : %d\n", sum / 5);
    }
}
