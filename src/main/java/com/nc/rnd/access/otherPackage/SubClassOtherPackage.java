package com.nc.rnd.access.otherPackage;

import com.nc.rnd.access.declaration.Parent;

/**
 * Created by nirk0816 on 8/21/2017.
 */
public class SubClassOtherPackage extends Parent
{
    public void method()
    {
        //privateInt = 10; -- Error
        //defaultInt = 10; -- Error
        protectedInt = 20; //Protected variable is accessible outside package, as  the parent class is subclassed here
        publicInt = 30;
    }


}
