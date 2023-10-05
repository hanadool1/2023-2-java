package com.green.day7.ch4;

import java.util.Scanner;

public class FlowEx32 {
    public static void main(String[] args) {
        /*
(1) square
(2) tri
(3) log
원하는 메뉴(1~3)를 선택하세요. (종료:0) >>

위 내용이 계속 반복 (0을 입력하기 전까지)

e.g.

(1) square
(2) tri
(3) log
원하는 메뉴(1~3)를 선택하세요. (종료:0) >> 1 (엔터)
선택하신 메뉴는 1번입니다.

(1) square
(2) tri
(3) log
원하는 메뉴(1~3)를 선택하세요. (종료:0) >> 2 (엔터)
선택하신 메뉴는 2번입니다.

(1) square
(2) tri
(3) log
원하는 메뉴(1~3)를 선택하세요. (종료:0) >> 4 (엔터)
메뉴를 잘못 선택하셨습니다.

(1) square
(2) tri
(3) log
원하는 메뉴(1~3)를 선택하세요. (종료:0) >> 0 (엔터)
프로그램을 종료합니다.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("원하는 메뉴(1~3)를 선택하세요. (종료:0) >> ");

        int i = scanner.nextInt();
        for (i=0; i<4; i++) {

        }


    }
}
