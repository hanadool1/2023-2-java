package com.green.day7.ch4;

public class FlowEx30 {
    public static void main(String[] args) {
        // 반복문

        int sum = 0;
        int i = 0;
        // i값이 계속 증가가 되면 sum에 중첩으로 더하기
        // sum값이 100 초과가 되는 시점의 i 값
        while (true) {
            i++;
            sum = sum + i;
            System.out.println(sum);
            if(sum>100) {
                System.out.printf("total: %d", i);
                break;
            }
        }

    }
}
