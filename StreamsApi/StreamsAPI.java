package StreamsApi;
import java.util.Arrays;
import java.util.List;
public class StreamsAPI {
    public static void main(String[] args) {

        // stream = It does not store the data , it just process
        // Memory efficiency increase
        //Lazy execution
        // internal usage of loops and cannot re useable
        // two types of  streams -> Sequential ( below code example or process data one by one) and parallel
       List<String>   names = Arrays.asList("apple","banana","cherry");
       names.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}

/*
names.stream(): Converts the list into a Stream to enable functional-style operations.
.map(String::toUpperCase): Transforms each string in the stream to uppercase using a method reference (String::toUpperCase).
.forEach(System.out::println): Iterates through each transformed string and prints it to the console.
 */

/*

 [ without streams ]
package StreamsApi;
import java.util.*;

public class StreamsAPI {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("apple", "banana", "cherry");

        // Process each name without streams
        for (String name : names) {
            String upperCaseName = name.toUpperCase(); // Convert to uppercase
            System.out.println(upperCaseName);        // Print the result
        }
    }
}
 */

/*
What is a Stream in Java?

Explain what a Stream is and how it differs from a collection.
What are the main differences between Collections and Streams in Java?

Discuss the difference in terms of storage, operations, and behavior.
What are the two types of operations available in Stream API?

Describe Intermediate and Terminal operations with examples.
What is the significance of Stream.forEach()?

How does forEach() work in Streams and what are its use cases?
What is the difference between map() and flatMap() in Java Streams?

Explain how map() transforms elements and how flatMap() differs by flattening nested structures.
What is the collect() method in Stream API?

Describe the collect() method and its common use cases (e.g., collecting results into a list, set, or map).
How can you convert a Stream to a collection (e.g., List, Set)?

What methods would you use to collect elements from a Stream?
What is the difference between distinct() and filter() in Streams?

Explain when to use distinct() to remove duplicates and filter() to select specific elements.
What is the purpose of reduce() in Java Streams?

How does reduce() work to combine elements of a Stream into a single result?
What does the anyMatch(), allMatch(), and noneMatch() methods do?

Explain how each of these methods works with predicates and give an example.
Intermediate Level Questions:
What are intermediate operations in Stream API?

List and explain the types of intermediate operations (e.g., map(), filter(), sorted(), distinct()) and their lazy nature.
What are terminal operations in Stream API?

List and explain the types of terminal operations (e.g., collect(), forEach(), reduce(), count()) and how they differ from intermediate operations.
Explain the concept of lazy evaluation in Streams.

How does lazy evaluation impact the performance and behavior of Stream operations?
How can you create a Stream from a Collection or Array in Java?

Describe how to create a Stream from a List, Set, or array using methods like stream() and Arrays.stream().
What is the difference between Stream and ParallelStream?

When would you use a parallel stream, and what are the benefits and drawbacks?
What is the Optional class in Java, and how is it related to Streams?

Explain how Optional is used in Streams to handle nullable values safely.
What is the limit() method in Streams?

How do you use limit() to restrict the number of elements in a Stream?
How can you perform sorting in Streams?

Discuss how to use sorted() to sort elements in ascending and descending order.
How does peek() work in Java Streams?

Explain how peek() is used for debugging or performing side-effects in the middle of a Stream pipeline.
Can you give an example of how Stream.iterate() and Stream.generate() work?

Describe how these methods are used to create infinite Streams with examples.
Advanced Level Questions:
Explain the difference between Stream and Stream.of().

How do you create a Stream using Stream.of() and what is its use case?
What are the performance considerations when using parallel streams?

Discuss the advantages and disadvantages of using parallelStream(). When is it appropriate to use parallel streams?
How do you handle exceptions in Streams?

Can exceptions be handled within Stream pipelines? Provide an example of handling exceptions during Stream operations.
How can you combine multiple Streams into a single Stream?

Explain how to use methods like concat() or flatMap() to merge multiple Streams.
How do you handle null values in a Stream pipeline?

Discuss strategies for handling null values, such as filtering them out or using Optional.
What is the difference between Stream.concat() and Stream.of(), and when would you use them?

Describe when to use concat() to merge Streams and Stream.of() to create a Stream from individual elements.
What is the impact of Stream's immutability?

Explain why Streams are immutable and how this benefits functional programming.
How does Collectors.groupingBy() work in Stream API?

Explain how to group elements of a Stream based on some classifier function using groupingBy().
How do you perform a flat mapping operation in Streams?

Describe how flatMap() is used to transform and flatten elements, with an example.
What is the role of Stream.reduce() and Stream.collect() in parallel Streams?

Explain how reduce() and collect() behave in parallel Streams and their role in aggregating results.
 */