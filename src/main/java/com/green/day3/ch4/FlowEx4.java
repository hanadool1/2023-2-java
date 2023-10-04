package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx4 {  // 조건문 - if, else if, else
    public static void main(String[] args) {
        int score = 0;
        System.out.print("점수를 입력하세요>");
        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();

        // score값이 90점보다 같거나 크면 A학점 출력
        // score값이 80점보다 같거나 크면 B학점 출력
        // score값이 70점보다 같거나 크면 C학점 출력
        // 나머지는 D학점 출력

        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
    }
}
