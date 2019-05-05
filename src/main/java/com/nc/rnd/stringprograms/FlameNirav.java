package com.nc.rnd.stringprograms;

import sun.jvm.hotspot.oops.LocalVariableTableElement;

import java.util.*;

public class FlameNirav {

    public static void main(String[] args) {


        String name1 = "Mittal";
        String name2 = "Mitttuu";

        FlameNirav flameNirav = new FlameNirav();
        Map<Character, Integer> name1Map = flameNirav.prepareCharacterCountMap(name1);
        Map<Character, Integer> name2Map = flameNirav.prepareCharacterCountMap(name2);


        System.out.println(name1Map);
        System.out.println(name2Map);

        Set<Character> name1Characters = name1Map.keySet();

        Iterator<Character> name1Iterator = name1Characters.iterator();


        while (name1Iterator.hasNext()) {
            Character character = name1Iterator.next();

            Integer name2Count = name2Map.get(character);
            if(name2Count != null) {
                Integer name1Count = name1Map.get(character);

                int remainingCount = Math.abs(name1Count - name2Count);
                name1Iterator.remove();
                name2Map.put(character, remainingCount);
            }
        }

        System.out.println(name1Map);
        System.out.println(name2Map);

        int count = 0;

        Collection<Integer> values = name1Map.values();
        for(int i = 0; i < values.size() ; i++) {//for loop
        }

        for ( Integer mittal : name1Map.values()) { //for-each loop
            count = count + mittal;
        }

        for ( Integer integer : name2Map.values()) {
            count = count + integer;
        }

        count = count % 5;

        String flame[] = {"Friends", "Love", "Attraction", "Marriage", "Enemy"};


        if (count == 0) {
            count = 5;
        }
        System.out.println("Relation between " + name1 + " and " + name2 + " is: " + flame[count-1]);

/*

        name1Iterator = name1Characters.iterator();

        int count = 0;
        while (name1Iterator.hasNext()) {
            Character character = name1Iterator.next();
            Integer integer = name1Map.get(character);
            count = count + integer;
        }

        Set<Character> name2Characters = name2Map.keySet();
        Iterator<Character> name2Iterator = name2Characters.iterator();

        while (name2Iterator.hasNext()) {
            Character character = name2Iterator.next();
            Integer integer = name2Map.get(character);
            count = count + integer;
        }

        count = count % 5;

        System.out.println("Flame Score : " + "FLAME".charAt(count));


        System.out.println(name1Map);
        System.out.println(name2Map);*/


    }



    private Map<Character, Integer> prepareCharacterCountMap(String str) {

        str = str.toUpperCase();

        char[] charArray = str.toCharArray();

        Map<Character, Integer> characterCountMap = new HashMap<>();

        for (int i = 0; i < charArray.length; i++) {
            Integer count = characterCountMap.get(charArray[i]);

            if (count == null) {
                characterCountMap.put(charArray[i], 1);
            } else {
                characterCountMap.put(charArray[i], ++count);
            }
        }

        return characterCountMap;

    }

}
