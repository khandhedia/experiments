package com.nc.rnd.abst;

public class InterfaceDemo {

    public static void main(String[] args) {

        BankAccountInterface saving = new SavingAccountImpl();
        saving.depositMoneyInAccount(100);

        BankAccountInterface current = new CurrentAccountImpl();
        current.depositMoneyInAccount(200);



    }

}
