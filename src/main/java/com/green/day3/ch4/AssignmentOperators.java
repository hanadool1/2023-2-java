package com.green.day3.ch4;

public class AssignmentOperators {  // 복합 대입 연산자
    public static void main(String[] args) {
        int n1, n2, n3;
        n3 = 10;
        n1 = n2 = n3;
        System.out.printf("n1: %d, n2: %d, n3: %d\n", n1, n2, n3);

        n1 = n1 + 4;
        System.out.printf("n1: %d, n2: %d, n3: %d\n", n1, n2, n3);

        n2 += 4;    // 복합 대입 연산자 (n2 = n2 +4;와 같은 문장)
        System.out.printf("n1: %d, n2: %d, n3: %d\n", n1, n2, n3);

        n3++;
        ++n3;
        System.out.printf("n1: %d, n2: %d, n3: %d\n", n1, n2, n3);

        n2--;
        --n2;
        System.out.printf("n1: %d, n2: %d, n3: %d\n", n1, n2, n3);


    }

}
