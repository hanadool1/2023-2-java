package com.green.day29.ioc;

import com.green.day29.Speaker;
import com.green.day29.Woofer;

public class HarmanSpeaker implements Speaker {
    private Woofer woofer;

    public HarmanSpeaker(Woofer woofer) {
        this.woofer = woofer;
    }

    public void sound() {
        System.out.println("하만 스피커: 소리!! 소리!! 소리!!");
        woofer.soundBase();
    }
}