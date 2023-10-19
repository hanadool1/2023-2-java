package com.green.day16.ch7;

public class Singleton { // 객체 한개 만들어서 돌려쓴다
    private Singleton() { }
    private static Singleton singleton;
    public static Singleton getInstance() { // static메소드
        if(singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}

class SingletonTest {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance(); // 클래스이름.메소드호출
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1 == s2);
    }
}
