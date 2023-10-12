package com.green.day10.ch6;

public class Tv {
    // 멤버필드, 속성, property, 전역변수 (값을 저장하는 것이 목적)
    String color;
    boolean power;
    int channel;

    // 멤버메소드, 메소드  (할 수 있는 동작)
    // 리턴타입 void 메소드명 power 파라미터(매개변수) (): 메소드에서 전달받은 값
    void power() {power = !power;} // 메소드를 정의했다.
    // 메소드 선언부 / {메소드 구현부}
    void channelUp() {channel++;}
    void channelDown() {channel--;}

}
