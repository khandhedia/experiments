package com.nc.rnd.access.declaration;

/**
 * Created by nirk0816 on 8/21/2017.
 */
public class InstanceSamePackage
{
    public void method()
    {
        Parent parentObject = new Parent();
        //parentObject.privateInt = 10;
        parentObject.defaultInt = 20;
        parentObject.protectedInt = 30; //Protected variable is accessible through instance in same package, even if the parent class is not subclassed here
        parentObject.publicInt = 40;
    }

}
