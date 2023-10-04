package com.green.day6.ch4;

import java.util.Scanner;

public class DoWhile2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int input = 0;
         do {       // do-while문은 최소한 한번은 수행될 것을 보장한다.
            System.out.print("1~100사이의 숫자 입력 (종료 : 0) >> ");
            input = scanner.nextInt();
        }while (input != 0);    // 한번은 무조건 수행 후, 체크
        System.out.println("끝!!");
    }
}
