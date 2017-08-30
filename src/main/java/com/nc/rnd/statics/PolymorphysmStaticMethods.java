package com.nc.rnd.statics;

/**
 * Created by nirk0816 on 8/23/2017.
 */


//Because the show method is static in Base class, the show method in Derived is NOT an INHERITED method, but a shadow method.
    //With Static methods polymorphism doesn't work
    //Hence, method will be called corresponding to the reference type, not the instance object type.
    //Here, Base b = new Derived() and b.show() will refer to Base.show(), not Derived.show()

class Base {
    public static void show() {
        System.out.println("Base::show() called");
    }
}

class Derived extends Base {
    public static void show() {
        System.out.println("Derived::show() called");
    }
}

public class PolymorphysmStaticMethods {
    public static void main(String[] args) {
        Base b = new Derived();;
        b.show();
    }
}