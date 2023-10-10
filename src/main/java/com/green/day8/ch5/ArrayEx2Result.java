package com.green.day8.ch5;

import java.util.Arrays;

public class ArrayEx2Result {
    public static void main(String[] args) {
        /*
        5개의 방을 갖고 있는 정수형 배열을 만들고
        각 방의 1~10의 랜덤한 값을 넣어주세요
        중복허용
         */
        final int LEN = 5;
        int[] arr = new int[LEN]; // 5개의 방을 갖고 있는 정수형 배열을 만들고
        for (int i=0; i<arr.length; i++) {  // 0부터 arr.length까지 반복
            arr[i] = (int)(Math.random() * 10) + 1; // 각 방의 1~10의 랜덤한 값을 넣어주세요
        }
        // 난수 생성 for문, 입력 / 쓰기

        for (int i=0; i<arr.length; i++) {
            arr[i] = (int)(Math.random() * 10) + 1;
            System.out.printf("arr[%d] : %d\n",i , arr[i]); // 출력
        }
        // 출력 for문, 읽기

        System.out.println(arr);
        System.out.println(arr.toString());
        System.out.println(Arrays.toString(arr));
    }
}
