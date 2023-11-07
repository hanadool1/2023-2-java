package com.green.day29.ioc;

import com.green.day29.Speaker;

public class SamsungTv extends Tv {
    public SamsungTv(Speaker speaker) {
        System.out.println("---Samsung---");
        this.speaker = speaker;
    }
}