package com.green.day5.ch4;

public class FlowEx12 { // for 반복문
    public static void main(String[] args) {
        for(int i=1; i<=5; i++) {
            System.out.println(i);
        }
        System.out.println("----------------------------1");

        for (int i=0; i<5; i++) {
            System.out.print(i);    // 01234
        }
        System.out.println();
        System.out.println("----------------------------2");

        for (int i=0; i<5; i++) {
            System.out.print(i + 1);    // 12345
        }
        System.out.println();
        System.out.println("----------------------------3");

        for (int i=92; i<97; i++) {
            System.out.print("*");  // *****
        }
        System.out.println();
        System.out.println("----------------------------4");

        for (int i=6; i>0; i--) {
            System.out.print("*");  // ******
        }
        System.out.println();
        System.out.println("----------------------------5");

    }
}
