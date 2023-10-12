package com.green.day11.ch6;

public class StarPrintTest {
    public static void main(String[] args) {
        StarPrint sp = new StarPrint();

        sp.line(5); // *****(개행)
        sp.line(7); // *******(개행)
        sp.line(10);

        System.out.println("------------------");
        sp.square(4);
        sp.square(5);
        // ****
        // ****
        // ****
        // ****

        System.out.println("------------------");
        sp.triangle(5);
        //*
        //**
        //***
        //****
        //*****
        System.out.println("------------------");
        String gender = sp.chkGenderById("011231-4117111");
        System.out.println(gender);
        /*
        8번째 자리의 숫자가
        2,4 > 여성
        1,3 > 남성
        이외의 값 > 유효하지 않은 주민번호
         */

        System.out.println("------------------");
        int sum = sp.sumFromTo(4,10); // 4~10 까지 더한 값 리턴
        int sum2 = sp.sumFromTo(10,15); // 4~10 까지 더한 값 리턴
        System.out.println(sum);
        System.out.println(sum2);

    }
}
