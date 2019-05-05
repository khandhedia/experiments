package com.nc.rnd.stringprograms;

public class Palindrome {



    public static void main(String[] args) {

        String s="mittal";

        String s1 = "This is Mittal";
        String[] strings = s1.split(" ");

        for(int i = 0 ; i < strings.length ; i++ ){
            System.out.println(strings[i]);
        }


        String output = "";



        String op="";
        for(int i=strings.length-1; i>=0;i--){
            op= op+ strings[i]+" ";
        }
        System.out.println(op);

        for(int i=0 ; i < strings.length ; i++) {
            output =  output + reverseWord(strings[i]) + " " ;
        }

        System.out.println(output);


/*
        String reverseWord = reverseWord(s);

        System.out.println(reverseWord);*/

       /* if(c.equals(s))
        {
            System.out.println("String is Palindrome");
        }
        else
        {
            System.out.println("String is not Palindrome");
        }*/

    }

    private static String reverseWord(String s) {

        String c = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            c = c + s.charAt(i);
        }

        return c;

    }


}

//100 pana no paragraph --> 10000000 bytes

/*""
"l"
"la"
"lat"*/

