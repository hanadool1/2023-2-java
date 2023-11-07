package com.green.day27;

public class SubstringTest {
    public static void main(String[] args) {
        String str = "ABCDEFGHJK";


        String r1 = str.substring(2,4); // CD > 2는 스타트 인덱스 4-2 2글자 반환
        System.out.println("r1 : " + r1);

        System.out.println("r2 : " + str.substring(4)); // 스타트인덱스 4부터 모두 반환


    }
}
