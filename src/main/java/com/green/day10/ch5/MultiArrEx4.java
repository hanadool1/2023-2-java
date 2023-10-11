package com.green.day10.ch5;

import java.util.Scanner;

public class MultiArrEx4 {
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
        for (int i=0; i< words.length; i++) {
            System.out.println(words[i][0] + "의 뜻은?");
            String input = scanner.nextLine();
                if (input.equals(words[i][1])) {
                    System.out.println("정답입니다.");
                } else {
                    System.out.printf("틀렸습니다. 정답은 %s입니다.\n", words[i][1]);
                }
        }
    }
}
