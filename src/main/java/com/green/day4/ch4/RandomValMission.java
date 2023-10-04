package com.green.day4.ch4;

public class RandomValMission {
    public static void main(String[] args) {
        int rVal = (int)(Math.random() * 6) + 5;    // 5~10
        System.out.println("rVal : " + rVal);

        int rVal2 = (int)(Math.random() * 10) + 14;     // 14~23
        System.out.println("rVal2 : " + rVal2);
    }
}
