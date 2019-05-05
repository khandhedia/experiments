package com.nc.rnd.threads;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SynchronizedTest {

    String sensitiveString = "initial";

    Map<String, String> map = new ConcurrentHashMap<>(16, (float) 0.75, 1);

    public void testMethod()
    {

        System.out.println("Inside testMethod");

        map.put("one", "one1111");

        synchronized (map)
        {
            System.out.println("Sleeping");
            try {
                Thread.sleep(15000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            sensitiveString = "modified";

            System.out.println("Awaken");
        }

        System.out.println("Exiting testMethod");




    }

    public String getSensitiveString() {
        return sensitiveString;
    }

    public void setSensitiveString(String sensitiveString) {
        System.out.println("Setting " + sensitiveString);
        this.sensitiveString = sensitiveString;
        System.out.println("Updated  " + sensitiveString);
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public static void main(String[] args) throws InterruptedException {

        SynchronizedTest synchronizedTest = new SynchronizedTest();

        Thread t1 = new Thread(synchronizedTest::testMethod);

        Thread t2 = new Thread(() -> System.out.println(synchronizedTest.getSensitiveString()));

        Thread t3 = new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("t1 lock status before updating sensitive string" + t1.getState());

            synchronized (synchronizedTest.getMap())
            {
                synchronizedTest.setSensitiveString("chaman");
            }

            System.out.println("Sensitive String Value after Uppdate : " + synchronizedTest.getSensitiveString());


        }
        );

        Thread t4 = new Thread(() ->
        {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            System.out.println("Value from Map: " + synchronizedTest.getMap().get("one"));
        });

        Thread t5 = new Thread(() ->
        {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("t1 lock status before updating map" + t1.getState());
            System.out.println("Updating Map");
            synchronizedTest.getMap().put("two", "two");
            System.out.println("Updated Map");

            System.out.println("Value from Map after Update: " + synchronizedTest.getMap().get("two"));

        });


        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();



        t1.join();

        t2.join();

        t3.join();

        t4.join();

        t5.join();


    }

}
