package com.green.day6.ch4;

import java.util.Scanner;

public class DoWhile3 {     // while문(true) 안에 if/break문 섞어서 사용
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int input = 0;
        while (true) {
            System.out.print("1~100사이의 숫자 입력 (종료 : 0) >> ");
            input = scanner.nextInt();
            if (input == 0) { break;}
                sum += input;
            }
        System.out.println("끝! " + sum);
    }
}
