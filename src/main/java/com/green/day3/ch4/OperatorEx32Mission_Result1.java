package com.green.day3.ch4;

public class OperatorEx32Mission_Result1 {
    public static void main(String[] args) {
        // 절대값 만들기 (기존 메소드 사용 금지)
        // 만약에 n이 (음수 아무 값)-10이였다면 콘솔에 10 출력
        // 만약에 n이 (양수 아무 값)9이였다면 콘솔에 9 출력
        // n = n * -1;
        // n = -n;
        int n = -87;
        if(n < 0) {
            System.out.println(-n);
        }else {
            System.out.println(n);
        }
    }
}
