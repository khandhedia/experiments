package com.nc.rnd.print1to100;

public class Recursive
{
    public static void main(String[] args)
    {
        Recursive recursive = new Recursive();
        recursive.print(100);
    }

    private void print(int i)
    {
        System.out.println(i);
        if(i-- > 0)
            print(i);
    }

}
