package com.nc.rnd.interfacesJava8;

/**
 * Created by nirk0816 on 8/24/2017.
 */
public interface Default1
{
    void method1(String str);

    default void log(String str){
        System.out.println("I1 logging::"+str);
    }

    static void staticLog(String str){
        System.out.println("I1 Static logging::"+str);
    }
}
