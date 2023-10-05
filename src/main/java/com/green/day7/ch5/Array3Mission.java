package com.green.day7.ch5;

public class Array3Mission {
    public static void main(String[] args) {
        int[] arr1 = {5, 10, 15};

        // arr2는 arr1보다 1 더 큰 배열을 만든다. arr1과 같은 방은 같은 값을 가지고 있고 --> 동등성(true)
        // 마지막 방은 20을 갖고 있는 배열을 만들어 주세요.    --> 동일성(false) => deep copy 실행

        int[] arr2 = new int[4];    // deep copy 전 길이가 4인 방 생성
        for (int i=0; i<arr1.length; i++) { // deep copy를 위한 for문
            arr2[i] = arr1[i];  // arr1이 가지고 있는 값을 복사하기 위해 for문을 통해 하나하나씩 복사하는 과정
        }

        for (int i=0; i<arr1.length; i++) { // 출력을 위한 for문
            System.out.printf("arr1[%d] : %d\n", i, arr1[i]);
        }
        System.out.println("--------------");
        arr2[3] = 20;   // 마지막 방에 20을 저장하는 과정
        for (int i=0; i<arr2.length; i++) { // 출력을 위한 for문
            System.out.printf("arr2[%d] : %d\n", i, arr2[i]);
        }
    }
}
