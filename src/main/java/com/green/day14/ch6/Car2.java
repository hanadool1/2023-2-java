package com.green.day14.ch6;

public class Car2 { // 생성자를 이용한 인스턴스의 복사
    String color;
    String gearType; // 변속기 종류 - auto, manual
    int door; // 문의 개수

    public void printMySelf(){ // 프린트 메소드
        System.out.printf("color = %s, gearType = %s, door = %d\n", color, gearType, door);
    }
    public Car2() { // 기본생성자

    }
    public Car2(Car2 car2) { // Car2타입 1개있는 생성자
        color = car2.color; // deep copy의 개념
        gearType = car2.gearType;
        door = car2.door;
    }
}

class Car2Test {
    public static void main(String[] args) {
        Car2 c1= new Car2();
        c1.color = "black";
        c1.gearType = "manual";
        c1.door = 5;

        Car2 c2 = new Car2(c1);

        c1.printMySelf(); // black, manual, 5
        c2.printMySelf(); // black, manual, 5
    }
}