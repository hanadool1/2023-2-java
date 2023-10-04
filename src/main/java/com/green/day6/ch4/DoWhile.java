package com.green.day6.ch4;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1~100사이의 숫자 입력 (종료 : 0) >> ");
        int input = scanner.nextInt();
        while (input != 0) {
            System.out.print("1~100사이의 숫자 입력 (종료 : 0) >> ");
            input = scanner.nextInt();
        }
        System.out.println("끝!!");
    }
}
