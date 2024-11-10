# ArrayList in Java

## Features
- **Dynamic Array**: `ArrayList` is based on a dynamic array that can grow as needed.
- **Random Access**: Provides fast access to elements with an average time complexity of O(1) for retrieving elements by index.
- **Resizable**: Automatically resizes when elements are added or removed.

## Pros
- **Fast Search**: Good performance for accessing elements.
- **Memory Efficient**: Less memory overhead compared to `LinkedList` for storing elements.
- **Better Cache Performance**: Due to contiguous memory allocation, it has better locality of reference.

## Cons
- **Slow Insertions/Deletions**: Adding or removing elements (other than at the end) is O(n) due to the need to shift elements.
- **Resizing Overhead**: Resizing the underlying array can be costly in terms of performance.

## When to Use
- Use `ArrayList` when you need to frequently access elements by index.
- Ideal for scenarios where the number of elements is known in advance and modifications (insertions and deletions) are infrequent.

## Methods
Here are some commonly used methods in the `ArrayList` class:

- **add(E e)**: Appends the specified element to the end of the list.
- **add(int index, E element)**: Inserts the specified element at the specified position in the list.
- **get(int index)**: Returns the element at the specified position in the list.
- **remove(int index)**: Removes the element at the specified position in the list.
- **set(int index, E element)**: Replaces the element at the specified position with the specified element.
- **size()**: Returns the number of elements in the list.
- **isEmpty()**: Returns true if the list contains no elements.
- **clear()**: Removes all the elements from the list.
- **contains(Object o)**: Returns true if the list contains the specified element.
- **indexOf(Object o)**: Returns the index of the first occurrence of the specified element in the list, or -1 if this list does not contain the element.
