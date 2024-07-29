// class is a logical construct
//object is a reality (stored in heap memory),variables are in stack memory
/*				
 * 1) state of the object  (value from its data type)
 * 2)identity of the object (two reference variable pointing towards a single object)
 * 3)behavior of the object (effect of changing the data type) ?
 * 4) to access the instance variable by using (dot operator)
 * 5)  constructor in java is a special method that is used to initialize a object
 * 6) constructor defines what happen when the object is created 
 */
package GOMO_JAVA_CODES;

public class OOP_1 {
   int rollno;
   String name;  // here object is called  reference variable ,name is called instance variable 
   float marks;
  OOP_1(float marks,String name,int rollno){
	this.marks=marks;       // (this) key word is used to access the object
	this.name=name; 		
	this.rollno=rollno;
  }
void greeting() {
	System.out.println("my name is "+ name);
}
  void changeName(String newname) {
	  name=newname;
  }
  //wrapper class
  Integer a=10;
  
  /*
  	
	OOP_1 gomo=new OOP_1(66.5f,"moneh",26); // className object =new className(); className() is called as default constructor
	                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
    System.out.println(gomo.marks);
    System.out.println(gomo.name);
    System.out.println(gomo.rollno);
    OOP_1 mogo =new OOP_1(77.5f,"mogo",25); 
    mogo.marks=80.3f;
    mogo.name="mogo";
    mogo.rollno=25;
    	
	
	
  
   */
}
