package com.green.day14.ch6;

public class Car {
    String color; // 전역변수 : 객체가 살아있으면 계속 살아있다.
    String gearType; // 변속기 종류 - auto, manual
    int door; // 문의 개수

    public Car(){ // 기본생성자
        this("white"); // this() 생성자 호출
    }
    public Car(String color) { // String 한개 받는 생성자 > car2
        this(color,"auto",4); // car2는 color가 객체 생성과 동시에 멤버필드 값이 세팅되어 있음
    }

    public Car(String color, String gearType, int door) { // String 2개, int 1개 받는 생성자, 지역변수
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }

    public void printMySelf(){ // 프린트 메소드
        System.out.printf("color = %s, gearType = %s, door = %d\n", color, gearType, door);
    }
}

class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car(); // 기본 생성자(메소드의 한 종류) 호출
        Car car2 = new Car("blue"); // String 타입 1개인 생성자가 호출됨.
        // 빨간줄이 뜬다면 그 생성자가 없다라는 뜻. 생성자가 하나도 없을 때는 기본생성자 만들어줌

        car1.printMySelf(); // white, auto, 4
        car2.printMySelf(); // blue, auto, 4
    }
}
