package com.green.day12.ch6;

public class MethodExam3 {
    int sumText(String str){
        return 12;
    }


    public static void main(String[] args) {
        MethodExam3 me3 = new MethodExam3();

        int sum = me3.sumText("123123");
        System.out.println("sum : " + sum); // 12

        System.out.println("sum2 : " + me3.sumText("222")); // 6
    }
}
