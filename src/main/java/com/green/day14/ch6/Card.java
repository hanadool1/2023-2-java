package com.green.day14.ch6;

public class Card {
    String pattern; // 전역변수는 객체가 살아있는 동안 계속 살아 있음
    String denomination;

    void printMySelf() {
        System.out.printf("%s(%s)\n", pattern, denomination);
    }

    // *생성자 호출 방법 : 오른쪽 마우스 > Generate
    public Card(String pattern, String denomination) {
        this.pattern = pattern;
        this.denomination = denomination;
    }

    //    public Card(String pattern, String denomination) { // 지역변수는 호출 후에 사라짐
//        this.pattern = pattern; // 주소값. > 전역변수 접근하거나 메소드 호출 할 때 사용
//        this.denomination = denomination; // this.사용해서 전역변수와 지역변수 구분
//        // 전역변수        = 지역변수;
//    }
}
