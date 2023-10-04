package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx2Result {
    public static void main(String[] args) {
        // 숫자를 하나 입력하세요> (콘솔에 띄우기)
        // (입력 기다려야 함)
        // 숫자를 입력하고 엔터를 누르면
        // String 변수에 해당값이 저장될 수 있도록 함
        // 해당 문자열을 > 정수형으로 형변환
        // 해당 숫자가 0이라면 콘솔에 "입력하신 숫자는 0입니다."
        // 해당 숫자가 0이 아니라면 콘솔에 "입력하신 숫자는 0이 아닙니다."
        Scanner scan = new Scanner(System.in);

        System.out.print("숫자를 하나 입력하세요 > "); // 숫자를 하나 입력하세요> (콘솔에 띄우기)
        String str = scan.nextLine();   // 숫자를 입력하고 엔터를 누르면, String 변수에 해당 값이 저장되도록 함
        int val = Integer.parseInt(str);  // 해당 문자열을 > 정수형으로 형변환

        if (val == 0) {
            System.out.println("입력하신 숫자는 0입니다.");
        } else {
            System.out.println("입력하신 숫자는 0이 아닙니다.");
            System.out.printf("입력하신 숫자는 %d입니다.\n", val);
        }

    }
}
