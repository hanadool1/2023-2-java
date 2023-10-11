package com.green.day9.ch5;

import java.util.Arrays;

public class ArrayEx11Result {
    public static void main(String[] args) {
        final int LEN = 10;
        int[] numArr = new  int[LEN];
        int[] cntArr = new  int[LEN];

        /*
        numArr 각 방에 0~9사이의 랜덤값을 대입(중복허용)
        numArr 각 방의 값도 출력
        cntArr의 0번방은 0의 개수, 1번방은 1의 개수 count값을 넣는다.
        0~9의 개수를 출력

        [4, 4, 4, 6, 5, 7, 9, 7, 5, 3]
        0의 개수 : 0
        1의 개수 : 0
        ...
        3의 개수 : 1
        4의 개수 : 3
        ...
         */

        for (int i=0; i<LEN; i++) { // numArr 각 방에 0~9사이의 랜덤값을 대입(중복허용)
            int rVal = (int)(Math.random() * LEN);  // 0~9 랜덤값 추출
            numArr[i] = rVal;   // 랜덤값을 numArr 배열에 순차적으로 값을 넣어준다
        }
        System.out.println(Arrays.toString(numArr));    // numArr배열의 값 출력, 랜덤값이 들어갔는지 검증

        /*
        for (int i=0; i<LEN; i++) {   // cntArr의 0번방은 0의 개수, 1번방은 1의 개수 count값을 넣는다.
            int val = numArr[i];
            cntArr[val]++;
            }
         */

        for (int n : numArr) { // 향상된 for문
            cntArr[n]++;
        }
            /*
            cntArr[val]++;
            cntArr[val] += 1;
            cntArr[val] = cntArr + 1;
             */
        System.out.println(Arrays.toString(cntArr));    // cntArr배열의 값 출력, i의 개수 검증
    }
}
