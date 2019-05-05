package com.nc.rnd.stringprograms;

public class CharArrayToString {

    public static void main(String[] args) {


        char[] characters = {'h', 'i'};



        String str = "Hi";
        String str1 = new String("Hi");
        String str2 = new String(characters);

        System.out.println(str2);

        //All wrapper classes have a method called valueOf(String/char[])
        //They always return the type = wrapper class


        Integer i = Integer.valueOf("1");
        Float f = Float.valueOf("1.2");
        Character c = Character.valueOf('A');
        String s = String.valueOf("Hi");
        String s1 = String.valueOf(characters);

        //What yo uhave is String or CharacterArray And you want the object of Wrapper Type





    }
}
