package com.green.day17.ch7;

public class PolyArgumentTest {
    public static void main(String[] args) {
        Computer c = new Computer();
        int price = c.getPrice();
        int bonusPoint = c.getBonusPoint();

        Tv tv = new Tv();
        int tvPrice = tv.getPrice();
        int tvBonusPoint = tv.getBonusPoint();
    }
}

class PolyArgumentTest2 {
    public static void main(String[] args) {
        Buyer buyer = new Buyer();
        System.out.println(buyer); // money : 1000, bonusPoint : 0
        buyer.buy(new Tv());
        buyer.buy(new Computer());
        buyer.buy(new Computer());
        buyer.buy(new Computer());
        buyer.buy(new Computer());
        buyer.buy(new Computer());

        System.out.println(buyer);



        // buyer money가 부족하면 "잔액부족" money값 마이너스 처리 X
        // 잔액이 부족하지 않으면 Tv를 구입하셨습니다. > money는 차감 처리, bonusPoint 플러스 처리
    }
}

class Buyer {
    private int money;
    private int bonusPoint;

    public Buyer() {
        this.money = 1050;
        this.bonusPoint = 0;
    }

    public void buy(Product product) {
        if (money < product.getPrice()) {
            System.out.print("잔액이 부족합니다.");
            return;
        }
            System.out.printf("%s을/를 구입하셨습니다. ", product);
            money -= product.getPrice();
            bonusPoint += product.getBonusPoint();
            System.out.printf("money : %d ", money);
            System.out.printf("bonusPoint : %d\n", bonusPoint);

    }

    @Override
    public String toString() {
        return String.format("money : %d, bonusPoint : %d", money, bonusPoint);
    }

}




class Product {
    // 생성자만 있고 setter가 없는 경우 ? 객체를 생성할 때만 값을 넣고
    // 생성자는 없고 setter만 있는 경우 ? 객체 생성할 때는 값을 못넣고, setter메소드로만 값을 넣을 수 있다.
    private int price;
    private int bonusPoint;

    protected Product(int price) {
        this.price = price;
        bonusPoint = price / 10;
    }
    @Override
    public String toString() {
        return String.format("price : %d, bonuspoint : %d\n", price, bonusPoint);
    }

    public int getPrice() {
        return price;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }


}

class Tv extends Product {
    public Tv () {
        super(100);
    }
    @Override
    public String toString() {
        return "Tv" ;
    }

}

class Computer extends Product {
    public Computer () {
        super(200);
    }
    @Override
    public String toString() {
        return "Computer";
    }
}