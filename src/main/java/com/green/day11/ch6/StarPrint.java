package com.green.day11.ch6;

public class StarPrint {

    void line(int n){
        for (int i=0; i<n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

//    void square(int n1) {
//        for (int i=0; i<n1; i++) {
//            for (int z=0; z<n1; z++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }

    void square(int n1) {
        for (int z=0; z<n1; z++) {
            line(n1);
        }
    }

    void triangle(int n2) {
        for (int j=1; j<=n2; j++) {
            line(j);
        }
    }

    String chkGenderById(String id) {
        char ch = id.charAt(7);
        switch (ch){
            case '2','4':
                return "여성";
            case '1','3':
                return "남성";
        }
        return "유효하지 않은 주민번호";
    }

    int sumFromTo(int from, int to) {
        int sum = 0;
        for (int i=from; i<=to; i++) {
            sum += i;
        }
        return sum;
    }


}
