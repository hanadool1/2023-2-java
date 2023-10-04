package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx5Result2 {
    public static void main(String[] args) {
        int score = 0;
        System.out.print("점수를 입력하세요>");
        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();

        // score값이 90점보다 같거나 크면 A학점 출력
        // score값이 80점보다 같거나 크면 B학점 출력
        // 1의 자리수가 8이상이면 +, 3이하이면 -, 나머지는 없음(빈칸)
        // 나머지는 C학점 출력

        String grade = "C"; // 기본값이 C, 값이 바뀌지 않으면 C가 출력
        String opt = "";

        if (score >= 90) {    // A
            grade = "A";
            if (score >= 98) {
                opt = "+";
            } else if (score <= 93) {
                opt = "-";
            } else {
                opt = " ";
            }
        } else if (score >= 80) {   // B
            grade = "B";
            if (score >= 88) {
                opt = "+";
            } else if (score <= 83) {
                opt = "-";
            } else {
                opt = " ";
            }
        }
        System.out.printf("%s%s", grade, opt);

    }
}
