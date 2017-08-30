package com.nc.rnd.interfacesJava8;

/**
 * Created by nirk0816 on 8/24/2017.
 */
public class Default2Impl implements Default2
{
    @Override
    public void method2(String str)
    {
        System.out.println("Default2Impl method 1");
    }

    //Default2 has default method log, which we have not implemented here, and it is perfectly fine, because that method is provided with default implementation in interface itself.
    //Default2 has static method staticLog, which we have not implemented here, and it is perfectly fine, because that method is provided with default implementation in interface itself.


    public static void main(String[] args)
    {
        Default2 default2 = new Default2Impl();
        default2.method2("abc");
        default2.log("nirav 2");
        Default2.staticLog("static log 2");
    }
}
