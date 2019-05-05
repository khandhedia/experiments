package com.nc.rnd.access.newaccessdemo1;

import com.nc.rnd.access.declaration.Parent;
import com.nc.rnd.access.newaccessdemo.ParentClass;
import com.nc.rnd.comparator.EmployeeEntity;

import java.io.File;

public class AccessDemoMainClass {

    public static void main(String[] args) throws Exception {


        AccessDemoMainClass accessDemoMainClass = new AccessDemoMainClass();
        try {
            accessDemoMainClass.division(1, 1);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Some exception occurred, possibly divide by zero");
        } finally {
            System.out.println("Thank you for using service!");
        }


    }





    public float division(int a, int b) throws Exception {

        EmployeeEntity employeeEntity = new EmployeeEntity(1, "nirav", "dev"); //orphan - Garbage Collection
        //GC

        int i = 0;

        i = a / b;

        return i;

    }

}
