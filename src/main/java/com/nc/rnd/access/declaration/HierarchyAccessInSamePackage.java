package com.nc.rnd.access.declaration;

/**
 * Created by nirk0816 on 8/22/2017.
 */
public class HierarchyAccessInSamePackage
{
    public void method2()
    {
        Parent parent = new Parent();
        //parent.privateInt = 10;
        parent.protectedInt = 20;
        parent.defaultInt = 30;
        parent.publicInt = 40;

        SubClassSamePackage subClassSamePackage = new SubClassSamePackage();
        //subClassSamePackage.privateInt = 10;
        subClassSamePackage.protectedInt = 20;
        subClassSamePackage.defaultInt = 30;
        subClassSamePackage.publicInt = 40;

        GrandSubClassSamePackage grandSubClassSamePackage = new GrandSubClassSamePackage();
        //grandSubClassSamePackage.privateInt = 10;
        grandSubClassSamePackage.protectedInt = 20;
        grandSubClassSamePackage.defaultInt = 30;
        grandSubClassSamePackage.publicInt = 40;
    }
}
