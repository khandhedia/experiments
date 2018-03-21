package com.nc.rnd.java8;

/*

Stream noneMatch(Predicate predicate) returns whether no elements of this stream match the provided predicate.
It may not evaluate the predicate on all elements if not necessary for determining the result.
This is a short-circuiting terminal operation.
A terminal operation is short-circuiting if, when presented with infinite input, it may terminate in finite time.
Syntax :

boolean noneMatch(Predicate<? super T> predicate)

Where, T is the type of the input to the predicate
and the function returns true if either no elements
of the stream match the provided predicate or the
stream is empty, otherwise false.

Note : If the stream is empty then true is returned and the predicate is not evaluated.
* */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class NoneMatchDemo {

    public static void main(String[] args) {
        checkNoStringHasLengthEqaulTo4();
        checkNoNegativeNumberPresent();
        complexMatch();


    }

    private static void complexMatch() {
        // Creating a Stream of Strings
        Stream<String> stream = Stream.of("Geeks", "fOr",
                "GEEKSQUIZ", "GeeksforGeeks", "CSe");

        // Using Stream noneMatch(Predicate predicate)
        boolean answer = stream.noneMatch
                (str -> Character.isUpperCase(str.charAt(1))
                        && Character.isLowerCase(str.charAt(2))
                        && str.charAt(0) == 'f');

        // Displaying the result
        System.out.println(answer);
    }

    private static void checkNoNegativeNumberPresent() {
        // Creating a list of Integers
        List<Integer> list = Arrays.asList(4, 0, 6, 2);

        // Using Stream noneMatch(Predicate predicate)
        boolean answer = list.stream().noneMatch(num -> num < 0);

        // Displaying the result
        System.out.println(answer);
    }

    private static void checkNoStringHasLengthEqaulTo4() {
        // Creating a Stream of Strings
        Stream<String> stream = Stream.of("CSE", "C++",
                "Jav", "DS");

        // Using Stream noneMatch(Predicate predicate)
        boolean answer = stream.noneMatch(str -> str.length() == 4);

        // Displaying the result
        System.out.println(answer);
    }
}
