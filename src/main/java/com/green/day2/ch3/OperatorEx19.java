package com.green.day2.ch3;

public class OperatorEx19 { // 나머지 연산자 - %
    public static void main (String[] args){
        int x = 10, y = 8;
        System.out.printf("%d을 %d로 나누면\n ", x, y);
        System.out.printf("몫은 %d이고, 나머지는 %d입니다.\n" , x / y, x % y);

        System.out.println(3 % 2);  // 나머지로 홀,짝 구분 가능
        System.out.println(4 % 2);
        System.out.println(5 % 2);
        System.out.println(6 % 2);

    }
}
