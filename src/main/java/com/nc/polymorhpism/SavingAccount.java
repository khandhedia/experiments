package com.nc.polymorhpism;

public class SavingAccount extends BankAccount {


    public SavingAccount() {
        System.out.println("SavingAccount Constructor - No Arguments");
    }

    public SavingAccount(int argument1) {
        System.out.println("SavingAccount Constructor - argument1 = " + argument1);
    }


/*    @Override
    public void print(String name) {

        account_id = 20;

        System.out.println("Saving Account Print Method");
        System.out.println(account_id);

    }*/

    public void timepass() {

        System.out.println("This is timepass");

    }


}
