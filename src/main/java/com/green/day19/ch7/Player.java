package com.green.day19.ch7;

class PlayerTest {
    public static void main(String[] args) {
        AudioPlayer ap = new AudioPlayer();
        ap.play(10);
        VideoPlayer vp = new VideoPlayer();
        vp.play(20);
        Player player = ap;
        player.play(30);
        player = vp;
        player.play(40);
    }
}

public abstract class Player { // 자식 중에 추상메소드가 하나라도 있으면, 무조건! 추상클래스가 되어야 한다. 객체화 안됨.
    // 추상메소드가 없지만 추상클래스인 경우 > 객체화 안되게 하려고
    public abstract void play(int pos); // 추상메소드(선언부만 있고, 구현부가 없는 메소드)
    // abstract는 오버라이딩의 강제성을 지님
}

class AudioPlayer extends Player {
    @Override // annotation
    public void play(int pos) {
        System.out.println("Audio Play 위치 : " + pos);
    }
}

class VideoPlayer extends Player {
    @Override
    public void play(int pos) {
        System.out.println("Vidio Play 위치 : " + pos);
    }
}

abstract class DvdPlayer extends Player { // abstract 붙여서 빨간 줄 해결

}