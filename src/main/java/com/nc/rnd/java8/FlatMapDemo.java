package com.nc.rnd.java8;

import java.util.*;
import java.util.stream.Stream;

public class FlatMapDemo {

    public static void main(String[] args) {

        flatMapForStringArrays();

        flatMapForListOfSet();

        flatMapForListOfListOfSet();

    }

    private static void flatMapForListOfListOfSet() {
        Set<String> stringSet1 = new HashSet<>(Arrays.asList("Nirav1", "Mitul1", "Mittal1"));
        Set<String> stringSet2 = new HashSet<>(Arrays.asList("Nirav2", "Mitul2", "Mittal2", "Nirav1"));
        List<Set<String>> setList1 = new ArrayList<>();
        setList1.add(stringSet1);
        setList1.add(stringSet2);

        List<Set<String>> setList2 = new ArrayList<>();
        setList2.add(stringSet1);
        setList2.add(stringSet2);

        List<List<Set<String>>> lists = new ArrayList<>();
        lists.add(setList1);
        lists.add(setList2);
/*
        [[Mitul1, Nirav1, Mittal1], [Nirav2, Mitul2, Nirav1, Mittal2]]
        [[Mitul1, Nirav1, Mittal1], [Nirav2, Mitul2, Nirav1, Mittal2]]
*/

        lists.stream().forEach(System.out::println);
        lists.stream().flatMap(sets -> sets.stream()).forEach(System.out::println);

/*
        [Mitul1, Nirav1, Mittal1]
        [Nirav2, Mitul2, Nirav1, Mittal2]
        [Mitul1, Nirav1, Mittal1]
        [Nirav2, Mitul2, Nirav1, Mittal2]
*/

        lists.stream().flatMap(sets -> sets.stream()).flatMap(strings -> strings.stream()).forEach(System.out::println);

/*
        Mitul1
                Nirav1
        Mittal1
                Nirav2
        Mitul2
                Nirav1
        Mittal2
                Mitul1
        Nirav1
                Mittal1
        Nirav2
                Mitul2
        Nirav1
                Mittal2

*/
    }

    private static void flatMapForListOfSet() {
        Set<String> stringSet1 = new HashSet<>(Arrays.asList("Nirav1", "Mitul1", "Mittal1"));
        Set<String> stringSet2 = new HashSet<>(Arrays.asList("Nirav2", "Mitul2", "Mittal2", "Nirav1"));
        List<Set<String>> setList = new ArrayList<>();
        setList.add(stringSet1);
        setList.add(stringSet2);
        setList.stream().forEach(System.out::println);
/*
        [Mitul1, Nirav1, Mittal1]
        [Nirav2, Mitul2, Nirav1, Mittal2]
*/
        setList.stream().flatMap(strings -> strings.stream()).distinct().forEach(System.out::println);

/*        Mitul1
                Nirav1
        Mittal1
                Nirav2
        Mitul2
                Mittal2
*/
    }

    private static void flatMapForStringArrays() {
        String[][] stringArray = {{"Nirav", "Mitul"}, {"Kano", "Lalo"}};
        Stream<String[]> stream = Arrays.stream(stringArray);
        stream.forEach(System.out::println);
        //[Ljava.lang.String;@8139f0 [Ljava.lang.String;@ca494b
        //Stream closed

        stream = Arrays.stream(stringArray);
        stream.flatMap(strings -> Arrays.stream(strings)).forEach(System.out::println);
        /*
        *
        Nirav
        Mitul
        Kano
        Lalo
        *
        * */
    }

}
