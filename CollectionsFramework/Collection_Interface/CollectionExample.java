package Collection_Interface;


import java.util.ArrayList;
import java.util.Collection;

public class CollectionExample {
    public static void main(String[] args) {

        Collection<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        System.out.println("Fruits: " + fruits);

        if (fruits.contains("Banana")) {
            System.out.println("Banana is in the collection.");
        }

        fruits.remove("Apple");

        System.out.println("After removing Apple: " + fruits);

        System.out.println("Looping through fruits:");
        for (String fruit : fruits) {
            System.out.println("- " + fruit);
        }

        fruits.clear();
        System.out.println("Collection cleared: " + fruits.isEmpty());
    }
}
