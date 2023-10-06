package com.green.day8.ch5;

public class ArrayEx2 {
    public static void main(String[] args) {
        /*
        5개의 방을 갖고 있는 정수형 배열을 만들고
        각 방의 1~10의 랜덤한 값을 넣어주세요
        중복허용
         */
        int[] arr = new int[5];

        for (int i=0; i<arr.length; i++) {
            arr[i] = (int)(Math.random() * 10) + 1;
            System.out.printf("arr[%d] : %d\n",i , arr[i]);
        }
    }
}
