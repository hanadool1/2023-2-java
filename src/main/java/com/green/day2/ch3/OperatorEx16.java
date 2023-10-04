package com.green.day2.ch3;

public class OperatorEx16 { // 산술연산자 - * 사용해서 소수점 자리 없애기
    public static void main(String[] args){
        float pi = 3.141592f;
        System.out.println(pi);

        int pro1 = (int)(pi * 1000);
        System.out.println("pro1 : " + pro1);

        float pro2 = pro1 * 0.001f;
        System.out.println("pro2 : " + pro2);

        System.out.println("one : " + (int)(pi * 1000) * 0.001f);

    }
}
