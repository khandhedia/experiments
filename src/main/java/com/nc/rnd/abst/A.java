package com.nc.rnd.abst;

class A extends AbstractClass
{
    public A()
    {
        System.out.println("This is Concrete class constructor");
    }

    @Override
    public void calculateSum(int a, int b) {
        super.calculateSum(a, b);
    }

    public static void main(String[] args)
    {
        A a = new A();
    }
}
