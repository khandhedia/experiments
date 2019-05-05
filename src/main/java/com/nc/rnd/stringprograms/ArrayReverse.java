package com.nc.rnd.stringprograms;

import java.util.Arrays;

public class ArrayReverse {


    public static void main(String[] args) {


        int input[] = {1, 2, 3, 4, 5};

        int output[] = new int[input.length];

        int pointerToNewArray = 0;

        for(int i = input.length-1; i >= 0 ; i--) {

            output[pointerToNewArray] = input[i];
            pointerToNewArray = pointerToNewArray + 1;
        }

        System.out.println(Arrays.toString(output));


        //5 -> 2

        int pointerToSecondVariableForSwap = input.length - 1;

        for(int i = 0 ; i < input.length / 2 ; i++) {

            int temp = input[i];
            input[i] = input[pointerToSecondVariableForSwap];
            input[pointerToSecondVariableForSwap] = temp;

            pointerToSecondVariableForSwap = pointerToSecondVariableForSwap - 1;

            //swap - input[i] with input[pointerToSecondVariableForSwap]
            //swap - input[0] with input[4]
            //swap - input[1] with input[3]

        }

        System.out.println(Arrays.toString(input));

    }


}
