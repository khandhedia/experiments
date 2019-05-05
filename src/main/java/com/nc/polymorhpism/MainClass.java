package com.nc.polymorhpism;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MainClass {

    //Code to Interface / Code to Parent

    public static void depositMoneyInAccount(SavingAccount bankAccount) {

    }


    public static void main(String[] args) {


        //Reference Variable = Object
        BankAccount p = new BankAccount();
        p.print("nirav");


//        "nirav khandhedia";
//                "rav kaea";

/*


        BankAccount c = new SavingMaximaAccount();
        c.print("mittal");



        BankAccount c1 = new SavingAccount(1111111111);
        c1.print("nirav111");

        //Send as part of method arguments
        //Store it in collection
//
        Map map = new TreeMap();


        hashMap.putIfAbsent("chaman", "chandu");
        map.size();




*/



/*
        DataBaseLayer -> DataBase Connection
             > Query Execute*/

/*        ((SavingAccount) c ).timepass();

        //Casting
        SavingAccount d = (SavingAccount) c;
        d.timepass();*/



        CurrentAccount ca = new CurrentAccount();
        ca.print("chaman");


    }
/*
    Jaimin Thakkar => Jaimin Thakkar
    Son of Rajubhai Thakkar => Jaimin Thakkar
*/
}


