package com.nc.rnd.access.newaccessdemo;

public class ParentClass {

    protected int id;

    protected int name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public final void method() {
        System.out.println("hello from parent");
    }

}
