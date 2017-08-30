package com.nc.rnd.threads;

/**
 * Created by nirk0816 on 8/30/2017.
 */
class ThreadExtended extends Thread
{
    @Override
    public void run()
    {
        System.out.println("Run from ThreadExtended");
    }
}

public class ThreadExtendedTest
{
    public static void main(String[] args)
    {
        Thread threadExtended = new ThreadExtended();
        threadExtended.start();
    }
}
