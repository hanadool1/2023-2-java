package com.green.day10.ch6;

public class NumberBoxTest {
    public static void main(String[] args) {
        NumberBox nb1; // 참조형변수  변수명; 참조형변수는 객체주소값,배열주소값만 담을 수 있다. NumberBox라는 객체의 주소값만 담을 수 있다.
        nb1 = new NumberBox(); // new~ 부분이 그 객체의 주소값이 된다. 그 값이 복사돼서 nb1에 저장되어 객체가 된다.(객체화,인스턴스화)

        nb1.sum(10,20); // void 메소드 호출, ()안에 있는 것은 전달인자(Argument): 메소드 호출 시 전달되는 값
        nb1.sum(30,40);

        System.out.println("--------------------------------");

        nb1.minus(40,20); // 40 - 20 = 20
        nb1.minus(50,10);

        nb1.abs(-10); // 10
        nb1.abs(10); // 10
        nb1.abs(-33); // 33
        nb1.abs(39); // 39
    }
}
