package com.green.day14.ch6;

public class CardTest {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck(); // 기본생성자 호출
        cd.printAll(); // cd(CardDeck)에 있는 메소드
        /*
        Spade(A)
        Spade(2)
        ...
         */
//        Card c1= cd.getCard(); // return null;
        for (int i=0; i<52; i++){
            System.out.print(i);
            Card c = cd.getCard();
            c.printMySelf();
        }
        System.out.println("-----");
        // cd.printAll(); null인데 호출해서 null point error가 뜸.


    }
}
