package com.green.day10.ch6;

public class MethodExamTest {
    public static void main(String[] args) {
        MethodExam me = new MethodExam();
        me.checkZero(10); // 0이 아닙니다.
        me.checkZero(0); // 0입니다.

        System.out.println("---------------------");

        int r = me.randomValFromTo(10,100); // 10~100 랜덤값 리턴되도록
        int r2 = me.randomValFromTo(5,9);
        System.out.println(r);
        System.out.println(r2);

        System.out.println("---------------------");

        me.scoreResultPrint(101); // 잘못된 점수입니다.
        me.scoreResultPrint(100); // A학점
        me.scoreResultPrint(90); // A학점
        me.scoreResultPrint(89); // B학점
        me.scoreResultPrint(80); // B
        me.scoreResultPrint(79); // C
        me.scoreResultPrint(69); // D(69점 이하는 전부 D학점)
        me.scoreResultPrint(-1); // 잘못된 점수입니다.

        System.out.println("---------------------");


    }
}
