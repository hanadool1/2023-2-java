package com.green.day15.ch7;

public class Parent extends Object { // 기본생성자는 자동으로 들어간다. 최상위 객체 : Object
//    public Parent() {
//
//    }
    public Parent(int age) {
        super(); // 부모의 기본생성자를 호출
    }
    int age;
}

class Child extends Parent { // 단일상속만 가능, 다중상속 불가능, 위아래 수직관계만 있음
    public Child () { // 기본생성자
        super(1); // 부모의 기본생성자 호출,바로 위에있는 부모로부터 상속받은 멤보를 참조하는 참조변수
        // 빨간줄 뜨면 부모의 기본생성자가 없는 것이므로, 부모의 기본생성자를 만들어 주거나,
        // 부모의 기본생성자가 없길 원한다면, super안에 부모 클래스의 매개변수를 맞춰줘야한다.
    }
    void play() {
        System.out.printf("나는 %d살이야 같이 놀자",age);
    }
}

class Child2 extends Parent { // Child와 관계없음
    public Child2 () { // 기본생성자
        super(1); // 부모의 기본생성자 호출,바로 위에있는 부모로부터 상속받은 멤보를 참조하는 참조변수
    }
    void jump() {
        System.out.printf("%d살의 아이가 점프를 하였다", age);
    }
}

class Main {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.age = 10;
        c1.play();

        Parent p = new Child(); // 다형성, 반대의 경우는 안됨, Child의 주소값을 Parent가 가질수 있다.

        Child2 c2 = new Child2();
        c2.age = 7;
        c2.jump();
    }
}
