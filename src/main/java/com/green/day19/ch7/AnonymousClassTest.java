package com.green.day19.ch7;

public class AnonymousClassTest {
    public static void main(String[] args) {
        Runnable2 run = new RunRobot();
        Runnable2 run2 = new Runnable2() {
            // 익명클래스 : 클래스의 선언과 객체의 생성을 동시에 하기 때문에 한번만 사용, 하나의 객체 생성할 수 있는 일회용 클래스
            @Override
            public void run() {
                System.out.println("하하하");
            }
        };
    }
}

interface Runnable2 {
    // 멤버필드에는 public static final이 생략되어 있음.
    void run(); // public abstract 가 생략 되어 있음.
}

class RunRobot implements Runnable2 {
    @Override
    public void run() {
        System.out.println("로봇이 달린다.");
    }
}