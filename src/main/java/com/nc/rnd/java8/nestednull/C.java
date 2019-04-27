package com.nc.rnd.java8.nestednull;

public class C {

    private D d = new D();

    public D getD() {
        System.out.println("C.getD");

        return d;
    }

    public void setD(D d) {
        this.d = d;
    }
}
