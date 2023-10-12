package com.green.day10.ch6;

public class TvTest3 {
    public static void main(String[] args) {
        Tv tv1 = new Tv();

        Tv tv2 = tv1;   // shallow copy, 얉은 복사, 주소값 복사(같은 주소값을 가짐)

        System.out.printf("tv1.channel : %d\n", tv1.channel);   // 0
        tv1.channelUp(); // 호출, 호출할 때는 메소드 선언부만 작성하면 됨
        tv1.channelUp();
        System.out.printf("tv1.channel : %d\n", tv1.channel);   // 2
        System.out.printf("tv2.channel : %d\n", tv2.channel);   // 2

    }
}
