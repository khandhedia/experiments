package com.nc.rnd.stringprograms;

import java.util.HashMap;
import java.util.Map;

public class CharCount {

    public static void main(String[] args) {
        String s="JAIMIN";

        Map<Character,Integer> m=new HashMap<>();

        for(int i=0;i<s.length()-1;i++){

            char character = s.charAt(i);
            Integer count = m.get(character);

            if(count==null)
            {
                m.put(character,1);
            }
            else
            {
                m.put(character,count+1);
            }
        }

        System.out.println(m);



    }
}
