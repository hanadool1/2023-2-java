package com.green.day9.ch5;

import java.util.Arrays;

public class ArrayEx12 {
    public static void main(String[] args) {
        String[] names = { "Kim", "Park", "Yi" };

        for (int i=0; i<names.length; i++) {
            System.out.printf("names[%d] : %s\n", i, names[i]);
        }
        names[1] = "Woo";   // 쓰기
        System.out.println(Arrays.toString(names));

        for (String str : names) {  // 향상된 for문/foreach, page.166참고, 인덱스 사용하지 않을 때 보통 사용
            System.out.println(str);
        }
        System.out.println("-------------------");
        for (int i=0; i< names.length; i++) {
            String str = names[i];
            System.out.println(str);
        }
    }
}
