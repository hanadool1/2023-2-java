package com.green.day13.ch6;

public class OverloadingTest { // 오버로딩 : 같은 클래서 안엣 똑같은 이름의 메소드를 여러개 만들 수 있는것
    // 만들 수 있는 조건? 파라미터(매개변수) 개수 또는 타입이 달라야 한다.
    // 오버로딩할 때는 리턴타입과는 상관없다. 오로지 파라미터만 본다.
    public static void main(String[] args) {
        System.out.println(10.2D);
    }

    void print() {}
    void print(int n) {}
    void print(int n1, int n2) {}
    void print(int n1, String str2) {}
    void print(String str2, int n1) {}

}
