package com.nc.rnd.java8.nestednull;

public class A {

    B b = null; //new B();

    public B getB() {
        System.out.println("A.getB");
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }
}
