package com.green.day2.ch2;

import java.util.Scanner;

public class ScannerEx {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("두 자리 정수를 하나 입력해주세요 >> ");
        String input = scan.nextLine(); // nextLine이라는 메소드, 숫자 입력시 input에 저장
        int num = Integer.parseInt(input); // 오른쪽 숫자는 문자열로 인식 > int형 형변환

        System.out.println("입력내용 : " + (input + input)); // 문자열 + 문자열
        System.out.printf("num=%d\n", (num + num)); // int형 형변환으로 숫자 + 숫자
    }
}
