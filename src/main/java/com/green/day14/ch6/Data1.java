package com.green.day14.ch6;

public class Data1 {
    int value;
    int value2;
    int value3;

    public Data1() { // 기본 생성자(생성자가 하나도 없을 때, 컴파일러가 자동으로 넣어줌)
        // 메소드와 차이점 : 리턴타입이 없고, 클래스이름과 같다.
        // 기본생성자와 파라미터가있는 생성자와 함께 쓰려면 둘 다 만들어야 함.
//        value = 100;
//        value2 = 200;
//        value3 = 300;
        // this. 멤버필드(멤버변수,속성)사용하거나 멤버메소드 호출, this() 생성자 호출 - 객체를 생성할 때(new ~)만 사용할 수 있음.
        this(100,200,300); // 정수 3개받는 Data1 생성자 호출
    }

    public Data1(int a) { // 오버로딩된 생성자 또는 파라미터가 있는 생성자
        value = a;
    }

    public Data1(int a, int b, int c) { // 생성자의 용도1 : 객체 생성할 때 무조건 있어야함. new뒤에 오는 것
        value = a;
        value2 = b;
        value3 = c;
    }

    public void printMySelf() {
        System.out.printf("value : %d, value2 : %d, value3 : %d\n"
                ,value, value2, value3);
    }

}

class ConstructorTest {
    public static void main(String[] args) {
        Data1 data1 = new Data1(); // new 뒤에 오는 생성자 호출
        data1.printMySelf();

        Data1 data1_2 = new Data1(10,20,30); // 생성자의 용도2 : 객체 생성과 동시에 멤버필드 값을 세팅할 수 있다.
        data1_2.printMySelf();

    }
}
