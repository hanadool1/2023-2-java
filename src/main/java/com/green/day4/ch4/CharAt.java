package com.green.day4.ch4;

public class CharAt {
    public static void main(String[] args) {
        String str ="abcdefghijk".toUpperCase();    // toUpperCase 소문자 > 대문자 변환 메소드
        System.out.println(str);

        char result = str.charAt(1);        // b
        System.out.println("result0 : " + str.charAt(0));     // a
        System.out.println("result1 : " + result);           // b
        System.out.println("result2 : " + str.charAt(2));   // c
    }
}
