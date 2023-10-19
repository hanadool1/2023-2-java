package com.green.day15.ch7;

class Card {
    static final int KIND_MAX = 4; //카드 무늬의 수
    static final int NUM_MAX = 13; //무늬별 카드 수
    // static은 객체 생성할 필요가 없고, 바로 메모리 할당, 공간은 하나...
    // final은 상수
    // 리터럴과 상수 차이점 : 리터럴은 값 그 자체, 상수는 값을 변경할 수 없는 수
    static final int SPADE = 4;
    static final int DIAMOND = 3;
    static final int HEART = 2;
    static final int CLOVER = 1;

    int kind; //1~4
    int number; //1~13

    public Card() { // 기본생성자
        //kind = SPADE;
        //number = 1;
        this(SPADE, 1); // 다른 생성자 호출
    }

    public Card(int kind, int number) { // int 타입 2개 있는 생성자
        this.kind = kind;
        this.number = number;
    }

    @Override
    public String toString() { // Object가 가지고 있는 toString 메소드를 오버라이딩
        //return "kind: " + kind + ", number: " + number;
        return String.format("kind: %d, number: %d", kind, number);
        //return "안녕";
    }
}

class Deck {
    final int CARD_NUM = 52; // 속성, 멤버필드, 전역변수
    Card[] cardArr = new Card[CARD_NUM];

    public Deck() { // 기본생성자
        int idx = 0;
        for (int i = 1; i <= Card.KIND_MAX; i++) {  // 4
            for (int z = 1; z <= Card.NUM_MAX; z++) { // 13
                cardArr[idx++] = new Card(i, z); // 52번 실행, i,z,idx 값이 계속 변경
            }
        }

//        for (Card c : cardArr) { // Card타입 변수명 : 배열
//            System.out.println(c); // toString 메소드가 오버라이딩되어 있기 때문에 (주소값이 아닌) 값이 출력된다.
//        }
    }

    public Card pick(int idx) { // 메소드
        return cardArr[idx];
    } // 오버로딩된 메소드, 카드배열의 int idx의 방 값이 리턴된다.

    public Card pick() { // 오버로딩된 메소드, 카드 랜덤으로 뽑아주는 메소드
        int rIdx = (int) (Math.random() * CARD_NUM); // 0~51
//        return cardArr[rIdx]; // 카드배열의 rIdx번째 방 값 리턴
        return pick(rIdx);
    }

    public void shuffle() {
        int ran;
        Card temp; // Card 타입의 주소값을 담는 temp 생성
        for (int i = 0; i < CARD_NUM; i++) { // 52번 도는 반복문
            ran = (int) (Math.random() * CARD_NUM); // 0~51
            temp = cardArr[i];
            cardArr[i] = cardArr[ran];
            cardArr[ran] = temp;
        }
//        for (Card c : cardArr) {
//            System.out.println(c);
//        }
    }
}

public class DeckTest {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();
    }
}