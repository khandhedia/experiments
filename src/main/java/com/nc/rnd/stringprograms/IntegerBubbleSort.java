package com.nc.rnd.stringprograms;

import java.util.Arrays;

public class IntegerBubbleSort {

    public static void main(String[] args) {

        String s1 = "nirav";
        String s2 = "mittal";
        String s3 = "Jaimin";


        int array[] = {11, 6, 9};

        for(int i = 0 ; i < array.length ; i++) {
            System.out.println("\nLeft hand " + array[i]);//

            for(int j = i+1 ; j < array.length; j++) {
                System.out.println("Right hand " + array[j]);//

                if(array[i] > array[j]) {
                    int tempVariable = array[i];
                    array[i] = array[j];
                    array[j] = tempVariable;
/*
                    temp = a;
                    a = b;
                    b = temp;*/

                }

            }

        }


        System.out.println("Sorted array: ");

        for(int i = 0 ; i < array.length ; i++) {
            System.out.println(array[i]);
        }

    }
}
