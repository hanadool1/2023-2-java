package com.green.day12.ch6;

public class ReferenceParamEx2 {
    public static void main(String[] args) {
        int[] x = { 10 };
        System.out.printf("1 main() : x = %d\n", x[0]); //1. 10

        change(x);
        System.out.printf("2 main() : x = %d\n", x[0]); //2. 1000
    }

    public static void change(int[] x) {
        x[0] = 1000;
        System.out.printf("3 change() : x = %d\n", x[0]); //3. 1000
    }
}