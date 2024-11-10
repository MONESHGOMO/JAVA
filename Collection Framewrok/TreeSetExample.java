import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> obj = new TreeSet<Integer>();

    //in the old version of java(1.6 v) ,we can able to add null element when treeset is empty 
    // but null is not allowed (why ?)   we cannot compare the null element to the existing values 

        obj.add(10);
        obj.add(20);
        obj.add(5);
        obj.add(15);
        obj.add(25);
        obj.add(30);
        obj.add(3);
        obj.add(8);
        obj.add(12);
        obj.add(22);

        obj.add(10);
            

        System.out.println(obj);
        //headset(),tailset() [imp] for interview

        System.out.println("HeadSet (elements < 15): " + obj.headSet(15));
        System.out.println("TailSet (elements >= 15): " + obj.tailSet(15));
        //subset()
        System.out.println( obj.subSet(3, 25));
        //comparator
        System.out.println(obj.comparator()); // [imp] when we dont declare to the treeset sort in this order ,at the time comparator returns null
        // higher(),lower()
        System.out.println(obj.higher(8));
        //poll(),pollLast() retrive the data and delete the data  

        // normal iterator

        Iterator <Integer> i=obj.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

        // descendingIterator()
       //   [imp] we cannot able to  use StringBuffer  in generics (why? ) it does't implements comparable interface


    }
}
