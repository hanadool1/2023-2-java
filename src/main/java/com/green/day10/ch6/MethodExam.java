package com.green.day10.ch6;

public class MethodExam {
    void checkZero(int n) {
//        System.out.printf("0%s\n", n == 0 ? "입니다." : "이 아닙니다.");
        if (n == 0 ) {
            System.out.println("0입니다.");
            return;
        }
        System.out.println("0이 아닙니다.");
    }

    public int randomValFromTo(int from, int to) {
       return (int)(Math.random()* (to - from + 1)) + from;
    }

    void scoreResultPrint(int score) {
        if (score < 0 || score > 100) {
            System.out.println("잘못된 점수입니다.");
            return;
        }
        String grade = "D";
        if(score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        }
        System.out.printf("%s학점\n", grade);

    }
}
