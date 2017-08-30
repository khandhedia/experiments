package com.nc.rnd.access.declaration;

/**
 * Created by nirk0816 on 8/23/2017.
 */

class A
{
    //If this method is private, the method in B is not an overriden method, but altogether a different method in itself, just having the same name.
    //In such case, call hierarchy would be:
    // Main -> B.methodOne -> A.methodTwo -> A.methodOne -> A.methodTwo -> B.methodOne -> Main

    //If this method is made public, the method in B will actually override the methodOne of class A.
    //In such case, if methodOne is called on instance B, it will consider method body of B.methodOne always.
    //Main -> B.methodOne -> A.methodOne -> B.methodOne -> A.methodOne ... Recursive
    private int methodOne(int i)
    {
        System.out.println("Class A - MethodOne");
        return ++i;
    }



    public int methodTwo(int i)
    {
        System.out.println("Class A - MethodTwo");
        return this.methodOne(++i);
    }
}

class B extends A
{
    public int methodOne(int i)
    {
        System.out.println("Class B - MethodOne");
        return methodTwo(++i);
    }
}

public class Shadow
{
    public static void main(String[] args)
    {
        System.out.println("Main method - Start");
        System.out.println(new B().methodOne(101));
        System.out.println("Main method - End");
    }
}

