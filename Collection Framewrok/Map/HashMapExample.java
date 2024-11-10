package Map;
import java.util.Map;
import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {
        HashMap<Integer,String> obj = new HashMap<Integer,String>();

        obj.put(1, "sonnet");
        obj.put(2, "seltos");
        System.out.println(obj.containsKey(2));
        System.out.println(obj.containsValue("seltos"));


        Map<Integer,String> obj1 = new HashMap<Integer,String>();
        obj1.putAll(obj);
        System.out.println("obj1 : " + obj1);
        //clear()
        System.out.println("cloned map " +obj.clone());
        //to get the key value 
        System.out.println(obj1.keySet()); // set does't allow duplicate value 
        //get()
        System.out.println(obj1.values()); // to get the values 
        //[IMP] entrySet() [ entry : one key ,one value stored in a map is known as entry]
        System.out.println(obj1.entrySet());
        
        

    }



}
