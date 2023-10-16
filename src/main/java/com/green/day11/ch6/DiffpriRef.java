package com.green.day11.ch6;

public class DiffpriRef {   // 기본형 매개변수와 참조형 매개변수의 차이점
    public static void main(String[] args) {
        int num = 30;
        changeVal(num); // changeVal(기본형) 메소드 호출
        System.out.println("num : " + num); // 30

        NumBox nb = new NumBox(); // nb라는 주소값을 가진 객체 생성
        System.out.println("(1)nb.num : " + nb.num); // 0
        nb.num = 30;    // 30을 nb.num에 저장
        System.out.println("(2)nb.num : " + nb.num); // 30
        changeVal(nb); // changeVal(참조형) 메소드 dd 호출
        System.out.println("(3)nb.num : " + nb.num); // 20
    }

    public static void changeVal(int num) { // 기본형 매개변수(Parameter), 변수의 값을 읽기만 할 수 있다.
        System.out.println("changeVal - int");
        num = 10;
    }

    public static void changeVal(NumBox dd){  // 참조형 매개변수(Parameter), 변수의 값을 읽고 변경할 수 있다.
        System.out.println("changeVal - NumBox");
        dd.num = 20;
    }
}

class NumBox{
    int num;
}
