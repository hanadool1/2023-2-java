package com.green.day15.ch7;

class Card {
    static final int KIND_MAX = 4; //카드 무늬의 수
    static final int NUM_MAX = 13; //무늬별 카드 수

    static final int SPADE = 4;
    static final int DIAMOND = 3;
    static final int HEART = 2;
    static final int CLOVER = 1;

    int kind; //1~4
    int number; //1~13

    public Card() {
        //kind = SPADE;
        //number = 1;
        this(SPADE, 1);
    }

    public Card(int kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    @Override
    public String toString() {
        //return "kind: " + kind + ", number: " + number;
        return String.format("kind: %d, number: %d", kind, number);
        //return "안녕";
    }
}

class Deck {
    final int CARD_NUM = 52;
    Card[] cardArr = new Card[CARD_NUM];

    public Deck() {
        int idx = 0;
        for(int i=1; i<=Card.KIND_MAX; i++) {
            for(int z=1; z<=Card.NUM_MAX; z++) {
                cardArr[idx++] = new Card(i, z);
            }
        }

        for(Card c : cardArr) {
            System.out.println(c);
        }
    }
    public Card pick(int idx) {
        return cardArr[idx];
    }

    public Card pick() {
         int rIdx = (int)(Math.random() * CARD_NUM);
         return cardArr[rIdx];
    }
}

public class DeckTest {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Card c1 = deck.pick(51);
        System.out.println("----");
        System.out.println(c1);
        System.out.println("----");
        Card c2 = deck.pick();
        System.out.println(c2);
    }
}