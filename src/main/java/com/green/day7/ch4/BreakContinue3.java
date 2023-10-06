package com.green.day7.ch4;

public class BreakContinue3 {   // 이름붙은 반복문
    public static void main(String[] args) {
        abc:
        for (int i = 0; i < 5; i++) {

            for (int z = 10; z < 15; z++) {
                if (z == 13) {
                    break abc;
                }
                System.out.printf("i : %d - z: %d\n", i, z);
            }
        }

        System.out.println("-----------------");

        def:
        for (int i = 0; i < 5; i++) {

            for (int z = 10; z < 15; z++) {
                if (z == 13) {
                    continue def;   // break와 효과가 같다. 가능하지만 잘 쓰이지 않는다.
                }
                System.out.printf("i : %d - z: %d\n", i, z);
            }
        }

    }
}
