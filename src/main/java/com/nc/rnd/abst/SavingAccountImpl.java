package com.nc.rnd.abst;

public class SavingAccountImpl extends BankAccountImpl{



    @Override
    public String sendNotificationType() {
        return "SMS";
    }


}
