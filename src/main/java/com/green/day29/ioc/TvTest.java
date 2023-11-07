package com.green.day29.ioc;

public class TvTest {
    public static void main(String[] args) {
        String strTv = args[0];
        String strSpeaker = args[1];
        String strWoofer = args[2];
        Tv tv = TvFactory.instance(strTv, strSpeaker, strWoofer);
        tv.sound();
        tv.toggleMute();
        tv.sound();
    }
}