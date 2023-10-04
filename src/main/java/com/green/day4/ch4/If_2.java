package com.green.day4.ch4;

import java.util.Scanner;

public class If_2 {
    public static void main(String[] args) {
        // Scanner를 이용하여 성별을 입력(남자, 남, man, Man,여자, 여, woman, Woman)
        // 만약에 남자가 입력되었다면 콘솔에 "잘 생겼다." 출력
        // 만약에 여자가 입력되었다면 콘솔에 "예쁘다." 출력
        // 남자, 여자가 아닌 갑이 입력되었다면 "누구냐." 출력

        Scanner scanner = new Scanner(System.in);
        System.out.println("성별을 입력해주세요. >");
        String gen = scanner.nextLine();

        if ("남자".equals(gen)
                || "남".equals(gen)
                || "man".equals(gen)
                || "Man".equals(gen)) {
            System.out.println("잘 생겼다.");
        } else if ("여자".equals(gen)
                || "여".equals(gen)
                || "woman".equals(gen)
                || "Woman".equals(gen)) {
            System.out.println("예쁘다.");
        } else {
            System.out.println("누구냐.");
        }


    }
}
