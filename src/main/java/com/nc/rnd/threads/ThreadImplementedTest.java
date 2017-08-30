package com.nc.rnd.threads;

/**
 * Created by nirk0816 on 8/30/2017.
 */
class ThreadImplemented implements Runnable
{
    @Override
    public void run()
    {
        System.out.println("Run from ThreadImplemented");
    }
}

public class ThreadImplementedTest
{
    public static void main(String[] args)
    {
        Runnable runnable = new ThreadImplemented();
        Thread thread = new Thread(runnable);

        thread.start();
    }
}