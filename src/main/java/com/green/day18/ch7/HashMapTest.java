package com.green.day18.ch7;

import java.util.*;

public class HashMapTest {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("a",10); // key, value
        map.put("b",20);

        Object obj = map.get("a");
        int val = (int)obj;
        System.out.println("val : " + val);
    }
}

class HashMapTest2 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Tv", 0);
        map.put("Computer", 0);
        map.put("Audio", 0);

        map.put("Tv",map.get("Tv") + 1);
        map.put("Tv",map.get("Tv") + 1);

        System.out.println("Tv-Count : " + map.get("Tv"));
        System.out.println(map.size());
    }
}
