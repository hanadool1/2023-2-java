package com.green.day5.ch4;

public class FlowEx16 {
    public static void main(String[] args) {
        // 중첩 반복문을 사용하여
        // 가로 10개 , 세로 5줄 *을 찍으시오

        for (int i=0; i<5; i++) {   // 바깥 for문이 세로 담당
            for (int j=0; j<10; j++) {  // 안쪽 for문이 가로 담당
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
