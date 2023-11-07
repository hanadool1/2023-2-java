package com.green.day29.normal2;

import com.green.day29.Speaker;
import com.green.day29.Woofer;

public class HarmanSpeaker implements Speaker {
    private Woofer woofer;

    public HarmanSpeaker() {
        woofer = new HanilWoofer();
    }

    public void sound() {
        System.out.println("하만 스피커: 소리!! 소리!! 소리!!");
        woofer.soundBase();
    }
}