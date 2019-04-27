package com.nc.rnd.java8.nestednull;

public class B {

    C c = new C();

    public C getC() {
        System.out.println("B.getC");

        return c;
    }

    public void setC(C c) {
        this.c = c;
    }
}
