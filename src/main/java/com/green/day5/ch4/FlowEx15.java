package com.green.day5.ch4;

public class FlowEx15 {
    public static void main(String[] args) {
        final int DAN = 6;

        /*
        6 X 1 = 6
        6 X 2 = 12
        6 X 3 = 18
        ...
        6 X 9 = 54
        */

        for (int i=1; i<10; i++) {
            System.out.printf("%d X %d = %d\n", DAN, i, DAN*i);
        }

    }
}
