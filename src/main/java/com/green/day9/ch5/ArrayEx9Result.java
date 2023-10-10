package com.green.day9.ch5;

import java.util.Arrays;

public class ArrayEx9Result {
    public static void main(String[] args) {
        int[] code = {-4, -1, 3, 6, 11};
        int[] arr = new int[10];

        /*
        arr 각 방에 code에 있는 값만 랜덤하게 넣어주세요.
         */

        for (int i=0; i<arr.length; i++) { // arr 배열의 길이만큼 반복문
            int rIdx = (int)(Math.random() * code.length);   // 난수 생성, code배열의 길이만큼 (0~4 랜덤한 숫자 나옴)
            arr[i] = code[rIdx]; // code의 0~4번째 자리에 있는 숫자를 i에 저장
        }
        System.out.println(Arrays.toString(arr));
    }
}
