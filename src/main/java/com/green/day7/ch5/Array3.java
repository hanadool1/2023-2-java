package com.green.day7.ch5;

public class Array3 {
    public static void main(String[] args) {
        int[] arr1 = {5, 10, 15, 20};
        int[] arr2 = new int[arr1.length];  // deep copy위해 arr1과 같은 똑같은 크기의 공간 생성
        String[] arr3 = new String[arr1.length];

        System.out.println("---------arr3");
        for (int i=0; i<arr3.length; i++) {
            System.out.printf("arr3[%d] : %d\n", i, arr3[i]);
        }

        for (int i=0; i<arr1.length; i++) { // deep copy, 깊은 복사, 실제 값 복사, 동등성(true), 동일성(false)
            arr2[i] = arr1[i];  // arr1이 가지고 있는 값을 복사하기 위해 for문을 통해 하나하나씩 복사하는 과정
        }

        // 동등성(같은 값을 가지고 있는가,equals) , 동일성( == )

        arr2[1] = 200;  // 복사가 이루어진 후에 서로 다른 값을 가지고 있을 수 있음

        System.out.println("---------arr1");
        for (int i=0; i< arr1.length; i++) {
            System.out.printf("arr1[%d] : %d\n", i, arr1[i]);
        }

        System.out.println("---------arr2");
        for (int i=0; i< arr2.length; i++) {
            System.out.printf("arr2[%d] : %d\n", i, arr2[i]);
        }
    }
}
