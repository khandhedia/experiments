package com.nc.rnd.lathBarrier;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

public class ActivityForCountDownLatch implements Runnable
{

    private final CountDownLatch countDownLatch;

    public ActivityForCountDownLatch(CountDownLatch countDownLatch)
    {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run()
    {


        try
        {
            Thread.sleep(Math.abs(new Random().nextInt()) % 10 * 1000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("Waiting on latch " + Thread.currentThread().getName());
        countDownLatch.countDown();
        System.out.println("After countDown " + Thread.currentThread().getName());

    }
}
