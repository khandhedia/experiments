package com.nc.polymorhpism;

public class BankAccount {

    //Class name  = constructor method name
    //There must be at least one constructor
    //There must not be a return type
    //Default blank non-argument constructor is provided by Java by default


    public BankAccount() {
        System.out.println("BankAccount Constructor - No arguments");
    }

    //properties - jaydat
    protected int account_id = 10;

    //behavior - sanskar
    public void print(String name)
    {
        System.out.println("Parent print method");
        System.out.println(account_id);
    }



}
