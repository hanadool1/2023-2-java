package com.green.day9.ch5;

import java.util.Arrays;

public class ArrayEx11 {
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

        for (int i=0; i<LEN; i++) {
            int ran = (int)(Math.random()*10);
            numArr[i] = ran;
        }
        System.out.println(Arrays.toString(numArr));

        for (int i=0; i<LEN; i++) {
            cntArr[numArr[i]] += 1;     // cntArr[numArr[i]] = cntArr[numArr[i]] + 1
        }

        for (int i=0; i<LEN; i++) {
            System.out.printf("%d의 개수 : %d\n", i, cntArr[i]);
        }
    }
}
