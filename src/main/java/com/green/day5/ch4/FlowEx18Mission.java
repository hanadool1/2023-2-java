package com.green.day5.ch4;

public class FlowEx18Mission {
    public static void main(String[] args) {
        for (int i=1; i<10; i++) {  // 바깥 for문이 세로
            for (int z=2; z<10; z++) {  // 안쪽 for문이 가로
                System.out.printf("%d X %d = %d\t", z, i, z * i);
            }
            System.out.println();
        }
    }
}
