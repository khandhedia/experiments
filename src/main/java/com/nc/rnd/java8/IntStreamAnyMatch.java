package com.nc.rnd.java8;

import java.util.stream.IntStream;

/**
 * IntStream anyMatch() in Java with examples
 IntStream anyMatch(IntPredicate predicate) returns whether any elements of this stream match the provided predicate.
 It may not evaluate the predicate on all elements if not necessary for determining the result.
 This is a short-circuiting terminal operation.
 A terminal operation is short-circuiting if, when presented with infinite input, it may terminate in finite time.

 Syntax :

 boolean anyMatch(IntPredicate predicate)

 Where, IntPredicate represents a predicate (boolean-valued function)
 of one int-valued argument and the function returns true if any
 elements of the stream match the provided predicate,
 otherwise false.

 Note : If the stream is empty then false is returned and the predicate is not evaluated.

 */

public class IntStreamAnyMatch {

    public static void main(String[] args) {
        checkElementSatisfyConditionReturnTrue();
        checkElementSatisfyConditionReturnFalse();
        anyMatchOnEmptyStremReturnFalse();


    }

    private static void anyMatchOnEmptyStremReturnFalse() {
        // Creating an empty IntStream
        IntStream stream = IntStream.empty();

        boolean answer = stream.anyMatch(num -> true);

        // Displaying the result
        System.out.println(answer);
    }

    private static void checkElementSatisfyConditionReturnFalse() {
        // Creating an IntStream
        IntStream stream = IntStream.of(10, 20, 30, 40, 50);

        // Stream anyMatch(Predicate predicate)
        boolean answer = stream.anyMatch(num -> Math.sqrt(num) > 8);

        // Displaying the result
        System.out.println(answer);
    }

    private static void checkElementSatisfyConditionReturnTrue() {
        // Creating an IntStream
        IntStream stream = IntStream.of(1, 2, 3, 4, 5, 6);

        // Stream anyMatch(Predicate predicate)
        boolean answer = stream.anyMatch(num -> (num - 5) > 0);

        // Displaying the result
        System.out.println(answer);
    }
}
