package com.nc.rnd.generics;

/**
 * Created by nirk0816 on 2/10/2017.
 */
public class Scoda extends com.nc.rnd.statics.Car {

    String variant;
    public Scoda(String variant) {
        super("Scoda");
        this.variant = variant;
    }

    public String getVariant() {
        return variant;
    }
}
