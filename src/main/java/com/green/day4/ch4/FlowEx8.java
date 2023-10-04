package com.green.day4.ch4;

import java.util.Scanner;

public class FlowEx8 {
    public static void main(String[] args) {
        System.out.println("당신의 주민번호를 입력하세요.(970812-2345678) >>");

        // 주민번호 입력받고,
        // 주민번호를 확인하시고 > 여자인지 남자인지, 유효하지 않은 주민번호인지 확인
        // switch문 사용

        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();    // Scanner로 입력받은 문자열을 num이라는 변수에 저장

        char result = num.charAt(7);    // num에서 8번째 자리 문자열 추출해서 result에 저장

        switch (result) {
            case '1','3':
                System.out.println("남자");
                break;
            case '2','4':
                System.out.println("여자");
                break;
            default:
                System.out.println("유효하지 않은 주민번호입니다.");
        }
    }
}
