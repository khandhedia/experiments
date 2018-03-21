package com.nc.rnd.statics;

/**
 * Created by nirk0816 on 8/24/2017.
 */
class ConstructorStaticBlockStaticMethodStaticVariable
{
    static
    {
        System.out.println("Static Block Execution");
    }

    public ConstructorStaticBlockStaticMethodStaticVariable()
    {
        System.out.println("Constructor Execution");
    }

    {
        System.out.println("Anonymous block execution");
    }

}

class A extends ConstructorStaticBlockStaticMethodStaticVariable
{
    public A()
    {
        System.out.println("Constructor for class A execution");
    }

    public static void main(String[] args)
    {
        A a  = new A();
    }
}

/*

Static Block Execution
Anonymous block execution
Constructor Execution
Constructor for class A execution

 */