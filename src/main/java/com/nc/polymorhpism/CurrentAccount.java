package com.nc.polymorhpism;

public class CurrentAccount extends BankAccount {

    @Override
    public void print(String name) {

        account_id = 30;

        System.out.println("Current Account Print Method");
        System.out.println(account_id);

    }
}
