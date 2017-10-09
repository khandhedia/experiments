package com.nc.rnd.access.declaration;

/**
 * Created by nirk0816 on 8/21/2017.
 */
public class SubClassSamePackage extends Parent
{
    public void method()
    {

        //privateInt = 10; -- Error
        defaultInt = 10;
        protectedInt = 20;
        publicInt = 30;

    }

    @Override
    public void method1()
    {
        super.method1();
    }
}
