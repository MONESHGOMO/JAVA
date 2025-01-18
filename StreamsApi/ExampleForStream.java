package StreamsApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleForStream {
    public static void main(String[] args) {

        List<String> months= new ArrayList<>();
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("August");


        System.out.println(findWordsStartsWith_A(months));
        System.out.println(findWordsStartsWith_AUsingStreams(months));
    }

    public static String findWordsStartsWith_A(List<String> givenData) {
        for (String findData : givenData) {
            if (findData.startsWith("A")) {
                return findData;
            }
        }
        return " name not found";
    }

    public static String findWordsStartsWith_AUsingStreams(List<String> givenData) {

        String answer = givenData.stream().filter(given -> given.startsWith("A")).collect(Collectors.joining(","));

        return answer;
    }
}
/*
Simplicity:

Easy to understand for those new to Java or functional programming.
Familiar to developers used to traditional loops.
Low Overhead:

No dependency on additional libraries or APIs.
Disadvantages
Limited Functionality:

Stops after finding the first match, even if there are multiple matches.
Cannot easily handle operations like collecting all matches or transforming data.
Verbosity:

Requires explicit iteration and conditional logic, making the code less concise.
Not Flexible:

Modifying the logic (e.g., returning all matches) would require significant code changes.

 */

/*
Advantages
Conciseness:

The logic is implemented in a single, readable line.
Reduces boilerplate code compared to traditional loops.
Flexibility:

Easily extendable for more complex operations (e.g., sorting, mapping, counting).
Can handle multiple matches without additional logic.
Functional Programming Style:

Promotes immutability and a declarative programming approach.
Parallel Processing:

Streams can easily be converted to parallel streams (givenData.parallelStream()) for performance improvement on large datasets.
Disadvantages
Learning Curve:

May be harder to understand for developers unfamiliar with functional programming or the Stream API.
Overhead for Small Tasks:

For small datasets or simple operations, the performance benefits of Streams may not be noticeable.
Debugging:

Debugging functional-style code can sometimes be more challenging than traditional loops.
 */

/*
package StreamsApi;

import java.util.ArrayList;
import java.util.List;

public class ExampleWithoutStreams {
    public static void main(String[] args) {

        List<String> months = new ArrayList<>();
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("August");

        System.out.println(findWordsStartsWith_A(months));
        System.out.println(findWordsStartsWith_AWithoutStreams(months));
    }

    // Traditional approach using loop
    public static String findWordsStartsWith_A(List<String> givenData) {
        for (String findData : givenData) {
            if (findData.startsWith("A")) {
                return findData;
            }
        }
        return "name not found";
    }

    // Alternative approach without streams (collecting all words starting with 'A')
    public static String findWordsStartsWith_AWithoutStreams(List<String> givenData) {
        StringBuilder result = new StringBuilder();
        for (String findData : givenData) {
            if (findData.startsWith("A")) {
                if (result.length() > 0) {
                    result.append(",");
                }
                result.append(findData);
            }
        }
        return result.length() > 0 ? result.toString() : "name not found";
    }
}

 */