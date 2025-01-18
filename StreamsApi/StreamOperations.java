package StreamsApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*

1. Intermediate Operations [ Return a new stream and are lazy (not executed until a terminal operation is called) ]
2. Terminal Operations [ Produce a result or side effect and terminate the stream]

 */
public class StreamOperations {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("apple","banana","cherry");
        names.stream().map(String::toUpperCase).forEach(System.out::println);
        /*
        here :
          names.stream() -> Source
          String::toUpperCase -> Intermediate Operation
          System.out::println -> Terminal Operation
         */

      //  intermediateOperations();
        terminalOperations();

    }
    public static void intermediateOperations(){
        List<String> names= Arrays.asList("buddy","claude","openAI","cap theorem");
        List<String> filternames = names.stream().filter(name->name.startsWith("c")).collect(Collectors.toList());
        System.out.println(filternames);

        // map -> read individual elements and process based on our requirement
        List<String> listNames = Arrays.asList("buddy","claude","openAI","cap theorem");
        List<String> upperCase = listNames.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(upperCase);

        // sorts() -> or we can use comparator

        List<Integer> numbers = Arrays.asList(5,4,3,2,1);
        List<Integer> sortedNumbers = numbers.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedNumbers);

        List<Integer> sortInReverse = numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortInReverse);

        // distinct() -> to remove duplicate from the stream
        List<Integer> num = Arrays.asList(3,35,56,7,45,67,54,35);
        List<Integer> ans = num.stream().distinct().collect(Collectors.toList());
        System.out.println(ans);

    }


    public static void terminalOperations(){

        // forEach()
        List<String> names = Arrays.asList("peter","MT","buddy");
        names.stream().forEach(System.out::println);

        // Collect() -> collect elements into collection like list,set

        List<Integer> numbers = Arrays.asList(1,4,5,3,4,7);
        Set<Integer> collectedNumbers = numbers.stream().collect(Collectors.toSet());
        System.out.println(collectedNumbers);

        // count()
        long count = numbers.stream().count();
        System.out.println("counts : " + count);

        // reduce() -> combines elements into a single elements

        int sum = numbers.stream().reduce(0,Integer::sum);
        System.out.println(sum);


    }

}

/*
package StreamsApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StreamOperationsWithoutStreams {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("apple", "banana", "cherry");
        for (String name : names) {
            System.out.println(name.toUpperCase());
        }

        // Calling methods to demonstrate intermediate and terminal operations without streams
        intermediateOperations();
        terminalOperations();
    }

    public static void intermediateOperations() {
        List<String> names = Arrays.asList("buddy", "claude", "openAI", "cap theorem");

        // filter() -> filter names that start with "c"
        for (String name : names) {
            if (name.startsWith("c")) {
                System.out.println(name);
            }
        }

        // map() -> convert each name to uppercase
        for (String name : names) {
            System.out.println(name.toUpperCase());
        }

        // sort() -> sort numbers in ascending order
        List<Integer> numbers = Arrays.asList(5, 4, 3, 2, 1);
        numbers.sort(Comparator.naturalOrder());
        System.out.println(numbers);

        // sort() -> sort numbers in descending order
        numbers.sort(Comparator.reverseOrder());
        System.out.println(numbers);

        // distinct() -> remove duplicates
        List<Integer> num = Arrays.asList(3, 35, 56, 7, 45, 67, 54, 35);
        Set<Integer> distinctNumbers = new HashSet<>(num);
        System.out.println(distinctNumbers);
    }

    public static void terminalOperations() {

        // forEach() -> print each name
        List<String> names = Arrays.asList("peter", "MT", "buddy");
        for (String name : names) {
            System.out.println(name);
        }

        // Collect() -> collect into a Set (no duplicates)
        List<Integer> numbers = Arrays.asList(1, 4, 5, 3, 4, 7);
        Set<Integer> collectedNumbers = new HashSet<>(numbers);
        System.out.println(collectedNumbers);

        // count() -> count the number of elements
        long count = 0;
        for (Integer number : numbers) {
            count++;
        }
        System.out.println("counts: " + count);

        // reduce() -> sum of numbers
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }
}

 */


