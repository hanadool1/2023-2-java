package com.green.day10.ch6;

public class NumberBox {
    void sum(int n1, int n2) { // void 메소드 정의, ()안에 변수타입과 변수명 하나하나 다 적어야 함,매개변수(Parameter)는 메소드에서 전달받은 값
        System.out.printf("%d + %d = %d\n", n1, n2, (n1 + n2));
        return; // 자동으로 들어가서 생략가능함.
    }

    void minus(int n1, int n2) {
        System.out.printf("%d - %d = %d\n", n1, n2, (n1 - n2));
    }

    void abs(int n) {
        System.out.println(n < 0 ? -n : n);
    }

}
