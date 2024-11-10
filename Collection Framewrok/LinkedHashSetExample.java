/*
    1.Duplicates: Does not allow duplicate elements.
    2.Null Elements: Allows one null element.

    3.Performance: Offers constant time complexity for basic operations like add, remove, and contains, similar to HashSet, but with slightly slower performance due to maintaining order.
    4.Underlying Structure: Internally uses a hash table and a linked list to maintain the order of elements.
    Features
    6.Iterators: Provides an ordered iterator, which allows traversing elements in the order they were inserted.
    7.Serialization: Implements the Serializable interface, allowing instances to be serialized.
    8.No Thread Safety: Not synchronized; thus, not thread-safe. If multiple threads modify a LinkedHashSet concurrently, it must be externally synchronized.
 */
import java.util.LinkedHashSet;
import java.util.Iterator;
// insertion order maintain [imp]
public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("Apple");
        System.out.println("After adding Apple: " + linkedHashSet);

        linkedHashSet.add("Banana");
        System.out.println("After adding Banana: " + linkedHashSet);

        linkedHashSet.add("Cherry");
        System.out.println("After adding Cherry: " + linkedHashSet);

        linkedHashSet.add("Apple"); // Trying to add duplicate
        System.out.println("After trying to add duplicate Apple: " + linkedHashSet);

        System.out.println("Size of LinkedHashSet: " + linkedHashSet.size());

        linkedHashSet.remove("Banana");
        System.out.println("After removing Banana: " + linkedHashSet);

        System.out.println("Does LinkedHashSet contain Cherry? " + linkedHashSet.contains("Cherry"));

        System.out.println("Iterating through LinkedHashSet using Iterator:");
        Iterator<String> iterator = linkedHashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        linkedHashSet.clear();
        System.out.println("After clearing the LinkedHashSet: " + linkedHashSet);

        System.out.println("Is LinkedHashSet empty? " + linkedHashSet.isEmpty());
    }
}
