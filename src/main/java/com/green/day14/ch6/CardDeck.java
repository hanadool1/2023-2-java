package com.green.day14.ch6;

public class CardDeck { // 카드를 담는 통 1개, 그 안에 카드는 많이 있다.
    Card[] cards; // 전역변수에 선언, CardDeck안에 선언 시(지역변수) 죽음.

    public CardDeck() {
        init();
    }
    public void init() {
        cards = new Card[52]; // cards 전역변수에 선언

        String[] patterns = {"Spade", "Heart", "Diamond", "Club"};
        int idx = 0;
        for (int i=0; i< patterns.length; i++) {
            String pattern = patterns[i];
            for (int z=1; z<=13; z++) {
                String denomination = this.getNumberFromInt(z);
                Card c = new Card(pattern,denomination);
                cards[idx++] = new Card(pattern, denomination);
            }
        }
    }
    private String getNumberFromInt(int num){ // 정수를 문자열로 변환하는 메소드, private메소드는 같은 클래스 내에서만 호출가능
        switch (num) {
            case 1:
                return "A";
            case 11:
                return "J";
            case 12:
                return "Q";
            case 13:
                return "K";
        }
        return String.valueOf(num);     // 정수를 문자열로
    }

    public void printAll() {
        for (Card c : cards) { // (카드타입 변수명 : 배열)
            c.printMySelf(); // 반복할 문장
        }
    }

    public Card getCard() {
        Card c = null;
        while (true) { // 무한루프(끝나지않는 반복문), break와 함께 사용
            int rIdx = (int) (Math.random() * cards.length);
            c = cards[rIdx];
            if (c != null) {
                cards[rIdx] = null;
                break;
            }
        }
        return c;
    }

}
