package com.green.day13.ch6;

import java.util.Arrays;

class Card {
    String pattern; // Spade, Heart ... 카드의 속성1(멤버변수)
    String denomination;    // A, 2~10, J, Q, K , 카드의 속성2(멤버변수)

    void printYourSelf() { // 카드의 기능(메소드)
        System.out.printf("%s-%s\n", pattern, denomination); // 자기 자신을 프린트하는 기능(메소드)
    }
}

public class CardTest3 {
    public static void main(String[] args) {

        Card[] cards = CardTest3.makeCards(); // 클래스이름.메소드 호출, 같은공간에 있기 때문에 클래스이름 생략가능
        System.out.println(cards.length);

        for (Card c : cards) {
            c.printYourSelf();
        }
    }

    public static Card[] makeCards() {
        Card[] cArr = new Card[52];
        String[] patterns = {"Spade", "Heart", "Diamond", "Club"};
        for(int i=0; i< cArr.length; i++) {
            String pattern = patterns[i / 13];
            String denomination = getNumberFromInt((i + 1) % 13);
//            cArr[i] = new Card();
//            cArr[i].pattern = pattern;
//            cArr[i].denomination = denomination;  밑에 4줄과 같은 문장
            Card c = new Card();
            cArr[i] = c;
            c.denomination = denomination;
            c.pattern = pattern;
        }
        return cArr;
    }
    public static String getNumberFromInt(int num){ // 정수를 문자열로 변환하는 메소드
        switch (num) {
            case 1:
                return "A";
            case 11:
                return "J";
            case 12:
                return "Q";
            case 0:
                return "K";
        }
        return String.valueOf(num);     // 정수를 문자열로
    }

}


