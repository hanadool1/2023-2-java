package com.green.day8.ch5;

import java.util.Arrays;

public class ArrayToStringMissionResult3 {
    public static void main(String[] args) {
        int[] arr = { 5, 10, 7, 3, 20, 11 };
        System.out.println(Arrays.toString(arr));
        // for문을 활용하여 콘솔에 { 5, 10, 7, 3 } 출력하시오

        System.out.println("---------------------");

        System.out.printf("[%d", arr[0]);   // [첫번째 숫자 출력
        for (int i=1; i<arr.length; i++) {  // i가 1부터 시작, 배열의 길이만큼 반복
            System.out.printf(", %d", arr[i]);  // , 숫자 , 숫자 , 숫자 ...
        }
        System.out.println("]");    // for문 밖에서 ]출력, 안에서 출력한다면 if문 사용해서 계속 검증해야 함

    }
}
