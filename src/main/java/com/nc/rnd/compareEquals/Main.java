package com.nc.rnd.compareEquals;

import com.nc.rnd.collection.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by nirk0816 on 8/22/2017.
 */
public class Main
{
    public static void main(String[] args)
    {
        List<Student> listStudent = new ArrayList<>();
        listStudent.add(new Student(1, "nirav"));
        listStudent.add(new Student(11, "mitul"));
        listStudent.add(new Student(8, "abcd"));
        listStudent.add(new Student(12, "zebra"));
        listStudent.add(new Student(6, "chandu"));

        Collections.sort(listStudent, new StudentNameComparator());

        listStudent.stream().forEach(System.out::println);
    }
}
