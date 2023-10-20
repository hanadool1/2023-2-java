package com.green.day17.ch7;

public class PolyArgumentTestVer2 {
    public static void main(String[] args) {
        Product2 p = new Product2("제품명", 1000);
        System.out.println(p);
    }
}

class PolyArgumentTestVer2_2 {
    public static void main(String[] args) {
        Tv2 tv = new Tv2();
        System.out.println(tv); // name : Tv, price : 100, Point : 10

        Computer2 com = new Computer2();
        System.out.println(com); // name : Computer, price : 200, Point : 20

        Audio2 audio = new Audio2();
        System.out.println(audio);
    }
}

class PolyArgumentTestVer2_3 {
    public static void main(String[] args) {
        Buyer2 buyer = new Buyer2();
        buyer.buy(new Tv2());
        buyer.buy(new Computer2());
        buyer.buy(new Audio2());
        buyer.buy(new Audio2());
        buyer.buy(new Audio2());
        buyer.buy(new Audio2());


//        Product2[] arr= buyer.productArr;
//        for (int i = 0; i < arr.length; i++) {
//            Product2 p = arr[i];
//            System.out.printf("arr[%d] : %s\n", i, p);
//        }

    }
}


class Buyer2 {
    // money(정수) 저장 가능
    // bonusPoint(정수) 저장 가능
    // Product 객체의 주소값 여러개 저장 가능
    private int money;
    private int bonusPoint;
    Product2[] productArr;
    int cnt;

    public Buyer2() {
        this.money = 1000;
        this.bonusPoint = 0;
        productArr = new Product2[10];
    }

    public void buy(Product2 product) {
        if (cnt == productArr.length) {
            System.out.println("담을 수 있는 공간이 없습니다.");
            return;
        }
        if (money < product.getPrice()) {
            System.out.println("잔액 부족");
            return;
        }
        productArr[cnt++] = product;
        money -= product.getPrice();
        bonusPoint += product.getBonusPoint();
        System.out.printf("%s를 구매하셨습니다. money : %d, bonusPoint : %d\n"
                , product.getName(), money, bonusPoint);
    }
}


class Audio2 extends Product2 {
    public Audio2() {
        super("Audio", 500);
    }
}

class Computer2 extends Product2 {
    public Computer2() {
        super("Computer", 200);
    }
}

class Tv2 extends Product2 {
    public Tv2() {
        super("Tv", 100);
    }
}

class Product2 {
    private String name;
    private int price;
    private int bonusPoint;

    public Product2(String name, int price) {
        this.name = name;
        this.price = price;
        this.bonusPoint = price / 10;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

    @Override
    public String toString() {
        return String.format("name : %s, money : %d, 포인트 : %d", name, price, bonusPoint);
    }
}