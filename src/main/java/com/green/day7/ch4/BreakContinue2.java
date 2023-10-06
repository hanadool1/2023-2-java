package com.green.day7.ch4;

public class BreakContinue2 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {

            for (int z = 10; z < 15; z++) {
                if (z == 13) {
                    break;
                }
                System.out.printf("i : %d - z: %d\n", i, z);
            }
        }

        System.out.println("----------------------------");

        for (int i = 0; i < 5; i++) {

            for (int z = 10; z < 15; z++) {
                if (z == 13) {
                    continue;
                }
                System.out.printf("i : %d - z: %d\n", i, z);
            }
        }
    }
}
