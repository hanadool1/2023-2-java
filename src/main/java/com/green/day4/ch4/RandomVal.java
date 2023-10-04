package com.green.day4.ch4;

public class RandomVal {
    public static void main(String[] args) {
        double doubleVal = Math.random(); // 0.000... ~ 0.999... 절대 1이 나오지 않음.
        System.out.println("doubleval : " + doubleVal);

        int intVal = (int)(doubleVal * 10); // 최솟값 0, 최댓값 9
        System.out.println("intVal : " + intVal);

        int rVal = (int)(Math.random() * 20); // 최솟값 0, 최댓값 19
        System.out.println("rVal : " + rVal);
    }
}
