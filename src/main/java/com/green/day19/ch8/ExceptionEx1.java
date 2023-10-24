package com.green.day19.ch8;

public class ExceptionEx1 {
    public static void main(String[] args) {
        int num = 0;
        try {
            // 예외가 발생할 가능성이 있는 코드
            num = 10;
            num = num / 0;
        } catch (Exception e) {
            // 예외 발생 시 실행되는 코드
            e.printStackTrace(); // 에러메세지 콘솔에 뜸
            System.out.println("예외 발생!!");
            num = -1;
        } finally {
            // 예외가 발생이 되든 안되든 반드시!! 실행된다.
            System.out.println("finally 실행!");
        }
        System.out.printf("num : %d\n", num);
        System.out.println("---끝---");
    }
}


class ExceptionEx1_2 {
    public static void main(String[] args) {
        div(20);
    }
    public static void div(int num) {
        try {
            // 예외가 발생할 가능성이 있는 코드
            num = 10;
            return;
        } catch (Exception e) {
            // 예외 발생 시 실행되는 코드
            e.printStackTrace(); // 에러메세지 콘솔에 뜸
            System.out.println("예외 발생!!");
            num = -1;
        } finally {
            // 예외가 발생이 되든 안되든 반드시!! 실행된다.
            System.out.println("finally 실행!");
        }
        System.out.printf("num : %d\n", num);
        System.out.println("---끝---");
    }
}

class ExceptionEx1_3 {
    public void sum() {}
    public static void main(String[] args) {
        try {
//            int num = 10 / 0; 수학적 예외
//            ExceptionEx1_3 obj = null;
//            obj.sum(); 널포인트 예외
            int[] arr = new int[10];
            arr[10] = 10; // 모든 예외
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("수학적 예외");
        } catch (NullPointerException e) {
            System.out.println("널포인트 예외");
        } catch (Exception e) {
            System.out.println("모든 예외");
        }
        System.out.println("끝!!!");
    }
}