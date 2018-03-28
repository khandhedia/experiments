package com.nc.rnd.com.nc.lambda;

import com.nc.rnd.generics.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by nirk0816 on 4/3/2017.
 */
public class StreamsExp {

    public static void main(String[] args) {
        StreamsExp streamsExp = new StreamsExp();
        streamsExp.test();
    }

    private void test()
    {
        List<Integer> integerList = Arrays.asList(1,2,3,4);
        List<Integer> integerList2 = new ArrayList<>();


        integerList.stream().filter(f -> f.intValue() % 2 == 0).forEach(g->{
            integerList2.add(g);
        });

        ArrayList<Integer> collect = integerList.stream().map(integer -> integer * 3).collect(Collectors.toCollection(ArrayList::new));

        System.out.print(Arrays.asList(integerList2));

        System.out.println(Collections.singletonList(collect));
    }
}
