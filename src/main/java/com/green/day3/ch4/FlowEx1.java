package com.green.day3.ch4;

public class FlowEx1 { // 조건문 - if
    public static void main (String[] args) {
        int x = 0;
        System.out.printf("x=%d 일 때, 참인 것은\n", x);

        if(x == 0) {    // ()안이 참이라면,
            System.out.println("x == 0");  // 중괄호{}안의 문장 실행
        }
        if(x != 0) {    // ()안이 거짓이라면,
            System.out.println("x != 0");   // 중괄호{}안의 문장 실행 X
        }

        System.out.println("---------------------------------");

        x = 1;
        System.out.printf("x=%d 일 때, 참인 것은\n", x);

        if(x == 0) {    // ()안이 참이라면,
            System.out.println("x == 0");  // 중괄호{}안의 문장 실행
        }
        if(x != 0) {    // ()안이 거짓이라면,
            System.out.println("x != 0");   // 중괄호{}안의 문장 실행 X
        }

        System.out.println("끝!");
    }
}
