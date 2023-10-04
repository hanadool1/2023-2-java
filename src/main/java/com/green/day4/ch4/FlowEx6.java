package com.green.day4.ch4;

import java.util.Scanner;

public class FlowEx6 {
    public static void main(String[] args) {
        System.out.print("현재 월을 입력하세요 >");

        Scanner scanner = new Scanner(System.in);
        int mon = scanner.nextInt();

        /* mon값이 3~5사이면 "현재의 계절은 봄입니다." 출력
                   6~8사이면 "현재의 계절은 여름입니다."
                   9~11사이면 "현재의 계절은 가을입니다."
                   12,1,2면 "현재의 계절은 겨울입니다."
        */

        switch (mon) {
            case 3,4,5:
                System.out.println("현재의 계절은 봄입니다.");
                break;
            case 6,7,8:
                System.out.println("현재의 계절은 여름입니다.");
                break;
            case 9,10,11:
                System.out.println("현재의 계절은 가을입니다.");
                break;
            case 12,1,2:
                System.out.println("현재의 계절은 겨울입니다.");
                break;
            default:
                System.out.println("없는 월입니다.");
        }

    }
}
