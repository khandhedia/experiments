package com.nc.rnd.java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class RetainAll {

    public static void main(String[] args) {

        Map<String, String>  map = new HashMap<>();
        map.put("1","1");
        map.put("2","2");
        map.put("3", "3");

        List list = Arrays.asList("1","2");

        Set<String> keys = map.keySet();
        System.out.println("Size"  + map.size());

        keys.retainAll(list);

        System.out.println("Size"  + map.size());
        keys.forEach(System.out::println);
    }
}
