![image](https://github.com/user-attachments/assets/c2a83fc8-804b-4258-8fc3-0d659f81adfe)




# Java Collection Framework - Characteristics and Functions

| **Collection Type**       | **Characteristics**                                                | **Functions**                                                                 |
|---------------------------|--------------------------------------------------------------------|-------------------------------------------------------------------------------|
| **List**                   | - Ordered collection (elements have a specific order)             | - `add()`, `remove()`, `get()`, `set()`<br>- `indexOf()`, `lastIndexOf()`      |
|                           | - Allows duplicates                                                | - `contains()`, `size()`, `clear()`                                          |
|                           | - Allows null elements                                             | - `subList()`, `iterator()`                                                   |
| **Set**                    | - Unordered collection (no guarantee of element order)            | - `add()`, `remove()`, `contains()`<br>- `size()`, `clear()`                  |
|                           | - Does not allow duplicates                                        | - `iterator()`, `isEmpty()`                                                   |
|                           | - Allows null elements (depends on implementation)                 | - `retainAll()`, `removeAll()`, `addAll()`                                    |
| **Queue**                  | - Ordered collection, generally follows FIFO (First In, First Out) | - `add()`, `offer()`, `remove()`, `poll()`<br>- `peek()`, `element()`          |
|                           | - Elements are processed in order they were added                  | - `size()`, `clear()`                                                        |
|                           | - Allows null elements (depends on implementation)                 | - `iterator()`                                                               |
| **Deque**                  | - Double-ended queue, supports adding/removing from both ends      | - `addFirst()`, `addLast()`, `removeFirst()`, `removeLast()`<br>- `peekFirst()`, `peekLast()` |
|                           | - Implements both `Queue` and `Stack`                               | - `offerFirst()`, `offerLast()`                                               |
| **Map**                    | - Stores key-value pairs                                           | - `put()`, `get()`, `remove()`<br>- `containsKey()`, `containsValue()`        |
|                           | - Keys are unique, values can be duplicated                        | - `size()`, `clear()`, `keySet()`<br>- `values()`, `entrySet()`               |
|                           | - Does not allow null keys (except for `HashMap`)                   | - `putAll()`, `replace()`, `replaceAll()`                                     |
| **SortedSet**              | - A `Set` that maintains elements in a sorted order                 | - `first()`, `last()`, `headSet()`<br>- `tailSet()`, `subSet()`               |
|                           | - Does not allow duplicate elements                                 | - `comparator()`, `size()`                                                   |
| **NavigableSet**           | - Extends `SortedSet` and adds methods for navigating the set      | - `lower()`, `floor()`, `ceiling()`, `higher()`<br>- `pollFirst()`, `pollLast()`|
| **SortedMap**              | - A `Map` that maintains keys in a sorted order                     | - `firstKey()`, `lastKey()`, `headMap()`<br>- `tailMap()`, `subMap()`         |
| **NavigableMap**           | - Extends `SortedMap` with methods for navigating the map          | - `lowerKey()`, `floorKey()`, `ceilingKey()`, `higherKey()`<br>- `pollFirstEntry()`, `pollLastEntry()`|
| **ArrayList**              | - Implements `List`, backed by a dynamic array                     | - `add()`, `remove()`, `get()`, `set()`<br>- `size()`, `clear()`              |
|                           | - Allows duplicates and null elements                              | - `indexOf()`, `lastIndexOf()`, `toArray()`                                  |
| **LinkedList**             | - Implements `List` and `Deque`, backed by a doubly-linked list   | - `add()`, `remove()`, `get()`, `set()`<br>- `addFirst()`, `addLast()`        |
|                           | - Allows null elements                                             | - `poll()`, `peek()`, `iterator()`                                            |
| **HashSet**                | - Implements `Set`, backed by a hash table                        | - `add()`, `remove()`, `contains()`<br>- `size()`, `clear()`                  |
|                           | - Does not preserve insertion order                                | - `iterator()`, `isEmpty()`                                                   |
| **LinkedHashSet**          | - Implements `Set`, backed by a hash table with linked list        | - `add()`, `remove()`, `contains()`<br>- `size()`, `clear()`                  |
|                           | - Preserves insertion order                                        | - `iterator()`, `isEmpty()`                                                   |
| **TreeSet**                | - Implements `SortedSet`, backed by a Red-Black tree               | - `add()`, `remove()`, `contains()`<br>- `size()`, `clear()`                  |
|                           | - Does not allow duplicates                                        | - `first()`, `last()`, `headSet()`, `tailSet()`                               |
| **HashMap**                | - Implements `Map`, backed by a hash table                        | - `put()`, `get()`, `remove()`<br>- `containsKey()`, `containsValue()`        |
|                           | - Does not preserve insertion order                                | - `keySet()`, `values()`, `entrySet()`                                        |
| **LinkedHashMap**          | - Implements `Map`, backed by a hash table and linked list         | - `put()`, `get()`, `remove()`<br>- `containsKey()`, `containsValue()`        |
|                           | - Preserves insertion order                                        | - `keySet()`, `values()`, `entrySet()`                                        |
| **TreeMap**                | - Implements `SortedMap`, backed by a Red-Black tree               | - `put()`, `get()`, `remove()`<br>- `containsKey()`, `containsValue()`        |
|                           | - Sorted by keys (natural order or comparator)                     | - `firstKey()`, `lastKey()`, `headMap()`, `tailMap()`                         |
