package com.green.day6.ch4;

public class While {
    public static void main(String[] args) {

        for (int i=0; i<10; i++) {
            System.out.println("for - " + i);
        }
        System.out.println("-----------------------");
        int i=0;
        while (i<10) {  // 조건식 확인체크한 후 실행
            System.out.println("while - " + i++);

        }

    }
}
