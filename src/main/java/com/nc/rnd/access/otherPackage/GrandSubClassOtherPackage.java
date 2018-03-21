package com.nc.rnd.access.otherPackage;

/**
 * Created by nirk0816 on 8/22/2017.
 */
public class GrandSubClassOtherPackage extends SubClassOtherPackage
{
    public void method1()
    {
        //privateInt = 10; -- Error
        //defaultInt = 10;
        protectedInt = 20;
        publicInt = 30;
    }
}
