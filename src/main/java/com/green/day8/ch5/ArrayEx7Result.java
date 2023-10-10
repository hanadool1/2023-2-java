package com.green.day8.ch5;

import java.util.Arrays;

public class ArrayEx7Result {
    public static void main(String[] args) {
        // 1. 정수 10개를 저장할 수 있는 배열을 만든다.
        // 0~9 값을 순차적으로 대입한다.
        // 2. 순서 섞기
        int[] arr = new int[10];
        for (int i=0; i<arr.length; i++) {
            arr[i] = i;
        }
        System.out.println(Arrays.toString(arr));

        for (int i=0; i< arr.length; i++){  // 셔플 0~9
            int rIdx = (int)(Math.random() * arr.length);   // 0~9의 랜덤 숫자 나오게 함
            if (i == rIdx) {
                continue; // i랑 랜덤값이 같다면 밑에 것 무시
            }
            int tmp = arr[i];   // i의 값을 tmp에 저장
            arr[i] = arr[rIdx]; // 랜덤값을 i에 저장
            arr[rIdx] = tmp;    // tmp에 있던 값을 랜덤값에 저장
        }
        System.out.println(Arrays.toString(arr));
    }
}
