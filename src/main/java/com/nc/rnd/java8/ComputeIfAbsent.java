package com.nc.rnd.java8;

import org.apache.commons.lang3.ArrayUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class ComputeIfAbsent {

    public static void main(String[] args) {


        Map<Integer, List<String>> map = new HashMap<>();

        Random random = new Random();
        for(int i=0 ; i < 20 ; i++){
            int i1 = random.nextInt(10);
            map.computeIfAbsent(i1, temp -> map.put(temp, new ArrayList<>()));
            map.get(i1).add(""+i1);
        }

        map.keySet().forEach(key -> System.out.println(ArrayUtils.toString(map.get(key))));


    }
}
