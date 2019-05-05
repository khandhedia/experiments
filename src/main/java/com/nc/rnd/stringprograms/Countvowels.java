package com.nc.rnd.stringprograms;

public class Countvowels {

    public static void main(String[] args) {

        String s = "jaimin thakkar";
        int countVowel = 0, countConsonant = 0, countspecial=0;
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if (isVowel(a) == true) {
                countVowel = countVowel + 1;
            } else if (isConsonant(a) == true) {
                countConsonant = countConsonant + 1;
            }
            else {
                countspecial=countspecial+1;
            }
        }
        System.out.println("No of vowels:" + countVowel);
        System.out.println("No of consonants:" + countConsonant);
        System.out.println("No of special char:" + countspecial);
    }

    private static boolean isVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return true;
        }
        return false;
    }

    private static boolean isConsonant(char c) {
        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
            return true;
        }
        return false;

    }
}
