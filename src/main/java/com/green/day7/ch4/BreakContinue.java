package com.green.day7.ch4;

public class BreakContinue {
    public static void main(String[] args) {
        // break를 사용할 수 있는 곳 : switch, 반복문

        // continue를 사용할 수 있는 곳 : 반복문

        for (int i=0; i<10; i++) {
            System.out.println(i);
            if (i == 5) { break; }  // 반복문에서 break를 만나면 가장 가까운 반복문을 빠져나온다.
        }
        System.out.println("------------------------");
        for (int i=0; i<10; i++) {
            if (i % 2 == 0) { continue; }   // 특정한 조건일 때, continue 밑에 것을 실행 X, for문의 경우 증감식으로 올라감
            System.out.println(i);
        }


    }
}
