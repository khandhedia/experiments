package com.nc.rnd;

import java.util.*;

public class StringCharacterRemove {

    public static void main(String[] args) {

        String str = "nirav khandhedia";

        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0 ; i < str.length() ; i++) {

            char c = str.charAt(i);

            int currentCount;

            Integer integer = map.get(c);

            if(null == integer) {
                currentCount = 0;
            } else {
                currentCount = integer;
            }

            int newCount = currentCount + 1;

            map.put(c, newCount);

        }

        System.out.println(map);

        for (int j = 0 ; j < str.length(); j++) {

            char c = str.charAt(j);

            Integer integer = map.get(c);

            if(null == integer) {

            } else if(integer == 2){

            } else {
                System.out.print(c);
            }

        }


        List<String> list = new ArrayList<>();
        list.add("nirav");
        list.add("mittal");
        list.add("jaimin");
        list.add("mittal");

        Set<String> set1 = new TreeSet<>();
        set1.add("nirav");
        set1.add("mittal");
        set1.add("jaimin");
        set1.add("ittalm");



        //If two same objects are there > Definitely they would have same hashCode
        //If two same hashCode are there > Not necessariliy they are the same objects
        //>> In this case, you need to validate the exact match by using equals method


        boolean matched = "nirav".equals("jaimin");

        String a = "nirav"; //a = ahemdabad
        String b = "nirav"; //b = rajkot / ahmedabad

        boolean matched1 = a == b;

/*        NullPointerException n = null;
        n.printStackTrace();*/

        //List: index is guranteed

        System.out.println("List Content: \n" + list);

        list.set(2, "lalu");


        //Set: index is not fixed - not guranteed
        System.out.println("List Content Updated: \n" + list);


        System.out.println("Set Content: \n" + set1);


    }






}
