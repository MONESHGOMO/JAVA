package GOMO_JAVA_CODES;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
public class ArrayList_Learn_Automation {
  /*                                      [  ABOUT  ARRAYLIST   ] time and space complexity is [ O(1) ]
   *1),array list is a class of list and list is a interface (what is interface ?), insertion order
   * maintain and duplicate elements allowed,re-size-able or grow-able array 
   * default capacity = 10,fill ratio or load factor= 1 or 100%
   * growth rate=current size+current size/2
   * we can use hetro-geneous object ,ex: if we did not mention the generics ,we can able to add different type of data types
   * but it is not preferred for used ..
   * [imp] best suitable for(( search operations )) and worst for insertion and deletion operations
   * [important] interface = they are similar to class ,that can contains only constant,default methods,nested types,static(),method signature
   * [important]= random access is used to perform search operation effectively
   * [important]=clone able
   * [important]= serialization ( transfer of raw data )  example: converting the raw data into a file that can be transfer 
   * to all ,small outlook 
   *2)we can able to insert null operation in array list
   *
   *3)list iterator(interface) we can't able to create object ,by using list iterator we can able to print in both 
   *forward and reverse or next and previous , and this is only possible in list iterator only
   *
   *4) In iterator forward traversing is only possible 
   *
   * 5)it should not be used in multi threading (why because array list is not thread safe )
   * 
   *
   */


	public static void main(String[] args) {

	List<String> obj=new <String> ArrayList();
	
	obj.add("bmw");
	obj.add("kia");
	obj.add("hyundai");
	obj.add("tata");
	obj.add("hyundai");
	
	System.out.println(obj);
	System.out.println(obj.get(0));
	System.out.println(obj.indexOf( "hyundai"));
	System.out.println(obj.lastIndexOf("hyundai"));
	
	List <String>obj2=new <String>ArrayList();
    obj2.addAll(obj);
    System.out.println(obj2);
   // obj2.clear();
   // System.out.println(obj2);
    obj2.remove("bmw");
    
    System.out.println(obj2);
    obj2.set(1,"benz");
    System.out.println(obj2);
   // obj2.isEmpty() >>>> if list is empty return true
    System.out.println("............................................................................");

    for(String car: obj2) {
    	System.out.println("using enhanced for loop : " + car);
    }
    System.out.println("............................................................................");

  for(int i=0;i<=obj2.size()-1;i++) {
	   System.out.println("using for loop :  " + obj2.get(i));
  }
  System.out.println("............................................................................");
  // list iterator 
	ListIterator<String> obj3= obj2.listIterator();
	    while(obj3.hasNext()) { // hasNext used to print the iterator value to the end that iterator contains the value || forward traversing 
	     System.out.println(obj3.next());
	    }
	    System.out.println(" ..........reverse traversing  ............................................................................");
   
	while(obj3.hasPrevious()) {
		System.out.println(obj3.previous());
	}
	
	}

}
