package com.green.day7.ch5;

public class Array2 {
    public static void main(String[] args) {
        int[] arr1 = {100, 200};
        int[] arr2 = {5, 15, 20};

        for (int i=0; i< arr1.length; i++) {    // 2번만 도는 for문
            System.out.printf("arr1[%d]: %d\n", i, arr1[i]);
        }

        arr1 = arr2;  // shallow copy, 얕은 복사, 주소값 복사, 동일성(true), 동등성(true)

        System.out.println("----------------");

        arr1[1] = 44;
        arr2[2] = 55;

        for (int i=0; i< arr1.length; i++) {
            System.out.printf("arr1[%d]: %d\n", i, arr1[i]);
        }

        System.out.println("||||||||||||||||");

        for (int i=0; i< arr2.length; i++) {
            System.out.printf("arr2[%d]: %d\n", i, arr2[i]);
        }
        System.out.println("arr1 == arr2 : " + (arr1 == arr2));
    }
}