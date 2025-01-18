### Streams API 

- Source to learn : [Tamil Content](https://www.youtube.com/watch?v=2yceSCdy5jI&t=195s)

- Basic Questions:

1. **What is the Stream API in Java?**
   - Can you explain the Stream API and how it is different from collections in Java?

2. **What are the main advantages of using the Stream API in Java?**
   - How does using Streams improve the code readability and performance in Java?

3. **What is the difference between `Collection` and `Stream` in Java?**
   - How does a Stream differ from a Collection, and when would you prefer to use one over the other?

4. **What are the two main types of operations in Stream API?**
   - Can you explain the difference between **intermediate** and **terminal** operations?

5. **How do you create a Stream from a collection in Java?**
   - Give an example of how to create a Stream from a `List` or `Set`.

6. **Explain the concept of lazy evaluation in Streams.**
   - What does lazy evaluation mean in the context of Streams, and how does it impact performance?

7. **What is the use of the `forEach()` method in Streams?**
   - Explain how to use the `forEach()` method to print elements of a Stream.

8. **What is the difference between `map()` and `flatMap()` in Streams?**
   - When would you use `map()` and `flatMap()`? Provide examples.

9. **How do you filter elements in a Stream?**
   - How would you filter a list of names to only include names starting with the letter "A"?

10. **What does the `collect()` method do in Streams?**
    - Can you explain how `collect()` is used to accumulate elements into a collection like a List or Set?

***

- Intermediate Questions:

1. **What is the difference between `distinct()` and `filter()` in Streams?**
   - How do you remove duplicates from a Stream using `distinct()`?

2. **How can you sort a Stream in Java?**
   - Can you show an example of sorting elements in a Stream in ascending and descending order?

3. **What does the `reduce()` method do in Streams?**
   - Explain how `reduce()` works to combine elements into a single result (e.g., sum, multiplication).

4. **How do you handle `null` values in a Stream?**
   - How would you filter out `null` values or handle them within a Stream pipeline?

5. **What is the difference between `anyMatch()`, `allMatch()`, and `noneMatch()` in Streams?**
   - Explain the purpose of each method and provide examples.

***

- Advanced Questions:

1. **What is a Parallel Stream in Java?**
   - Explain how parallel streams work and when they should be used. What are the benefits and limitations of using parallel streams?

2. **How do you combine multiple Streams into a single Stream?**
   - Describe how to use methods like `concat()` or `flatMap()` to merge multiple Streams.

3. **What is the `Optional` class, and how does it work with Streams?**
   - Explain how `Optional` is used to avoid `NullPointerExceptions` and how it can be handled in Stream pipelines.

4. **How does the `groupingBy()` method work in Streams?**
   - Describe how `groupingBy()` is used to group elements based on a classifier function.

5. **What are some common mistakes developers make when using Streams?**
   - Discuss pitfalls like improper use of parallel streams, incorrect handling of side effects, or misuse of lazy evaluation.

6. **How do you use `Stream.iterate()` and `Stream.generate()`?**
   - Provide examples of how these methods can be used to generate sequences of data.

7. **How can you handle exceptions in Streams?**
   - Discuss strategies for dealing with exceptions inside Stream pipelines.

8. **What is the `peek()` method used for in Streams?**
   - Explain how `peek()` is used for debugging or side-effect operations within a Stream.

9. **How can you use the `limit()` method in Streams?**
   - Provide an example of how to restrict the number of elements processed by a Stream.

10. **How would you check if all elements of a Stream are greater than 5?**
    - What methods would you use to perform such a check (e.g., `allMatch()`)?

***
