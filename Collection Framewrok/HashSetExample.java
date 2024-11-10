/*     

                     [  SET (I)   ]
 *   SET(I) is one of the child interface of Collection(I)
 *   Duplicates values are not allowed
 *   Insertion order is not maintained
 *   Allow hetrogeneous data when generics are not defined 
 * 
 *  
 * 
 * ABOUT HASHSET:
 * 
 * 1.HashTable (I) is implemention class for SET(I)
 * 2.Duplicates values are not allowed
 * 3.Insertion order is not maintained
 * 4.Null elements are allowed 
 * 5.Implements Serialization and Cloneable Interface
 * 6.Default Capacity : 16
 * 7.HashCode methos (for search is very  effective ) [imp]
 * 8.Allow hetrogeneous data when generics are not defined
 * 9.load ratio : 75%
 * 10.Underlying DS in HashTable 
 * 
    HashSet<Type> hashSet = new HashSet<>(initialCapacity, loadFactor);16,0.75
    HashSet<Type> hashSet = new HashSet<>(initialCapacity); we can able to set the initial size 
    Collection<Type> collection = new ArrayList<>(); // or any other collection
    HashSet<Type> hashSet = new HashSet<>(collection);
 */

 import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Apple");
        System.out.println("After adding Apple: " + hashSet);

        hashSet.add("Banana");
        System.out.println("After adding Banana: " + hashSet);

        hashSet.add("Cherry");
        System.out.println("After adding Cherry: " + hashSet);

        hashSet.add("Apple");
        System.out.println("After trying to add duplicate Apple: " + hashSet);

        System.out.println("Size of HashSet: " + hashSet.size());

        hashSet.remove("Banana");
        System.out.println("After removing Banana: " + hashSet);

        System.out.println("Does HashSet contain Cherry? " + hashSet.contains("Cherry"));

        System.out.println("Iterating through HashSet using Iterator:");
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        hashSet.clear();
        System.out.println("After clearing the HashSet: " + hashSet);

        System.out.println("Is HashSet empty? " + hashSet.isEmpty());
    }
}

