package com.green.day7.ch4;

public class FlowEx29Result {
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
            System.out.printf("i = %d ", i);
            int temp = i;
             do {
                int modVal = temp % 10; // 10의 자리
                if(modVal != 0 && modVal % 3 == 0) {
                    System.out.print("짝");
                }
                temp /= 10; // 1의 자리
            } while (temp != 0);
            System.out.println();
        }
    }
}
