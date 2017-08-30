package com.nc.rnd.interfacesJava8;

/**
 * Created by nirk0816 on 8/24/2017.
 */
public class Default1Impl implements Default1
{
    @Override
    public void method1(String str)
    {
        System.out.println("Default1Impl method 1");
    }

    //Default1 has default method log, which we have not implemented here, and it is perfectly fine, because that method is provided with default implementation in interface itself.
    //Default1 has static method staticLog, which we have not implemented here, and it is perfectly fine, because that method is provided with default implementation in interface itself.

    public static void main(String[] args)
    {
        Default1 default1 = new Default1Impl();
        default1.method1("abc");
        default1.log("nirav");
        Default1.staticLog("static log 1");
    }

}
