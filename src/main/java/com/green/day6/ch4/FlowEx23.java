package com.green.day6.ch4;

public class FlowEx23 {
    public static void main(String[] args) {
        int i = 5;
        /*
        i변수, while을 이용하여 아래처럼 콘솔에 출력되도록 해주세요.
        4 - I can do it.
        3 - I can do it.
        2 - I can do it
        1 - I can do it.
        0 - I can do it.
         */
        while (i != 0) {
            i--;
            System.out.printf("%d - I can do it\n", i);
        }
    }
}
