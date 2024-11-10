# Map in Java

## Overview
- **Definition**: The `Map` interface in Java is part of the `java.util` package and represents a collection of key-value pairs, where each key is unique and maps to exactly one value.
- **Purpose**: It allows the storage and retrieval of data based on keys, providing a way to access values efficiently.

## Key Features
- **Key-Value Pair**: Each entry in a map consists of a key and its corresponding value. Keys must be unique, while values can be duplicated.
- **No Order Guarantee**: The order of the elements in a `Map` is not guaranteed, except for specific implementations like `LinkedHashMap` (which maintains insertion order) and `TreeMap` (which sorts by keys).
- **Null Keys and Values**: Depending on the implementation, `Map` can allow null keys and values. For example, `HashMap` allows one null key and multiple null values, while `TreeMap` does not allow null keys.

## Common Implementations
1. **HashMap**: 
   - Stores data in a hash table.
   - Provides O(1) average time complexity for basic operations like get and put.
   - Does not maintain any order.
   ```java
   import java.util.HashMap;
   import java.util.Map;

   public class HashMapExample {
       public static void main(String[] args) {
           Map<Integer, String> hashMap = new HashMap<>();

           // Adding key-value pairs
           hashMap.put(1, "One");
           hashMap.put(2, "Two");
           hashMap.put(3, "Three");
           hashMap.put(4, "Four");
           hashMap.put(5, "Five");
           hashMap.put(6, "Six");
           hashMap.put(7, "Seven");
           hashMap.put(8, "Eight");
           hashMap.put(9, "Nine");
           hashMap.put(10, "Ten");

           // Accessing a value
           System.out.println("Value for key 2: " + hashMap.get(2)); // Output: Two

           // Checking if a key exists
           System.out.println("Contains key 3: " + hashMap.containsKey(3)); // Output: true

           // Removing a key-value pair
           hashMap.remove(1);

           // Displaying the contents of the map
           System.out.println("Map contents: " + hashMap); // Output: {2=Two, 3=Three, 4=Four, ...}
       }
   }
