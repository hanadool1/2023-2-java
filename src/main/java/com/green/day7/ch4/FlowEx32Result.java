package com.green.day7.ch4;

import java.util.Scanner;

public class FlowEx32Result {
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
        while (true) {
            System.out.println("(1) square");
            System.out.println("(2) tri");
            System.out.println("(3) log");
            System.out.print("원하는 메뉴(1~3)를 선택하세요. (종료:0) >> 0 (엔터)");
            int choice = scanner.nextInt();

            if (choice == 0) {
                break;  // 가장 가까운 반복문(while)을 빠져나와서 "프로그램 종료" 출력
            } else if (choice < 1 || choice > 3) {  // 1보다 작거나 3보다 크면 밑에 문장 출력 후, 다시 반복문 진입
                System.out.println("메뉴를 잘못 선택하셨습니다.");
            } else {
                System.out.printf("선택하신 메뉴는 %d번입니다.\n", choice);    // 문장 출력 후, 다시 반복문 진입
            }
        }
        System.out.println("프로그램을 종료합니다.\n");

    }
}
