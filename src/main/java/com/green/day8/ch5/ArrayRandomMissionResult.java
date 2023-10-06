package com.green.day8.ch5;

import java.util.Arrays;

public class ArrayRandomMissionResult {
    public static void main(String[] args) {
        /*
        5개의 방을 갖고 있는 정수형 배열을 만들고
        각 방의 1~5의 랜덤한 값을 넣어주세요
        중복제거
         */
        int[] arr = new int[5];

        for (int i=0; i<arr.length; i++) {
            arr[i] = (int)(Math.random()* 5 ) + 1;

            for (int z=0; z<i; z++) {
                if(arr[i] == arr[z]) {
                    i--;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}

