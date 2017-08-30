package com.nc.rnd.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by nirk0816 on 8/22/2017.
 */
public class ListReplace
{

    public static void main(String[] args)
    {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(2);
        list.add(33);
        list.add(4);
        list.add(5);

        List<String> listString = new ArrayList<>();
        listString.add("nirav");
        listString.add("mitulnirav");
        listString.add("abcd");
        listString.add("chandu");
        listString.add("zebra");

        //Arrays.asList(1, 2, 3, 4, 5) returns UnmodifiableList as the values in the list is stored in the array on back-end. And you cannot add/remove elements from array,
        //it will throw UnsupportedOperationException when using iterator.remove()


        //Approach 1

/*
        ListIterator<Integer> lit = list.listIterator();
        while (lit.hasNext())
        {
            Integer next = lit.next();
            if(next == 3)
            {
                lit.set(30);
            }
        }
*/


        //Approach 2

/*
        ListIterator<Integer> lit = list.listIterator();
        while (lit.hasNext())
        {
            Integer next = lit.next();
            if(next == 3)
            {
                lit.remove();
                lit.add(30);
            }
        }
*/

        //Approach 3

        //list.set(list.indexOf(3), 10);





        list.stream().forEach(System.out::println);

        listString.stream().forEach(System.out::println);

    }




}
