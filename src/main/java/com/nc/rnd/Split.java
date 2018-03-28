package com.nc.rnd;

import java.util.StringTokenizer;

public class Split
{
    public static void main(String[] args)
    {
        String input = "1 2 3   4 5 6 7   ";
        String splitArray[] = input.split(" ");
        for (int i=0 ; i < splitArray.length ; i++)
        {
            System.out.println("*" + splitArray[i] + "*");
        }

        StringTokenizer stringTokenizer = new StringTokenizer(input, " ");
        while(stringTokenizer.hasMoreTokens())
        {
            System.out.println("*" + stringTokenizer.nextToken() + "*");
        }

    }
}
