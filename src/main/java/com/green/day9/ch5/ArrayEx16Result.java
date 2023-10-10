package com.green.day9.ch5;

import java.util.Scanner;

public class ArrayEx16Result {
    public static void main(String[] args) {
        /*
        3개의 String 값을 담을 수 있는 배열 생성
        3번 문자열로 입력을 받는다.(Scanner 사용)
        입력받은 문자열들을 순차적으로 배열에 값을 넣는다.
        값 넣는게 종료가 되면 향상된 for문을 이용하여
        저장되어 있는 값들을 콘솔에 출력한다.
         */
        String[] strArr = new String[3]; // 3개의 String 값을 담을 수 있는 배열 생성
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<strArr.length; i++) {
            System.out.print("문자열을 입력해주세요. >");
            strArr[i] = scanner.nextLine();
        }

        for (String input : strArr) {
            System.out.println(input);
        }

    }
}
