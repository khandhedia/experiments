package com.nc.rnd.java8;

/*
*
*
IntStream findFirst() in Java
IntStream findFirst() returns an OptionalInt (a container object which may or may not contain a non-null value)
describing the first element of this stream,

or an empty OptionalInt if the stream is empty

Syntax :

OptionalInt findFirst()

Where, OptionalInt is a container object which
may or may not contain a non-null value
and the function returns an OptionalInt describing the
first element of this stream, or an empty OptionalInt
if the stream is empty.

Note : findAny() is a terminal-short-circuiting operation of Stream interface.
This method returns any first element satisfying the intermediate operations.

*
* */

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.function.IntBinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntStreamFindFirst {

    public static void main(String[] args) {
        findFirstElementRegularStream();
        findFirstElementParallelStream();
        terminationFunctionSum();
        terminalFunctionCount();

        reduceToIdentifyDuplicateRecords();


    }

    private static void terminalFunctionCount() {
        System.out.println(IntStream.rangeClosed(1, 10).count());
        List<String> stringList = Arrays.asList("1", "2", "3", "4", "5");
        System.out.println(stringList.stream().collect(Collectors.counting()));
        System.out.println(stringList.stream().count());
    }

    private static void terminationFunctionSum() {
        System.out.println(IntStream.rangeClosed(1, 10).sum());
    }

    private static void reduceToIdentifyDuplicateRecords() {
        IntStream stream = IntStream.of(4, 5, 8, 10, 12, 16, 24, 12, 10);
        stream = stream.filter(value -> value % 12 == 0);
        OptionalInt duplicate_records = stream.reduce((left, right) -> {
            throw new RuntimeException("Duplicated Records");
            /*if(left == right) {
                try {
                    throw new Exception("Duplicate records");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return left;*/
        });

        System.out.println(duplicate_records.getAsInt());
    }

    private static void findFirstElementParallelStream() {
        // Creating an IntStream
        IntStream stream = IntStream.of(4, 5, 8, 10, 12, 16)
                .parallel();

        // Using IntStream findFirst().
        // Executing the source code multiple times
        // must return the same result.
        // Every time you will get the same
        // Integer which is divisible by 4.
        stream = stream.filter(num -> num % 4 == 0);

        OptionalInt answer = stream.findFirst();
        if (answer.isPresent())
            System.out.println(answer.getAsInt());
    }

    private static void findFirstElementRegularStream() {
        // Creating an IntStream
        IntStream stream = IntStream.of(6, 7, 8, 9);

        // Using IntStream findFirst() to return
        // an OptionalInt describing first element
        // of the stream
        OptionalInt answer = stream.findFirst();

        // if the stream is empty, an empty
        // OptionalInt is returned.
        if (answer.isPresent())
            System.out.println(answer.getAsInt());
        else
            System.out.println("no value");
    }
}
