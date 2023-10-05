package com.green.day7.ch4;

public class FlowEx29SelfResult {
    public static void main(String[] args) {
        for (int i = 1; i <= 101; i++) {
            if ((i % 10) == 3 || (i % 10) == 6 || (i % 10) == 9) {
                if (i / 10 == 3 || i / 10 == 6 || i / 10 == 9) {
                    System.out.println(i + " 짝짝");  // 자릿수 모두
                } else {
                    System.out.println(i + " 짝");   // 1의 자릿수만
                }
            } else if (i / 10 == 3 || i / 10 == 6 || i / 10 == 9) {
                System.out.println(i + " 짝");   // 10의 자릿수만
            } else {
                System.out.println(i + " ");
            }
        }
    }
}
