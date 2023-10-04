package com.green.day4.ch4;

public class Abs {  // 절대값
    public static void main(String[] args) {
        int n = -10;

        // 10는(은) 절대값 10
        // -9는(은) 절대값 9
        // -6는(은) 절대값 6
        // n = n * -1;
        // n = -n;

        System.out.println("--------------------------(A)");
        if (n > 0) {    // 양수
            System.out.printf("%d는(은) 절대값 %d\n", n, n);
        } else {    // 음수
            System.out.printf("%d는(은) 절대값 %d\n", n, -n);
        }
        System.out.println("--------------------------(B)");
        System.out.printf("%d는(은) 절대값 %d\n", n, n > 0? n: -n);

        System.out.println("--------------------------(C)");
        int r = n > 0? n: -n;
        System.out.printf("%d는(은) 절대값 %d\n", n, r);

    }
}
