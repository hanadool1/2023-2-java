package com.green.day10.ch6;

public class TvTest {
    public static void main(String[] args) {
        Tv tv1 = new Tv(); // 참조형 변수 Tv, tv1에는 주소값이 저장되어있음.
        tv1.channel = 10; // 주소값.객체 (그 객체한테 접근해서 명령)
        tv1.power = true;   // boolean 디폴트값은 false
        tv1.color = "빨간색";  // 참조형변수의 디폴트값은 null

        Tv tv2 = new Tv(); // 위에 것과 구조는 같지만 다른 존재
        tv2.channel = 20;

        System.out.println("tv1 == tv2 >> " + (tv1 == tv2)); // 주소값 비교, false


        System.out.println("tv1.channel : " + tv1.channel);
        System.out.println("tv1.power : " + tv1.power);
        System.out.println("tv1.color : " + tv1.color);

        System.out.println("---------------------------------");
        System.out.println("tv2.channel : " + tv2.channel);
        System.out.println("tv2.power : " + tv2.power);
        System.out.println("tv2.color : " + tv2.color);



    }
}
