package com.green.day11.ch6;

public class MethodExam2Test {
    public static void main(String[] args) {
        MethodExam2 me2 = new MethodExam2();

        String r1 = me2.scoreResultOpt(100);
        System.out.println(r1);
        String r2 = me2.scoreResultOpt(99);
        System.out.println(r2);
        String r3 = me2.scoreResultOpt(69);
        System.out.println(r3);
        String r4 = me2.scoreResultOpt(0);
        System.out.println(r4);
        String r5 = me2.scoreResultOpt(101);
        System.out.println(r5);
        String r6 = me2.scoreResultOpt(78);
        System.out.println(r6);

        /*
        100 초과 0미만은 "점수를 확인해 주세요" 값이 리턴
        A학점 8점이상+, 3점이하 -, 나머지 0
        B학점 8점이상+, 3점이하 -, 나머지 0
        C학점 8점이상+, 3점이하 -, 나머지 0
        D학점 +,-,0 없음
         */
        System.out.println("----------------");

        String season = me2.getSeason(10);
        System.out.println(season);
        /*
        3,4,5 > 봄
        6,7,8 > 여름
        9,10,11 > 가을
        12,1,2 > 겨울
        나머지 >> 없음
         */
        System.out.println("----------------");

    }
}
