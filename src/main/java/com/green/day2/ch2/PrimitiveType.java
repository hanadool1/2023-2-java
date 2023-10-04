package com.green.day2.ch2;

public class PrimitiveType {
    public static void main(String[] args) {
        // 논리형
        boolean test = true, test2 = false;

        // 문자형
        char ch = 'a', ch2 = '가';

        // 정수형
        byte b1 = 1; // 1byte
        short s1 = 10; // 2byte
        int i1 = 100; // 4byte
        long l1 = 1000; // 8byte

        // 실수형
        // float f1 = 10.1;
        float f2 = 10.1f, f3 =10.1F;
        float f4 = (float)10.1; // 강제 형변환
        double d1 = 10.1, d2 = 10.1d, d3 = 10.1D;
        float f5 = (float)d1;
    }
}
