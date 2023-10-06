package com.green.day8.ch5;

import java.util.Arrays;

public class ArrayEx7 {
    public static void main(String[] args) {
        // 1. 정수 10개를 저장할 수 있는 배열을 만든다.
        // 0~9 값을 순차적으로 대입한다.
        // 순서 섞기
        int[] arr = new int[10];
        for (int i=0; i<arr.length; i++) {
            arr[i] = i;
        }
        for (int z=0; z< arr.length +1; z++){
            int some = (int)(Math.random() * 10);
            some = arr[0];
            if (some != z) {
                some = z;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
