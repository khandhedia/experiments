package com.nc.rnd.java8;


import java.util.stream.IntStream;

/**
 * IntStream rangeClosed() in Java
 *
 * IntStream rangeClosed(int startInclusive, int endInclusive) returns an IntStream
 * from startInclusive (inclusive) to endInclusive (inclusive) by an incremental step of 1.
 *
 * Syntax :

 static IntStream rangeClosed(int startInclusive,   int endInclusive)
 Parameters :

 IntStream : A sequence of primitive int-valued elements.
 startInclusive : The inclusive initial value.
 endInclusive : The inclusive upper bound.
 Return Value : A sequential IntStream for the range of int elements.

 */

public class IntStreamRangeClosed {

    public static void main(String[] args) {
        // Creating an IntStream
        IntStream stream = IntStream.rangeClosed(-4, 3);

        // Displaying the elements in range
        // including the lower and upper bound
        stream.forEach(System.out::println);
    }

}

/**
 *
 Output:
 -4
 -3
 -2
 -1
 0
 1
 2
 3
 */
