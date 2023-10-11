package com.green.day10.ch5;

import java.util.Scanner;

public class MultiArrEx4Result2 {   // 향상된 for문 사용
    public static void main(String[] args) {
        String[][] words = {
                 {"chair", "의자"}
                ,{"computer","컴퓨터"}
                ,{"integer","정수"}
        };
        /*
        Q1. chair의 뜻은? >> fgsdg
        틀렸습니다. 정답은 의자입니다.

        Q2. computer의 뜻은? >> 컴퓨터
        정답입니다.
        ...
         */
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        for (String[] wordsArr : words) {
            System.out.printf("Q%d. %s의 뜻은 >>", i++, wordsArr[0]);
            String answer = scanner.nextLine();

            String expectedAnswer = wordsArr[1];
            if (!answer.equals(expectedAnswer)) {
                System.out.printf("틀렸습니다. 정답은 %s입니다.\n", expectedAnswer);
                continue;
            }
            System.out.println("정답입니다.");
        }
    }
}
