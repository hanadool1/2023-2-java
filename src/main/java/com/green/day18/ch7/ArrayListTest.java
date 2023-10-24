package com.green.day18.ch7;

import com.green.day12.ch6.Card;

import java.util.*;

public class ArrayListTest {
    public static void main(String[] args) {
        List list = new ArrayList(); // 상속관계
        list.add(10);
        list.add(10.3f);
        list.add(10.4d);
        list.add(101L);
        list.add("dsd");
        list.add(new Card());

        Object val1 = list.get(0);
        int intVal = (int)val1;

        float intVal2 = (float)list.get(1);

        Object obj = 10;
        obj = 10.3f;
        obj = 10.3d;
        obj = 103l;
        obj = "ddd";
        obj = new Card();

    }
}

class ArrayListTest2 {
    public static void main(String[] args) {
        int v1 = 10; // 기본형
        Integer v2 = 10; // 참조형, 래퍼타입 - 기본형의 객체형
        System.out.println(v1 == v2); // true
        List<Integer> list = new ArrayList(); // <>안에 기본형X, 래퍼타입 작성
        list.add(10); // 값을 한번 넣음 > 0번방에
        list.add(20); // 값 > 1번방
        list.add(30); // 값 > 2번방
//        list.add(10.3f);
        int val1 = list.get(0); // get다음에 오는 숫자는 0번방을 의미
        System.out.println(list.get(1)); // 값을 빼는 것

        System.out.println(list.size()); // add를 몇번했는지 ? 3

        // [0] : 10
        // [1] : 20
        // [2] : 30
        for (int i=0; i<list.size(); i++) {
            System.out.printf("[%d] : %d\n", i, list.get(i));
        }
        System.out.println("---------------------");
        for (int val : list) {
            System.out.println(val);
        }

    }
}
class ArrayListTest3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println(list);

        list.add(1,100); // 1번방에 100을 넣고 나머지 애들은 뒤로 밀림
        System.out.println(list);
        list.add(3,200);
        System.out.println(list);

        list.remove(0);
        System.out.println(list);
        System.out.println(list.size());
    }
}