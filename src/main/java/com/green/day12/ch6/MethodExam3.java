package com.green.day12.ch6;

public class MethodExam3 {

    int sumText(String str) {
        int val = Integer.parseInt(str);
        int sum = 0;
        do {
            int modVal = val % 10;
            sum += modVal;
            val /= 10;
        } while(val > 0);
        return sum;
    }

    int sumText2(String str) {
        char[] charArr = str.toCharArray();
        int sum = 0;
        for(char ch : charArr) {
            sum += Character.getNumericValue(ch);
        }
        return sum;
    }

    public static void main(String[] args) {
        MethodExam3 me3 = new MethodExam3();

        String test = "9871231";
        System.out.println(me3.sumText(test));
        System.out.println(me3.sumText2(test));

        long beforeTime1 = System.currentTimeMillis();
        for(int i=0; i<1000000; i++) {
            int sum = me3.sumText(test);
        }
        long afterTime1 = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
        long secDiffTime1 = (afterTime1 - beforeTime1); //두 시간에 차 계산
        System.out.println("1-시간차이(m) : " + secDiffTime1);

        long beforeTime2 = System.currentTimeMillis();
        for(int i=0; i<1000000; i++) {
            int sum2 = me3.sumText2(test);
        }
        long afterTime2 = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
        long secDiffTime2 = (afterTime2 - beforeTime2); //두 시간에 차 계산
        System.out.println("2-시간차이(m) : " + secDiffTime2);
    }

}