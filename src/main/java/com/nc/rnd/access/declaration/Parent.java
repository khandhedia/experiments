package com.nc.rnd.access.declaration;

/**
 * Created by nirk0816 on 8/21/2017.
 */
public class Parent
{
    int defaultInt;

    private int privateInt;

    protected int protectedInt;

    public int publicInt;

    class InnerParent{
        public void method()
        {
            privateInt = 10;
            protectedInt = 20;
            defaultInt = 30;
            publicInt = 40;
        }
    }

    protected void method1()
    {

    }

}
