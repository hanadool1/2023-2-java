package com.green.day9.ch5;

public class MultiArray {
    public static void main(String[] args) {
        int[][] arr = {
                {100, 200},
                {300, 400},
                {500, 600}
        };
        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]);
        System.out.println(arr[2][0]);
        System.out.println(arr[2][1]);

        System.out.println("-------------");
        int[] intArr = arr[2];
        System.out.println(intArr[1]);
        System.out.println("-------------");
        System.out.println("arr.length : " + arr.length);
        System.out.println("arr[0].length : " + arr[0].length);
    }
}
