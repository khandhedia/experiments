package com.nc.rnd.java8.nestednull;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class TestNestedNull {

    public static void main(String[] args) {

        A a = new A();
        if (null != a) {
            B b = a.getB();
            if (null != b) {
                C c = b.getC();
                if (null != c) {
                    D d = new D();
                    if (null != d) {
                        String str = d.getStr();
                        if (null != str) {
                            int size = str.length();
                            System.out.println("Size is " + size);
                            return;
                        }
                    }
                }
            }
        }
        System.out.println("Size is 0, as one of the elements in the hierarchy was null.");

        int length1 = Optional.ofNullable(a).map(A::getB).map(B::getC).map(C::getD).map(D::getStr).map(String::length).orElse(0);

        System.out.println(length1);

        List<String> strings = Collections.singletonList("Nirav");




    }

}
