package com.nc.rnd.comparator;

import java.util.Comparator;

/**
 * Created by nirk0816 on 2/6/2017.
 */
public class EmployeeComparatorUsingDept implements Comparator<EmployeeEntity> {

    @Override
    public int compare(EmployeeEntity o1, EmployeeEntity o2) {
        return o1.getDept().compareTo(o2.getDept());
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}
