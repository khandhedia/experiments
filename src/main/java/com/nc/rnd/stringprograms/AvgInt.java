package com.nc.rnd.stringprograms;

public class AvgInt {
    public static void main(String[] args) {
        int[] array={4,5,6,10,4};
        int sum=0;
        float avg=0;
        for(int i=0;i<=array.length-1;i++)
        {
             sum=sum+array[i];
        }

        avg = (float)sum/array.length;

        System.out.println("Average is:"+ avg);

    }
}
