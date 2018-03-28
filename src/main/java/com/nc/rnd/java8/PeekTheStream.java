package com.nc.rnd.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 *
 The Stream.peek() method’s objective is literally to peek at the contents of the Stream.
 I.e. it has been put as a part of Streams API to provide a method for debugging the Stream elements as they flow from one pipelined operation to another.
 The stream.peek() method applies the Consumer<T> function’s logic, which is its only input, to each element of the Stream.
 The Consumer logic can be implemented as per the specific debugging requirements requirements to debug/log/print the elements as they stream through the peek() method.

 But then, one might ask the question, how is Stream.peek() method different from any other method of the Stream API which can consume the values in the Stream?
 The answer is that this is the only method which allows you to consume(print/log/whatever way you want to check the contents) the elements of a Stream as an intermediate operation.
 In addition, Stream.peek() also provides the guarantee of non-interference.

 Let us now look at what we mean by peek() method having these two advantages.

 Stream.peek() as a non-interfering intermediate operation
 Stream.peek() is an intermediate operation, i.e. it does not end the processing of the stream.
 Other methods which allow using a Consumer instance to act on the elements of a stream, such as the forEach() method, or the collect() method among others,
 are all terminal operations.
 I.e. once you see the contents, by printing or logging them, your stream’s processing ends.

 Stream.peek() thus provides you the unique capability to consume a stream without ending the pipeline of operations when acting on the stream contents, by virtue of it being an intermediate operation.

 In addition, Stream.peek() is a non-interfering Stream operation.
 Non-interfering methods are those which guarantee that they will not modify the Stream’s data source during their execution.
 Non-interfering nature is required in multi-threaded environments where stream operations can be executed in parallel or concurrently.
 Concurrent execution makes it necessary to keep the stream’s data source unmodified until the terminal operation.
 *
 */

public class PeekTheStream {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        //IntStream.rangeClosed(1, 10).forEach(value -> stringList.add("" + value));
        stringList.add("Nirav");
        stringList.add("Mittal");
        stringList.add("Khandhedia");
        stringList.stream().forEach(System.out::println);//Here, after doing forEach stream has ended.. I cannot do anything further..
        stringList.stream()
                .filter(s -> s.length() < 7)
                .peek(s -> System.out.println("Filtered Output: " + s))
                .filter(s -> s.length() < 6)
                .peek(s -> System.out.println("Second Filtered Output: " + s))
                .count();
    }
}
