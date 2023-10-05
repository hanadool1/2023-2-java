package com.green.day7.ch5;

public class Array {
    public static void main(String[] args) {
        int n1 = 10, n2 = 20, n3 = 30;
        int[] arr = {10, 20, 30, 40};   // int형 배열 선언과 동시에 빈 방에 10,20,30,40 들어가있음(저장)
        String[] arr2 = {"a", "b", "가가", "나나"};

        int[] arr3 = new int[3];    // 각 방에는 0이 들어가있음.
        int arr4[] = new int[3];

        arr[0]  = 200;

        System.out.println("arr[0] : " + arr[0]);
        System.out.println("arr[1] : " + arr[1]);
        System.out.println("arr[2] : " + arr[2]);

        System.out.println("arr.langth : " + arr.length);


    }
}
