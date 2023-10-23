package com.green.day18.ch7;

import java.util.Arrays;
import java.util.Scanner;

public class NumberBaseballGame {
    public static void main(String[] args) {
        NumberBaseball nbb = new NumberBaseball(3);
        nbb.start();
    }
}

class NumberBaseball {
    private final int GAME_COUNT;
    private final int[] gameNumbers;


    public NumberBaseball(int count) {
        GAME_COUNT = count;
        gameNumbers = new int[count];
    }

    public void start() {
        setRandomNumNotDuplicate(); //0-9 사이의 랜덤값 중복없이
        getUserInput();
    }

    private void getUserInput() {
        Scanner scan = new Scanner(System.in);
        final int[] userArr = new int[GAME_COUNT];
        for(int i=0; i<GAME_COUNT; i++) {
            System.out.printf("%d 숫자 >> ", i+1);
            userArr[i] = scan.nextInt();
        }

        boolean r = isContinueCheckResult(userArr);

        scan.close();
    }

    private boolean isContinueCheckResult(int[] arr) {
        int strike=0, ball=0, out;
        for(int i=0; i<gameNumbers.length; i++) {
            for(int z=0; z<arr.length; z++) {
                if(gameNumbers[i] == arr[z]) {
                    if(i == z) {
                        strike++;
                    } else {
                        ball++;
                    }
                }
            }
        }
        out = GAME_COUNT - (strike + ball);

        return false;
    }

    private void setRandomNumNotDuplicate() {
        for(int i=0; i<GAME_COUNT; i++) {
            gameNumbers[i] = getRandomValue();
            for(int z=0; z<i;z++) {
                if(gameNumbers[i] == gameNumbers[z]) {
                    i--;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(gameNumbers));
    }

    private int getRandomValue() {
        return (int)(Math.random() * 10);
    }

}