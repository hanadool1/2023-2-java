package com.green.day29.ioc;

import com.green.day29.Speaker;
import com.green.day29.Woofer;

public class TvFactory {
    public static Tv instance(String strTv, String strSpeaker, String strWoofer) {
        Woofer woofer = null;
        switch (strWoofer) {
            case "hanil":
                woofer = new HanilWoofer();
                break;
            case "hansung":
                woofer = new HansungWoofer();
                break;
        }
        Speaker speaker = null;
        switch (strSpeaker) {
            case "apple":
                speaker = new AppleSpeaker(woofer);
                break;
            case "harman":
                speaker = new HarmanSpeaker(woofer);
                break;
        }
        Tv tv = null;
        switch (strTv) {
            case "samsung":
                tv = new SamsungTv(speaker);
                break;
            case "lg":
                tv = new LgTv(speaker);
                break;
        }
        return tv;
    }
}
