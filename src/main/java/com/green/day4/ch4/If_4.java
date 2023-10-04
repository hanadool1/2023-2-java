package com.green.day4.ch4;

public class If_4 {
    public static void main(String[] args) {
        // 50~200 사이의 랜덤값

        // 100 이하면 그 값의 * 2한 결과값
        // 100 초과면 그 값의 + 10한 결과값

        int val = (int)(Math.random() * 151 ) + 50;
        int result = 0;
        if (val <= 100) {
           result = val * 2;
        } else {
           result = val + 10;
        }
        System.out.println(result);
        System.out.println("val : " + val);
    }
}
