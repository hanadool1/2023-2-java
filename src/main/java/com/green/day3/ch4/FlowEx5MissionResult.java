package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx5MissionResult {
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
        System.out.print("성별을 입력해주세요.(M,N) ");
        String gender = scanner.nextLine();
        System.out.print("키를 입력해주세요.");
        int height = scanner.nextInt();

        if ("M".equals(gender)) {   // 문자열은 equals 비교, "M"과 gender 위치 바꿔도 무방하나 리터럴이 앞에 오는 것이 좋음.
            if (height < 170) {
                System.out.printf("%dcm는 남자 평균 미만입니다.", height);
            } else if (height == 170) {
                System.out.printf("%dcm는 남자 평균입니다.", height);
            } else {
                System.out.printf("%d는cm 남자 평균 초과입니다.", height);
            }
        } else {
            if (height < 157) {
                System.out.printf("%dcm는 여자 평균 미만입니다.", height);
            } else if (height == 157) {
                System.out.printf("%dcm는 여자 평균입니다.", height);
            } else {
                System.out.printf("%dcm는 여자 평균 초과입니다.", height);
            }
        }


    }
}
