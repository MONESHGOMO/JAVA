package ListImplementation;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {
        
      /*
       * A threadsafe implementation in List interface
       * 
       * Introduced in 1.5 part of Collections framework
       * 
       * 
       * GPT : https://chatgpt.com/share/687a558e-0488-8007-add3-6a041e32964a
       */


      CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
      list.add("Apple");
      list.add("Banana");
      list.add("Cherry");

      for (String fruit : list) {
          System.out.println(fruit);
          if (fruit.equals("Banana")) {
              list.add("Date"); // Safe, no exception
          }
      }

      System.out.println("Final List: " + list);
    }
}