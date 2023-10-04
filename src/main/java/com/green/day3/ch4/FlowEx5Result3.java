package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx5Result3 {
    public static void main(String[] args) {
        int score = 0;
        System.out.print("점수를 입력하세요>");
        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();

        // score값이 90점보다 같거나 크면 A학점 출력
        // score값이 80점보다 같거나 크면 B학점 출력
        // 1의 자리수가 8이상이면 +, 3이하이면 -, 나머지는 없음(빈칸)
        // 나머지는 C학점 그냥 출력

        String grade = "C";
        String opt = "";

        if (score >= 90) {    // A
            grade = "A";
        } else if (score >= 80) {   // B
            grade = "B";
        }

        if (score >= 80) {  // C학점은 opt없이 그냥 출력하기 때문에 score가 80점 이상일 때만 따로 if문 사용
            int rMod = score % 10;  // mod(%) 10하면 일의 자리 수 출력 가능
            if (rMod >= 8 || score == 100) {
                opt = "+";
            } else if (rMod <= 3) {
                opt = "-";
            }
        }
        System.out.printf("%s%s", grade, opt);

    }
}
