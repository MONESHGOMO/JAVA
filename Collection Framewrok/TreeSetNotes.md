# TreeSet in Java

- **Definition**: `TreeSet` is a part of the `java.util` package and implements the `Set` interface, backed by a `TreeMap`.
  
- **Ordering**: Maintains a sorted order, with elements stored in ascending order by default. Custom ordering can be achieved with a `Comparator`.
  
- **No Duplicates**: Like all sets, `TreeSet` does not allow duplicate elements.
  
- **Implements NavigableSet**: Provides methods for range operations, closest matches, and more using `NavigableSet`.
  
- **Balanced Tree**: Internally uses a Red-Black tree, ensuring O(log n) time complexity for basic operations.
  
- **SortedSet Interface**: Implements `SortedSet` and allows retrieval of subsets, headsets, and tailsets.
  
- **Null Element**: `TreeSet` does not permit null elements.
  
- **Thread-Safety**: `TreeSet` is not synchronized. It needs external synchronization for thread safety.
  
- **Performance**: Typical operations like add, remove, and contains run in O(log n) time.
