package com.nc.rnd.stringprograms;

import java.util.*;

public class CharacterCount {


    static String  str = "Jaimin Thakkar Rajendrabhai";

    /**
     *
     *
     * j -> 1
     * a -> 3
     *
     * key -> value
     *
     * Character -> Integer
     * char -> int == Premitive  = Not supported in Collections e.g. HashMap
     *
     *
     * @param args
     */


    public static void main(String[] args) {

        Map<Character, Integer> map = new HashMap<>();
//
//        char[] array = {'j','a'};
//
//        charAt(0)
//                indexOf('j')

        char[] chars = str.toCharArray();

        for(int i=0 ; i < chars.length; i++) {

            char c = chars[i];


            Integer integer = map.get(c);

            if(integer == null) {
                //map ni andar key miuko with value as 1

                map.put(c, 1);


            } else {
                //increment the value

                map.put(c, integer + 1);
            }

        }

        System.out.println(map);


        Set<Character> characters = map.keySet();

        System.out.println(characters);

/*        for(int j = 0 ; j < characters.length ; j++) {
            Integer count = map.get(characters[j]);
            if(count > 1) {
                it is duplicate
            }
        }*/


        // j a i m n t h.......

        Iterator<Character> i = characters.iterator();
        while(i.hasNext()) {
            Character character = i.next();

            Integer integer = map.get(character);
            if(integer >= 2) {
                System.out.println(character);
            }
        }


    }



}
