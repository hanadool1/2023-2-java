package com.green.day8.ch5;

import java.util.Arrays;

public class ArrayToStringMissionResult2 {
    public static void main(String[] args) {
        int[] arr = { 5, 10, 7, 3, 20, 11 };
        System.out.println(Arrays.toString(arr));
        // for문을 활용하여 콘솔에 { 5, 10, 7, 3 } 출력하시오

        System.out.println("---------------------1");
        int commaLen = arr.length -1;
        System.out.print("[");
        for (int i=0; i< arr.length; i++) {
            System.out.print(arr[i]);
            if (i < commaLen) {
                System.out.print(", ");
            }
        }
        System.out.print("]");

        System.out.println();
        System.out.println("---------------------2");
        System.out.print("[");
        for (int i=0; i< arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr[0]) {
                System.out.print(", ");
            }
        }
        System.out.print("]");

        System.out.println();
        System.out.println("---------------------3");


    }
}
