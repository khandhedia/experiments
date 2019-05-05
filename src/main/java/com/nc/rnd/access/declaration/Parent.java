package com.nc.rnd.access.declaration;

/**
 * Created by nirk0816 on 8/21/2017.
 */
public class Parent
{

    private int privateInt; //only within this class

    int defaultInt; //same package

    protected int protectedInt; //same package OR  child class (in any package) or

    public int publicInt; //anywhere

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
