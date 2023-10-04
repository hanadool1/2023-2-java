package com.green.day4.ch4;

import java.util.Scanner;

public class FlowEx8Result {
    public static void main(String[] args) {
        System.out.println("주민번호를 입력하세요. (123456-7891234)");
        Scanner scanner = new Scanner(System.in);
        String humanId = scanner.nextLine();
        char gender = humanId.charAt(7);

        switch (gender) {
            case '2','4' :
                System.out.println("여성");
                break;
            case '1','3' :
                System.out.println("남성");
                break;
            default:
                System.out.println("유효하지 않은 주민등록번호");
                break;
            }

    }
}
