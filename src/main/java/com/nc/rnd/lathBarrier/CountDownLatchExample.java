package com.nc.rnd.lathBarrier;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample
{

    public static void main(String[] args)
    {
        CountDownLatch latch = new CountDownLatch(3);

        Thread t1 = new Thread(new ActivityForCountDownLatch(latch));
        Thread t2 = new Thread(new ActivityForCountDownLatch(latch));
        Thread t3 = new Thread(new ActivityForCountDownLatch(latch));

        t1.start();
        t2.start();
        t3.start();

        System.out.println("Spawned all threads.. now waiting for all to complete their operations");
        try
        {
            latch.await();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("All threads completed their operation");

        System.out.println("trying to re-use latch!");

        Thread t4 = new Thread(new ActivityForCountDownLatch(latch));
        Thread t5 = new Thread(new ActivityForCountDownLatch(latch));
        Thread t6 = new Thread(new ActivityForCountDownLatch(latch));

        t4.start();
        t5.start();
        t6.start();

        System.out.println("Spawned new three threads.. now waiting for them to complete their operations");
        try
        {
            latch.await();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("New threads completed their operation");

    }
}
