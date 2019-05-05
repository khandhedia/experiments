package com.nc.rnd.stringprograms;

public class PrimeNumberFirst100 {


    public static void main(String[] args) {


//        int input = 6;

        int count = 0;

        for (int i = 2 ; ; i++) {

            boolean isPrimeNumber = checkPrimeNumber(i);

            if(isPrimeNumber == true) {
                System.out.println(i);
                count = count + 1;
            }

            if (count == 100)
                break;
        }


//        System.out.println(input + " is a prime number");

    }

    private static boolean checkPrimeNumber(int input) {
        boolean isPrimeNumber = true;

        for(int i = 2 ; i < input; i++) {
            if(input % i == 0) {
                isPrimeNumber = false;
                break;
            }
        }

/*        if(isPrimeNumber == true) {
            System.out.println(input + " is a Prime Number");
        } else {
            System.out.println(input + " is Not a Prime Number");
        }*/
        return isPrimeNumber;
    }

}
