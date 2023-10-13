package com.green.day12.ch6;

public class Gugudan {
    void print(int dan){
        for (int i=1; i<10; i++) {
            System.out.printf("%d X %d = %d\n", dan, i, dan*i);
        }
    }

    void printFromTo(int from, int to) {
        for (int z=from; z<=to; z++){
            print(z);
        }
    }

    void printFromTo(int from, int to, String sep){
        for (int z=from; z<=to; z++){
            print(z);
            System.out.println(sep);
        }
    }


}
