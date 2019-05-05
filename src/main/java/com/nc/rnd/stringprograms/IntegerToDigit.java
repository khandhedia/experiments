package com.nc.rnd.stringprograms;

public class IntegerToDigit {

    public static void main(String[] args) {


        int input = 1986;

        //modulo 10 => 6 --> shesh
        //divide by 10 => 198 -->  bhagfal

        //modulo 10 ==> 8
        //divide by 10 => 19

        //modulo 10 => 9
        //divide by 10 => 1

        //modulo 10 => 1
        //divide by 10 => 0

        for( ;  ; ){

            int shesh = input % 10;
            System.out.println(shesh);

            int bhagfal = input / 10;

            if(bhagfal == 0) {
                break;
            }

            input = bhagfal;

        }

/*
        divison operator -> /
        modulo operator -> %

 */
//1986/1000->1.986->1
//1986-1000->986
//986/100->9.86->9
//986-100->886







    }

}
