package com.green.day7.ch5;

public class Array {    // 배열 : 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것
    public static void main(String[] args) {
        int n1 = 10, n2 = 20, n3 = 30;
        int[] arr = {10, 20, 30, 40};   // int형 배열 선언과 동시에 빈 방에 10,20,30,40 들어가있음(초기화)
        String[] arr2 = {"a", "b", "가가", "나나"};

        int[] arr3 = new int[30];    // 각 방에는 0이 들어가있음.
        int arr4[] = new int[200];

        System.out.println("1 arr[0] : " + arr[0]);

        arr[0]  = 200;  // 쓰기

        System.out.println("2 arr[0] : " + arr[0]);
        System.out.println("arr[1] : " + arr[1]);
        System.out.println("arr[2] : " + arr[2]);

        System.out.println("arr.langth : " + arr.length);
        System.out.println("arr3.langth : " + arr3.length);
        System.out.println("arr4.langth : " + arr4.length);


    }
}
