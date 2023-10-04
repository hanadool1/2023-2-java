package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx5Mission_SelfResult {
    public static void main(String[] args) {
        // 남자의 평균키 170, 여자의 평균키 157
        // Scanner이용하여 성별을 입력 받습니다.(남자,여자)
        // 키를 입력 받습니다.
        // 평균키 미만이면 "156cm는 남자 평균 미만입니다."
        // 평균키랑 같다면 "170cm는 남자 평균입니다."
        // 평균키 초과면 "171cm는 남자 평균 초과입니다."

        // 평균키 미만이면 "153cm는 여자 평균 미만입니다."
        // 평균키랑 같다면 "157cm는 여자 평균입니다."
        // 평균키 초과면 "165cm는 여자 평균 초과입니다."

        Scanner scanner = new Scanner(System.in);
        System.out.print("성별을 입력해주세요> (남자,여자)");
        String gender = scanner.nextLine();
        System.out.print("키를 입력해주세요> ");
        int height = scanner.nextInt();
        String avg = "평균";

        if (gender.equals("남자") ) {
            if (height < 170) {
                avg = "평균 미만";
            } else if (height > 170) {
                avg = "평균 초과";
            } else {
                avg = "평균";
            }
        } else {
            if (height < 157) {
                avg = "평균 미만";
            } else if (height > 157) {
                avg = "평균 초과";
            } else {
                avg = "평균";
            }
        }
        System.out.printf("%dcm면 %s %s입니다", height, gender, avg);
    }
}
