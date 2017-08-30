package com.nc.rnd.statics;

/**
 * Created by nirk0816 on 8/24/2017.
 */
public class ClassHavingStaticMethod
{
    public static void staticMethod()
    {
        System.out.println("static Method");
    }
}

class ABCD
{
    public static void main(String[] args)
    {
        ClassHavingStaticMethod classHavingStaticMethod = new ClassHavingStaticMethod();
        classHavingStaticMethod.staticMethod(); //We can call static method on implementor if static method is in class (if static method is in interface, this is not possible)
        ClassHavingStaticMethod.staticMethod();
    }

}
