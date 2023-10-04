package com.green.day3.ch4;

public class OperatorEx32 { // 조건 연산자 ? :
    public static void main(String[] args) {
        // 조건식 ? true였을 때 : false였을 때;
        int n1 = 30, n2 = 20;

        int r = n1 > n2 ? n1 : n2;  // n1 > n2 가 참이라면, n1값을 r에 저장. 거짓이라면 n2값을 r에 저장.
        System.out.println("r : " + r);
    }
}
