package com.green.day29.ioc;

import com.green.day29.Speaker;

public class Tv {
    private boolean isMute;
    protected Speaker speaker;

    public void sound() {
        if(!isMute) {speaker.sound();}
    }
    public void toggleMute() {
        isMute= !isMute;
    }
}