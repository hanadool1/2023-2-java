package com.green.day29.normal;

public class AppleSpeaker {
    private HanilWoofer woofer;

    public AppleSpeaker() {
        woofer = new HanilWoofer();
    }

    public void sound() {
        System.out.println("애플 스피커: 소리 소리 소리");
        woofer.soundBase();
    }
}