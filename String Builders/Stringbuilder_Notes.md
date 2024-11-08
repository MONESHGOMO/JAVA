# Differences between `String` and `StringBuilder` in Java

## 1. Mutability
- **String**: Immutable; once created, its content cannot be changed. Any modification (like concatenation) creates a new `String` object.
- **StringBuilder**: Mutable; modifications happen in place, making it efficient for multiple changes without creating new objects.

## 2. Performance
- **String**: Slower for concatenations, especially in loops, because each modification creates a new object, leading to more memory allocation and garbage collection.
- **StringBuilder**: Faster for repeated modifications since it doesn’t create new objects; it modifies the existing buffer instead, making it ideal for string manipulation within loops.

## 3. Thread Safety
- **String**: Thread-safe due to immutability, meaning it's safe to use across multiple threads without synchronization.
- **StringBuilder**: Not thread-safe. For thread-safe mutable strings, `StringBuffer` (a synchronized version of `StringBuilder`) should be used.

## 4. Memory Usage
- **String**: Uses more memory when modified repeatedly because each change creates a new `String` object in memory.
- **StringBuilder**: More memory-efficient for modifications, as it grows the existing buffer instead of creating new instances.

## 5. Use Cases
- **String**: Best for fixed values, small modifications, or data that won’t change, like constants or keys in collections.
- **StringBuilder**: Ideal for scenarios involving frequent modifications, such as building long texts, generating logs, or constructing dynamic SQL queries.

## 6. Method Support
- **String**: Rich in utility methods (e.g., `substring()`, `charAt()`, `equals()`, `compareTo()`), which makes it versatile for string operations.
- **StringBuilder**: Provides methods focused on modification (e.g., `append()`, `insert()`, `delete()`, `reverse()`), which are not available in `String`.

---

## Summary:
- Use **`String`** when the value is constant or requires minimal modification.
- Use **`StringBuilder`** for efficient, mutable string manipulation in single-threaded contexts.
