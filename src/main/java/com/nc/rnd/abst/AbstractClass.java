package com.nc.rnd.abst;

/**
 * Created by nirk0816 on 8/24/2017.
 */
public abstract class AbstractClass
{
    public AbstractClass()    {
        System.out.println("This is abstract class constructor");
    }
}

class A extends AbstractClass
{
    public A()
    {
        System.out.println("This is Concrete class constructor");
    }

    public static void main(String[] args)
    {
        A a = new A();
    }
}
