package com.green.day5.ch4;

public class MultiFor2 {
    public static void main(String[] args) {
        System.out.println("*****");
        System.out.println("*****");
        System.out.println("*****");
        System.out.println("*****");
        System.out.println("*****");
        System.out.println("------------------------");

        for (int i=0; i<5; i++){
            System.out.println("*****");
        }
        System.out.println("------------------------");
        for (int i=0; i<5; i++){
            for (int z=0; z<5; z++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
