package com.nc.rnd.lathBarrier;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class ActivityForCyclicBarrier implements Runnable
{
    private final CyclicBarrier cyclicBarrier;

    public ActivityForCyclicBarrier(CyclicBarrier cyclicBarrier)
    {
        this.cyclicBarrier = cyclicBarrier;
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
        System.out.println("Waiting on barrier " + Thread.currentThread().getName());
        try
        {
            cyclicBarrier.await();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        catch (BrokenBarrierException e)
        {
            e.printStackTrace();
        }
        System.out.println("After await " + Thread.currentThread().getName());
    }
}
