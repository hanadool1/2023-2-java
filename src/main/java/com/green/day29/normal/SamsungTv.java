package com.green.day29.normal;

public class SamsungTv {
    private boolean isMute;
    //private AppleSpeaker speaker;
    private HarmanSpeaker speaker;

    public SamsungTv() {
        //speaker = new AppleSpeaker();
        speaker = new HarmanSpeaker();
    }

    public void toggleMute() {
        isMute = !isMute;
        /*
        if(isMute) {
            isMute = false;
        } else {
            isMute = true;
        }
         */
    }

    public void sound() {
        if(!isMute) {
            //speaker.sound();
            speaker.speak();
        }
    }
    /*
    public void sound() {
        if(isMute) { return; }
        speaker.sound();
    }
         */
}