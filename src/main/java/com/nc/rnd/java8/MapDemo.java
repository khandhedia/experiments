package com.nc.rnd.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MapDemo {

    public static void main(String[] args) {

        StringToIntegerMap();

    }

    private static void StringToIntegerMap() {
        List<String> stringList = Arrays.asList("1", "2", "3", "4");
        System.out.println("Max is : "  +
                stringList
                        .stream()
                        //Here peek suggests that values are string, and hence "1" will be appended to string literals
                        .peek(string -> System.out.println("String peek: " + (string + 1)))
                        //Here map suggests that it will change the content type of the stream from String to integer
                        .map(Integer::parseInt)
                        //Here peek suggests that now the content is integer, and hence it will print the int value added by 1
                        .peek(integer -> System.out.println("integer Peek: " + (integer + 1)))
                        //Here max is a terminal function that returns max value based on natural order sorting of integer
                        .max(Comparator.naturalOrder())
                        .orElse(0));


/*
        String peek: 11
        integer Peek: 2
        String peek: 21
        integer Peek: 3
        String peek: 31
        integer Peek: 4
        String peek: 41
        integer Peek: 5
        Max is : 4
*/
    }

}
