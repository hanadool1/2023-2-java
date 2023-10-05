package com.green.day7.ch5;

public class Array3MissionResult {
    public static void main(String[] args) {
        int[] arr1 = {5, 10, 15};

        // arr2는 arr1보다 1 더 큰 배열을 만든다. arr1과 같은 방은 같은 값을 가지고 있고 --> 동등성(true)
        // 마지막 방은 20을 갖고 있는 배열을 만들어 주세요.    --> 동일성(false) => deep copy 실행

        int[] arr2 =new int[4]; // 0,0,0,0 배열

        for (int i=0; i<arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        arr2[3] = 20;

        for (int i=0; i<arr2.length; i++) {
            System.out.printf("arr2[%d] : %d\n", i , arr2[i]);
        }
    }
}
