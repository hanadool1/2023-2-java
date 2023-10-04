package com.green.day2.ch2;

public class Printf {
    public static void main(String[] args) {
        System.out.println("안녕");
        System.out.println("안녕");
        System.out.println("안녕");
        System.out.println("-------------");
        System.out.print("Hello");
        System.out.print("Hello");
        System.out.print("Hello");
        System.out.println("-------------");
        System.out.print("Halo\n");   // 이스케이프
        System.out.print("Halo\n");
        System.out.print("Halo\n");
        System.out.println("-------------");

        String name = "홍길동";
        int age = 123;
        char bloodtype = 'b';
        float height = 178.8f;

        // 제 이름은 홍길동이고, 나이는 23세이고, 혈액형은 b형이고, 키는 178.8cm 입니다.

        System.out.print("제 이름은 " + name + "이고, ");
        System.out.print("나이는" + age + "세이고, ");
        System.out.print("혈액형은 " + bloodtype + "형이고, " );
        System.out.println("키는 " + height + "입니다.");

        System.out.printf("제 이름은 %s이고, 나이는%03d세이고, 혈액형은 %c형이고, 키는 %.1fcm입니다."
                            , name, age, bloodtype, height);

    }
}
