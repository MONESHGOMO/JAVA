| Feature                         | Array                                      | Collection Framework                           |
|---------------------------------|--------------------------------------------|------------------------------------------------|
| **Data Type**                   | Fixed type (e.g., int[], String[])         | Classes can hold various object types using generics |
| **Size**                        | Fixed size once created                    | Dynamic size, grows or shrinks as needed       |
| **Data Storage**                | Stores homogeneous or primitive data types | Stores only objects                            |
| **Memory Allocation**           | Allocated at compile-time                  | Allocated at runtime (for dynamic collections) |
| **Performance**                 | Faster access time                         | Slightly slower due to dynamic resizing, if any|
| **Operations (Sorting, etc.)**  | No built-in support, manual implementation | Utility methods like sort(), search() provided |
| **Type Safety**                 | Type-safe for primitives                   | Type safety provided through generics          |
| **Iterator Support**            | Does not support iterators                 | Supports iterator and for-each loop           |
| **Modification of Structure**   | Difficult to insert/remove elements        | Easy to add, remove, or manipulate elements    |
| **Example**                     | `int[] arr = new int[5];`                  | `List<Integer> list = new ArrayList<>();`     |
