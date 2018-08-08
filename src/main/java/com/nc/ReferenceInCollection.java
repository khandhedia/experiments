package com.nc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReferenceInCollection {

    public static void main(String[] args) {

        A a = new A();
        a.id = 1;
        a.name = "nirav";

        Map<Integer, A> map = new HashMap<>();
        map.put(1, a);

        List<A> aList = new ArrayList();
        aList.add(a);

        System.out.println(map.get(1));
        System.out.println(aList.get(0));

        a.name = "mittal";

        System.out.println(map.get(1));
        System.out.println(aList.get(0));


        if(map.get(1) == aList.get(0))
            System.out.println("Reference Same");

    }



}


class A
{
    public Integer id;

    public String name;

    @Override
    public String toString() {
        return "A{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}



