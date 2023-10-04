package com.green.day5.ch4;

public class FlowEx18 {
    public static void main(String[] args) {
        // 중첩 for문을 활용하여 구구단 2단~9단까지 출력
        /*
        2 X 1 = 2
        2 X 2 = 4
        ...
        9 X 9 = 81
         */

        for (int i=2; i<10; i++) {
            for (int z=1; z<10; z++) {
                System.out.printf("%d X %d = %d\n", i, z, i * z);
            }
            System.out.println();
        }
    }
}
