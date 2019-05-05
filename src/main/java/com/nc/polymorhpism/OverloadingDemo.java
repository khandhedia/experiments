package com.nc.polymorhpism;

public class OverloadingDemo {

    //Same class, Same method name, different arguments = Overloading / Compile time Polymorphism
    //Parent Child class, same signature = Overridding // Runtime Polymorphism

    public void calculateArea(int length, int breadth) {
        System.out.println(length * breadth);
    }

    public void calculateArea(int length, int breadth, int height){
        System.out.println(length * breadth * height);
    }


    public static void main(String[] args) {

        OverloadingDemo o = new OverloadingDemo();
        o.calculateArea(5, 19);
        o.calculateArea(2, 3, 4);

    }
}
