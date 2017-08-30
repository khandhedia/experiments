package com.nc.rnd.access.declaration;

/**
 * Created by nirk0816 on 8/22/2017.
 */
public class GrandSubClassSamePackage extends SubClassSamePackage
{
    public void method1()
    {
        //privateInt = 10; -- Error
        defaultInt = 10;
        protectedInt = 20;
        publicInt = 30;
    }
}
