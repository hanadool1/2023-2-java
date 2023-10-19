package com.green.day13.ch6;

public class MyMath2 {
    int num;
    public static int staticNum; // 공간은 하나, static은 객체화하지 않아도 메모리 할당 받음

    static void print() {
        // print2(); 호출 불가 static메소드에서 인스턴스 메소드 호출불가
        System.out.printf("staticNum : %d\n", MyMath2.staticNum);
    }

    void print2() {
        print();
        System.out.printf("staticNum : %d, num : %d\n",MyMath2.staticNum, this.num);
    }
}
