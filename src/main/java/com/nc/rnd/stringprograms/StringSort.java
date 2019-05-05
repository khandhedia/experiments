package com.nc.rnd.stringprograms;

import javafx.collections.transformation.SortedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringSort {

    public static void main(String[] args) {

        String s1 = "nirav";
        String s2 = "mittal";
        String s3 = "Jaimin";

        List list = new ArrayList();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        System.out.println("Before Sorting : " + list);

        Collections.sort(list);

        //Bubble -> Easy and good for less number of elements
        //Quick -> Good for performance, code ma agharu
        //Merge -> Best for perforance, better than quick

        System.out.println("After Sorting : " + list);


    }
}
