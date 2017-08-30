package com.nc.rnd.compareEquals;

import java.util.Comparator;

/**
 * Created by nirk0816 on 8/22/2017.
 */
public class StudentNameComparator implements Comparator<Student>
{
    @Override
    public int compare(Student o1, Student o2)
    {
        return o1.name.compareTo(o2.name);
    }
}
