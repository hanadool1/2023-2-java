package com.green.day15.ch7;

class Tv2 {
    boolean power;
    int channel;

    void power() { power = !power;} // toggle 구현
    void channelUp() { channel++; }
    void channelDown() { channel--; }

}

class CaptionTv2 extends Tv2 {
    int channel;
    boolean caption;
    void displayCaption(String text) {
        if(caption) {
            System.out.println(text);
        }
    }

    void printParentChannel() {
        System.out.printf("parent-channel : %d\n", super.channel);
        // channel > 10, this.channel > 10 가장 가까운 channel, super.channel > 1 부모의 channel
    }
}
public class CaptionTvTest2 {
    public static void main(String[] args) {
        CaptionTv2 ctv = new CaptionTv2();
        ctv.channel = 10;
        ctv.channelUp(); // 자식은 부모에 있는 값 변경 가능, 부모는 자식이 있는 값 변경 불가능

        System.out.printf("cTv.channel : %d\n", ctv.channel);
        ctv.printParentChannel(); // 1

    }
}
