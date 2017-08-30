package com.nc.rnd.compareEquals;

/**
 * Created by nirk0816 on 8/22/2017.
 */
public class NullHandling
{
    public static void main(String[] args)
    {
        System.out.println("nirav".equals(null)); //This will return false -not an NPE
        System.out.println("nirav".compareTo(null)); //This will throw NPE

/*
        Comparable documentation also states the following:

        The implementor must ensure
            sgn(x.compareTo(y)) == -sgn(y.compareTo(x)) for all x and y.
            (This implies that x.compareTo(y) must throw an exception iff y.compareTo(x) throws an exception.)

        Since

        null.compareTo(x) obviously throws a NPE,
        x.compareTo(null) should throw a NPE as well.

        Whereas for equals, that is not necessarily the case.
*/

/*
        The natural ordering for a class C is said to be consistent with equals
        if and only if e1.compareTo(e2) == 0 has the same boolean value as e1.equals(e2) for every e1 and e2 of class C.

        Note that null is not an instance of any class, and e.compareTo(null) should throw a NullPointerException even though e.equals(null) returns false
*/
    }
}
