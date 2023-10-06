package com.green.day7.ch5;

public class Array3MissionResult2 {
    public static void main(String[] args) {
        int[] arr1 = {5, 10, 15, 16, 17};

        // arr2는 arr1보다 1 더 큰 배열을 만든다. arr1과 같은 방은 같은 값을 가지고 있고 --> 동등성(true)
        // 마지막 방은 20을 갖고 있는 배열을 만들어 주세요.    --> 동일성(false) => deep copy 실행

        int[] arr2 =new int[arr1.length + 1]; // 리터럴 사용하지 않음, 유연하게 대응

        for (int i=0; i<arr1.length; i++) {   // deep copy를 위한 for문
            arr2[i] = arr1[i];
        }
        arr2[arr1.length] = 20; // 마지막 방에 20을 저장

        for (int i=0; i<arr2.length; i++) {  // 출력을 위한 for문
            System.out.printf("arr2[%d] : %d\n", i , arr2[i]);
        }
    }
}
