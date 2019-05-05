package com.nc.rnd.stringprograms;

public class StringBubbleSort {

    public static void main(String[] args) {

        String s1 = "nirav";
        String s2 = "mittal";
        String s3 = "Jaimin";


//        int array[] = {11, 6, 9};

        String array[] = {s1, s2, s3};

        for(int i = 0 ; i < array.length ; i++) {
            System.out.println("\nLeft hand " + array[i]);//

            for(int j = i+1 ; j < array.length; j++) {
                System.out.println("Right hand " + array[j]);//


                if(array[i].compareTo(array[j]) > 0) {

                    String tempVariable = array[i];
                    array[i] = array[j];
                    array[j] = tempVariable;

                }



/*                if(array[i] > array[j]) {
if(array[i] - array[j] > 0)
                    int tempVariable = array[i];
                    array[i] = array[j];
                    array[j] = tempVariable;
                }*/

            }

        }


        System.out.println("Sorted array: ");

        for(int i = 0 ; i < array.length ; i++) {
            System.out.println(array[i]);
        }

    }
}
