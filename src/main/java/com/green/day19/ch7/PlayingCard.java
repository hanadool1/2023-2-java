package com.green.day19.ch7;

public interface PlayingCard {
    public static final int SPADE = 4;
    final int DIAMOND = 3;
    static int HEART = 2;
    int CLOVER = 1; // public, static, final 생략 가능

    public abstract String getCardNumber(); // 추상메소드
    String getCardKind(); // 추상메소드, public, abstract 생략 가능
}

interface PlayingChess extends PlayingCard { // 인터페이스가 인터페이스 상속 시 extends
    void moveHorse(int x, int y);
}

class Chess implements PlayingChess {

    @Override
    public String getCardNumber() {
        return null;
    }

    @Override
    public String getCardKind() {
        return null;
    }

    @Override
    public void moveHorse(int x, int y) {

    }
}

class Card implements PlayingCard { // 클래스가 인터페이스 상속 시 implements

    @Override
    public String getCardNumber() {
        return null;
    }

    @Override
    public String getCardKind() {
        return null;
    }
}
class PlayingCardTest {
    public static void main(String[] args) {
        System.out.println(PlayingCard.CLOVER);
    }
}