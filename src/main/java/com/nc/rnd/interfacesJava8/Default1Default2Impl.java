package com.nc.rnd.interfacesJava8;

/**
 * Created by nirk0816 on 8/24/2017.
 */
public class Default1Default2Impl implements Default1, Default2
{
    @Override
    public void method1(String str)
    {
        System.out.println("Default1Impl method 1");
    }

    @Override
    public void method2(String str)
    {
        System.out.println("Default1Impl method 1");
    }

    //Default1 has default method log, which we did not implemented here.
    //Default2 has default method log, which we did not implemented here.
    //Hence, compilation error, because diamond problem occurs as compiler is not able to decide which version of log method to be considered.

    //In such cases, we must provide implementation of default method here.


    @Override
    public void log(String str)
    {
        System.out.println("Implementation of default method to avoid conflict");
    }

    public static void main(String[] args)
    {
        Default1 default1 = new Default1Impl();
        default1.method1("abc");
        default1.log("nirav");
        Default1.staticLog("static log 1");//you cannot call staticLog method on default1 (Implementor)

        Default2 default2 = new Default2Impl();
        default2.method2("abc");
        default2.log("nirav 2");
        Default2.staticLog("static log 2");

    }


}
