package com.green.day12.ch6;
//static 사용 X
public class Card {
    public String kind;
    public String number;

    int getScore() {
        switch (number) {
            case "A":
                return 1;
            case "J":
                return 11;
            case "Q":
                return 12;
            case "K":
                return 13;
        }
        return Integer.parseInt(number); // 문자열을 정수로
    }

    public void printYourself() {
        System.out.printf("%s (%s)\n",kind,number);
    }
}