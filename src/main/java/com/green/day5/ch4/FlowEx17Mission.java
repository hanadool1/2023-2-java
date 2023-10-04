package com.green.day5.ch4;

import java.util.Scanner;

public class FlowEx17Mission {
    public static void main(String[] args) {
        /*
        5 입력 시
        ____*
        ___**
        __***
        _****
        *****
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("*을 출력할 라인의 수를 입력하세요. >>");
        int line = scanner.nextInt();

        for (int i = 1; i <= line; i++) {
            // 왼쪽에 빈 칸 출력
            for (int j = 1; j <= line - i; j++) {
                System.out.print("_");
            }
            // 오른쪽에 별 출력
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
