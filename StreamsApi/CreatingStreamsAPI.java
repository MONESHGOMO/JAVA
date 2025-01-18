package StreamsApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreatingStreamsAPI {
    public static void main(String[] args) {

        //  creating stream from collections(List,Set,map) -> using method()

        List<String> names =Arrays.asList("Adam","Eve","Monesh");
        Stream<String> nameStream = names.stream();
        nameStream.forEach(System.out::println);
 //     names.stream().forEach(System.out::println);


        // create stream using array

        int [] number = {324,34,32,54,34,56};

        IntStream numStream = Arrays.stream(number);
        numStream.forEach(System.out::println);

        //using Stream.of() -> for create stream for individual elements

        Stream<String> fruit = Stream.of("Apple","Mango","Avacado");
        fruit.forEach(System.out::println);


        // Generating Streams()
        // Stream.generate() -> to create infinite stream of values

        Stream<String>  helloStream = Stream.generate(()-> "Hello stream ").limit(7);
        helloStream.forEach(System.out::println);


        // Stream.iterate()
        // example : generate numbers starting from 5

        Stream<Integer> numbers = Stream.iterate(5,n->n+1).limit(10);
        numbers.forEach(System.out::println);


    }
}
/*
package StreamsApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreatingWithoutStreams {
    public static void main(String[] args) {

        // Creating from collections (List)
        List<String> names = Arrays.asList("Adam", "Eve", "Monesh");
        for (String name : names) {
            System.out.println(name);
        }

        // Create from array
        int[] number = {324, 34, 32, 54, 34, 56};
        for (int num : number) {
            System.out.println(num);
        }

        // Using individual elements (manual collection)
        String[] fruits = {"Apple", "Mango", "Avocado"};
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Generating repetitive values (equivalent to Stream.generate())
        for (int i = 0; i < 7; i++) {
            System.out.println("Hello stream");
        }

        // Iterating with logic (equivalent to Stream.iterate())
        int start = 5;
        for (int i = 0; i < 10; i++) {
            System.out.println(start + i);
        }
    }
}

 */