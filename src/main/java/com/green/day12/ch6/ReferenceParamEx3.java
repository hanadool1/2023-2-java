package com.green.day12.ch6;

import java.util.Arrays;

public class ReferenceParamEx3 {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 1, 6, 5, 4 };
        printArr(arr); //[3, 2, 1, 6, 5, 4]
        System.out.println(Arrays.toString(arr)); //[3, 2, 1, 6, 5, 4]
        sortArr(arr);

        printArr(arr); //[1, 2, 3, 4, 5, 6]
        System.out.println(Arrays.toString(arr)); //[1, 2, 3, 4, 5, 6]

        System.out.println("sum = " + sumArr(arr));
    }
    public static int sumArr(int[] arr) {
        int sum = 0;
        for(int val : arr) {
            sum += val;
        }
        return sum;
    }

    public static void printArr(int[] arr) {
        System.out.printf("[%d", arr[0]);
        for(int i=1; i<arr.length; i++) {
            System.out.printf(", %d", arr[i]);
        }
        System.out.println("]");
    }

    public static void sortArr(int[] arr) { //오름차순
        for(int i=arr.length-1; i>0; i--) {
            for(int z=0; z<i; z++) {
                int nIdx = z + 1;
                if(arr[z] > arr[nIdx]) {
                    int tmp = arr[z];
                    arr[z] = arr[nIdx];
                    arr[nIdx] = tmp;
                }
            }
        }
    }
}