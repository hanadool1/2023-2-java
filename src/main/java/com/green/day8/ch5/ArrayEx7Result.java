package com.green.day8.ch5;

import java.util.Arrays;

public class ArrayEx7Result {
    public static void main(String[] args) {
        // 1. 정수 10개를 저장할 수 있는 배열을 만든다.
        // 0~9 값을 순차적으로 대입한다.
        // 순서 섞기
        int[] arr = new int[10];
        for (int i=0; i<arr.length; i++) {
            arr[i] = i;
        }
        System.out.println(Arrays.toString(arr));

        for (int i=0; i< arr.length; i++){
            // 0~9
            int rIdx = (int)(Math.random() * arr.length);
            if (i == rIdx) { continue; }
            int tmp = arr[i];
            arr[i] = arr[rIdx];
            arr[rIdx] = tmp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
