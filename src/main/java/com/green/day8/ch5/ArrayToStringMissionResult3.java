package com.green.day8.ch5;

import java.util.Arrays;

public class ArrayToStringMissionResult3 {
    public static void main(String[] args) {
        int[] arr = { 5, 10, 7, 3, 20, 11 };
        System.out.println(Arrays.toString(arr));
        // for문을 활용하여 콘솔에 { 5, 10, 7, 3 } 출력하시오

        System.out.println("---------------------");

        System.out.printf("[%d", arr[0]);
        for (int i=1; i<arr.length; i++) {
            System.out.printf(", %d", arr[i]);
        }
        System.out.println("]");

    }
}
