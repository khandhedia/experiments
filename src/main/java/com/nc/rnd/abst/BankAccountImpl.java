package com.nc.rnd.abst;

import com.nc.polymorhpism.BankAccount;

public abstract class BankAccountImpl implements BankAccountInterface {

    //They can have 0 or more abstract methods
    //If there is at least one abstract method, the class must be declared abstract
    //Even if there are no abstract methods, the class can be declared abstract

    //Abstract Class can provide a base implementation of the interface methods and
    //detailed implementation can be delegated to child classes

    public void sayHi() {
        System.out.println("Hi");
    }

    @Override
    public void depositMoneyInAccount(int amount) {
        System.out.println("Deposit Money");
        System.out.println(sendNotificationType() + " Sent");
    }

    public abstract String sendNotificationType() ;


}
