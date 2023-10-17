package com.green.day13.ch6;

public class MyMathTest2 {
    public static void main(String[] args) {
        MyMath2 mm2 = new MyMath2();
        mm2.num = 10;
        mm2.staticNum = 30; // static 접근방법 1(MyMath2 객체화 후 주소값.static변수)
        MyMath2.staticNum = 40; // static 접근방법 2(클래스이름.static변수), 보통 사용
        // 클래스이름(대문자시작).변수 사용이 가능한 것은 static변수밖에 없음
        // .을 사용하는 경우 : 객체주소값.   클래스점.(static만 가능)

        System.out.printf("mm2.num = %d, staticNum = %d\n", mm2.num, mm2.staticNum);

        MyMath2 mm2_2 = new MyMath2();
        mm2_2.num = 100;
        mm2_2.staticNum = 50;
        System.out.printf("mm2_2.num = %d, staticNum = %d\n", mm2_2.num, mm2_2.staticNum);


        System.out.printf("MyMath2.staticNum = %d\n",MyMath2.staticNum);

    }
}
