package com.nc.rnd.abst;

public class CurrentAccountImpl extends BankAccountImpl{


    @Override
    public String sendNotificationType() {
        return "Paper";
    }
}
