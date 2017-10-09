package com.nc.rnd.lathBarrier;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierExample
{

    public static void main(String[] args)
    {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3, new CyclicBarrierCommonActivity());

        Thread t1 = new Thread(new ActivityForCyclicBarrier(cyclicBarrier));
        Thread t2 = new Thread(new ActivityForCyclicBarrier(cyclicBarrier));
        Thread t3 = new Thread(new ActivityForCyclicBarrier(cyclicBarrier));

        t1.start();
        t2.start();
        t3.start();

        System.out.println("All threads completed their operation");

        System.out.println("trying to re-use cyclic barrier!");

        Thread t4 = new Thread(new ActivityForCyclicBarrier(cyclicBarrier));
        Thread t5 = new Thread(new ActivityForCyclicBarrier(cyclicBarrier));
        Thread t6 = new Thread(new ActivityForCyclicBarrier(cyclicBarrier));

        t4.start();
        t5.start();
        t6.start();

        System.out.println("New threads completed their operation");

    }
}
