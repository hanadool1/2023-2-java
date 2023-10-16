package com.green.day12.ch6;

class Data {
    int x;
}
public class PrimitiveParamEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.printf("main() : x = %d\n", d.x); //10
        change(d.x);
        System.out.printf("main() : x = %d\n", d.x); //0, 10,

        System.out.println("---------------------");
        Data d2 = new Data();
        d2.x = 100;
        System.out.printf("1 main() : d2.x = %d\n", d2.x); //1. 100
        change(d2);
        System.out.printf("2 main() : d2.x = %d\n", d2.x); //2. 1000
    }
    public static void change(int x) {
        x = 1000;
        System.out.printf("change() : x = %d\n", x);
    }
    public static void change(Data d) {
        d.x = 1000;
        System.out.printf("3 change() : x = %d\n", d.x); //3. 1000
    }

}