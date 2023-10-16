package com.green.day12.ch6;

import com.green.day10.ch6.MethodExam;
import java.util.Arrays;

public class MethodExam4 {

    int[] plusMap(int[] arr, int val) {
        int[] temp = new int[arr.length];
        for(int i=0; i< temp.length; i++) {
            temp[i] = arr[i] + val;
        }
        return temp;
    }

    void plusOrigin(int[] arr, int val) {
        for(int i=0; i<arr.length; i++) {
            arr[i] += val;
        }
    }


    int[] randomValFromTo(int len, int min, int max) {
        int[] tmpArr = new int[len];
        MethodExam me = new MethodExam();
        for(int i=0; i<tmpArr.length; i++) {
            tmpArr[i] = me.randomValFromTo(min, max);
        }
        return tmpArr;
    }
    public static void main(String[] args) {
        MethodExam4 me4 = new MethodExam4();

        int[] arr = { 10, 20, 30, 40, 50 };
        int[] rArr1 = me4.plusMap(arr, 2);
        System.out.println(Arrays.toString(arr)); // [ 10, 20, 30 ]
        System.out.println(Arrays.toString(rArr1)); // [ 12, 22, 32 ]

        me4.plusOrigin(arr, 4);
        System.out.println(Arrays.toString(arr)); // [ 14, 24, 34 ]
        //배열크기, 랜덤 min값, 랜덤 max값, 중복 허용
        int[] rArr2 = me4.randomValFromTo(10, 5, 20);
        System.out.println(Arrays.toString(rArr2));
    }

}