package com.green.day7.ch4;

public class FlowEx29 {
    public static void main(String[] args) {    // 완성못함
        /*
        3.6.9 게임
        i = 1
        i = 2
        i = 3 짝
        i = 30 짝
        i = 33 짝짝
         */
        for(int i=1; i<=101; i++) {
           if (i / 10 == 3 || i / 10 == 6 || i / 10 == 9
            || i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
               System.out.printf("i = %d 짝 \n", i);
           } if ((i / 10 == 0 && i % 10 == 3) || (i / 10 == 0 && i % 10 == 6) || (i / 10 == 0 && i % 10 == 9)) {
                System.out.printf("i = %d 짝짝 \n", i);
            }
           else {
               System.out.printf("i = %d \n", i);
           }
        }
    }
}
