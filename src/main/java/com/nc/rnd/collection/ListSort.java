package com.nc.rnd.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by nirk0816 on 8/22/2017.
 */
public class ListSort
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

        List<Student> listStudent = new ArrayList<>();
        listStudent.add(new Student(1, "Nirav"));
        listStudent.add(new Student(11, "Mitul"));
        listStudent.add(new Student(8, "abcd"));
        listStudent.add(new Student(12, "zebra"));
        listStudent.add(new Student(6, "chandu"));

        list.sort(Comparator.comparingInt(Integer::intValue));

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2)
            {
                return o1.intValue() - o2.intValue();
            }
        };


        listString.sort(Comparator.naturalOrder());

        listStudent.sort(Student::compareTo);
        listStudent.sort(Comparator.naturalOrder());

        list.stream().forEach(System.out::println);
        listString.stream().forEach(System.out::println);
        listStudent.stream().forEach(System.out::println);

    }


}
