package com.nc.rnd.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Created by nirk0816 on 2/6/2017.
 */
public class EmployeeSortTest {

    public static void main(String args[]) {

        EmployeeEntity e1 = new EmployeeEntity(10, "Nirav", "abcd");
        EmployeeEntity e2 = new EmployeeEntity(11, "Mirav", "efgh");

        List<EmployeeEntity> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);

        System.out.println("\nSorting using Name \n");

        EmployeeComparatorUsingName comparator = new EmployeeComparatorUsingName();
        Collections.sort(list, comparator);

        System.out.println(list);

        for(int i = 0 ; i < list.size() ; i++) {
            EmployeeEntity employeeEntity = list.get(i);
            System.out.println("Hi " + employeeEntity);
        }



        Iterator itr = list.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }

        System.out.println("\nSorting using Dept \n");

        Collections.sort(list,new EmployeeComparatorUsingDept());

        itr = list.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }

        System.out.println("\nSorting using Age \n");

        Collections.sort(list,new EmployeeComparatorUsingAge());

        itr = list.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }


    }
}
