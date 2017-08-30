package com.nc.rnd.access.otherPackage;

import com.nc.rnd.access.declaration.Parent;

/**
 * Created by nirk0816 on 8/21/2017.
 */
public class InstanceOtherPackage
{
    public void method()
    {
        Parent parentObject = new Parent();
        //parentObject.privateInt = 10;
        //parentObject.defaultInt = 20; //Default variable is not accessible through instance in other package
        //parentObject.protectedInt = 30; //Protected variable is not accessible through instance in other package, as this class is not a subclass of parent class too.
        parentObject.publicInt = 40;
    }



}
