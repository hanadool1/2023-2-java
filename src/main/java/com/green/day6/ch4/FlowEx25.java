package com.green.day6.ch4;

import java.util.Scanner;

public class FlowEx25 {
    public static void main(String[] args) {
        int num = 0, sum = 0;
        System.out.print("숫자를 입력하세요.(예:12345) >>");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        // 12345 >> 15
        // 2233 >> 10

        while (num != 0) {
            sum += num % 10; // sum = sum + num % 10;
            /*
            위에 것과 같은 코드, 줄인 것
            int modVal = num % 10;
            sum = sum + modVal;
             */
            num /= 10;
            /*
            위에 것과 같은 코드, 줄인 것
            num = num / 10;
             */
        }
        System.out.println("결과 : " + sum);



    }
}
