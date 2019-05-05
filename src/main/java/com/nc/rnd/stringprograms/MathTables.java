package com.nc.rnd.stringprograms;

import java.util.Scanner;

public class MathTables {


    static int input, input1;


    public static void main(String[] args) throws Exception {

        do {
            scan();
            if (input1 < input) {
                System.out.println("End number is less than start number");
            }
            else break;
        } while (true);
        for (int i = input; i <= input1; i++) {
            System.out.println(i + " Table:");
            for (int j = 1; j <= 10; j++) {
                int a = i * j;
                System.out.println(i + " x " + j + " = " + a);
            }


        }
    }

    private static void scan() {
        System.out.println("enter start tables number :");
        Scanner sc = new Scanner(System.in);
        input = sc.nextInt();
        System.out.println("enter end tables number greater than start table:");
        input1 = sc.nextInt();
        int count = 0;
        /*if (input1 < input) {
            System.out.println("End number is less than start number");
            scan();
        }*/
    }
}
