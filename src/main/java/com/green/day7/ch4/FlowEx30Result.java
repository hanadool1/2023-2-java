package com.green.day7.ch4;

public class FlowEx30Result {
    public static void main(String[] args) {
        // 반복문

        int sum = 0;
        int i = 0;
        // i값이 계속 증가가 되면 sum에 중첩으로 더하기
        // sum값이 100 초과가 되는 시점의 i 값

       final int TARGET = 100;
        while (true) {
            System.out.printf("sum : %d\n", sum);
            sum += ++i; // ++i, sum = sum + i을 줄인 것
            if (sum > TARGET) { break; }
            System.out.printf("sum : %d, i : %d\n", sum, i);
        }
        System.out.println("i : " + i);

//        while (sum < target) {
//            sum += ++i;
//        }
//        System.out.printf("sum : %d, i : %d\n", sum, i);
    }
}
