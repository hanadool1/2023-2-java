package com.green.day4.ch4;

import java.util.Scanner;

public class If_1 {
    public static void main(String[] args) {
        // Scanner를 이용하여 성별을 입력(남자, 여자)
        // 만약에 남자가 입력되었다면 콘솔에 "잘 생겼다." 출력
        // 만약에 여자가 입력되었다면 콘솔에 "예쁘다." 출력
        // 남자, 여자가 아닌 갑이 입력되었다면 "누구냐." 출력

        Scanner scanner = new Scanner(System.in);
        System.out.print("성별을 입력하세요. (남자,여자) >");
        String gen = scanner.nextLine();

        System.out.println("--------------------------------(A)");
        if (gen.equals("남자")) {
            System.out.println("잘 생겼다.");
        } else if (gen.equals("여자")) {
            System.out.println("예쁘다.");
        } else {
            System.out.println("누구냐.");
        }

        System.out.println("--------------------------------(B)");
        if (gen.equals("남자") || gen.equals("여자")) {
            System.out.println(gen.equals("여자")? "여자": "남자");
        } else {
            System.out.println("누구냐.");
        }
    }
}
