package com.green.day10.ch6;

public class TvTest3 {
    public static void main(String[] args) {
        Tv tv1 = new Tv();

        Tv tv2 = tv1;

        System.out.printf("tv1.channel : %d\n", tv1.channel);
        tv1.channelUp(); // 호출, 호출할 때는 메소드 선언부만 작성하면 됨
        tv1.channelUp();
        System.out.printf("tv1.channel : %d\n", tv1.channel);
        System.out.printf("tv2.channel : %d\n", tv2.channel);

    }
}
