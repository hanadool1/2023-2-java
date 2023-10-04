package com.green.day4.ch4;

public class If_3 {
    public static void main(String[] args) {
        int val = (int)(Math.random() * 100) + 1;  // 1~100 랜덤한 숫자가 나오게

        // val값이 11이면 > "11(는)은 홀수입니다."
        // val값이 12이면 > "12(는)은 짝수입니다."

        System.out.println("-------------------------------------A");
        String str = "";
        if (val % 2 == 0) {
            str = "짝";
        } else {
            str = "홀";
        }
        System.out.printf("%d은(는) %s수입니다.\n", val, str);

        System.out.println("-------------------------------------B");
        System.out.printf("%d은(는) %s수입니다.", val, val % 2 == 0 ? "짝" : "홀");
    }
}
