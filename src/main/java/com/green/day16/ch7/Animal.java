package com.green.day16.ch7;

public class Animal {
    public void crying() {
        System.out.println("동물이 운다.");
    }
}
// 다형성 : 상속관계에서만 나타나는 현상, 어떠한 객체 주소값을 다른 타입이 저장할 수 있는 것
class AnimalTest {
    public static void main(String[] args) {
        // 1. 부모타입은 자식 객체 주소값 담을 수 있다.
        Dog d1 = new BullDog();
        Animal ani1 = new BullDog();
        Animal ani2 = new Dog();
        Animal ani3 = new Cat();

        // 2. 자식타입은 부모 객체 주소값 담을 수 없다.
//        BullDog bull1 = new Dog();

        // 3. 타입은 알고 있는 메소드만 호출할 수 있고
        // 4. 호출이 된다면 객체 기준이다.
        BullDog bull3 = new BullDog();
        bull3.jump();
        bull3.crying(); // 객체 기준으로 가장 빨리 만나는 메소드 호출

        Dog dog2 = new BullDog();
//        dog2.jump dog타입은 jump메소드가 없어서 호출이 안됨.
        dog2.crying(); // 객체 기준으로 가장 빨리 만나는 메소드 호출
    }
}

class AnimalTest2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        BullDog bulldog = new BullDog();

        callCrying(dog);
        callCrying(cat);
        callCrying(bulldog);
    }
    private static void callCrying(Animal ani) {
        ani.crying();
        if(ani instanceof BullDog) { // 왼쪽의 참조변수가  오른쪽의 타입(클래스명)울 형변환 가능한지? true/false
            BullDog bullDog = (BullDog)ani ;
            bullDog.jump();
        }

    }
}

class AnimalTest3 {
    public static void main(String[] args) {
        Animal ani = new Cat();
        System.out.println(ani instanceof Dog); // 상속관계가 아니기 때문에 false
        System.out.println(ani instanceof Cat);
        // 왼쪽에는 참조변수,오른쪽에는 타입(클래스명) 위치 > 왼쪽이 오른쪽으로 형변환이 가능한지 알아보기 위해 사용
        Cat cat = (Cat)ani;

    }
}

class Dog extends Animal {
    @Override
    public void crying() { // 오버라이딩
        System.out.println("멍멍");
    }
}

class BullDog extends Dog {
    public void jump() {
        System.out.println("불독이 점프");
    }
    @Override
    public void crying() { // 오버라이딩
        System.out.println("불독이 왈왈");
    }
}

class Cat extends Animal {
    public void crying() {
        System.out.println("야옹야옹");
    }
}

