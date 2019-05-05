package com.nc.rnd.stringprograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CharacterCount2 {

    static String str= "Mittal";

    public static void main(String[] args) {

        char[] c = str.toCharArray();

        Map<Character, Integer> m = new HashMap<>();

        for (int i = 0; i < c.length; i++) {
            Integer count = m.get(c[i]);

            if (count == null) {
                m.put(c[i], 1);
            } else {
                m.put(c[i], ++count);
            }
        }

        System.out.println(m);


        System.out.println(m.keySet());

        Set<Character> s=m.keySet();


        Iterator<Character> i = s.iterator();
        while(i.hasNext())
        {
            Character key = i.next();
            Integer b= m.get(key);

            if(b>=2)
            {
                System.out.println(key +" is"+ m.get(key)+" times in String ");
            }
            else
            {
                System.out.println(key + " is not duplicate");
            }
        }

    }

}
