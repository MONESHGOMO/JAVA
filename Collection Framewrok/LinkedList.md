# LinkedList in Java

## Features
- **Doubly Linked List**: `LinkedList` is implemented as a doubly linked list, where each element (node) contains a reference to the next and previous node.
- **Dynamic Size**: Grows and shrinks as elements are added or removed without the need for resizing.

## Pros
- **Fast Insertions/Deletions**: O(1) time complexity for adding or removing elements at both ends and O(n) for elements in the middle (due to traversal).
- **No Resizing Needed**: Does not require resizing, so there is no overhead for resizing operations.

## Cons
- **Slow Access**: O(n) time complexity for accessing elements by index due to traversal.
- **Higher Memory Overhead**: Each node has extra memory overhead for storing references to the next and previous nodes.

## When to Use
- Use `LinkedList` when you expect a lot of insertions and deletions from the list.
- Suitable for scenarios where you frequently add or remove elements from both ends of the list.

## Methods
Here are some commonly used methods in the `LinkedList` class:

- **add(E e)**: Appends the specified element to the end of the list.
- **addFirst(E e)**: Inserts the specified element at the beginning of the list.
- **addLast(E e)**: Appends the specified element to the end of the list.
- **removeFirst()**: Removes and returns the first element from the list.
- **removeLast()**: Removes and returns the last element from the list.
- **get(int index)**: Returns the element at the specified position in the list.
- **size()**: Returns the number of elements in the list.
- **isEmpty()**: Returns true if the list contains no elements.
- **clear()**: Removes all the elements from the list.
- **contains(Object o)**: Returns true if the list contains the specified element.
- **indexOf(Object o)**: Returns the index of the first occurrence of the specified element in the list, or -1 if this list does not contain the element.
