package com.green.day13.ch6;

public class MyMath2 {
    int num;
    static int staticNum;

    static void print() {
        // print2(); 호출 불가 static메소드에서 인스턴스 메소드 호출불가
        System.out.printf("staticNum : %d\n", MyMath2.staticNum);
    }

    void print2() {
        print();
        System.out.printf("staticNum : %d, num : %d\n",MyMath2.staticNum, this.num);
    }
}
