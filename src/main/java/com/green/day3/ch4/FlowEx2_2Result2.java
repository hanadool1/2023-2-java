package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx2_2Result2 { // 조건문 - if, Scanner, nextInt, printf, 조건연산자 사용
    public static void main(String[] args) {
        // 숫자를 하나 입력하세요> (콘솔창에 띄우기)
        // (입력 기다리기)
        // 숫자를 입력하고 엔터를 누르면
        // (타입자유) 변수에 해당 값이 저장될 수 있도록
        // 해당 값이 홀수면
        // 00은 홀수입니다.
        // 해당 값이 짝수면
        // 00은 짝수입니다.

        Scanner scan = new Scanner(System.in);
        System.out.print("숫자를 하나 입력하세요 >");
        int num = scan.nextInt();

        if (num == 0) {
            System.out.printf("다른 값을 입력해주세요.");
        }
        else {
            System.out.printf("%d는(은) %s수입니다.", num, (num % 2 == 0 ? "짝": "홀") );
        }

    }
}
