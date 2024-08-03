package GOMO_JAVA_CODES;

public class Constructor {

	/*
	 * It is a block of code that initialize the newly created object, constructor name match with the class name 
	 *  Must not have the explicit return type  ,why because it is a special method 
	 *  Cannot be a static,final,abstract and synchronized
	 *  
	 * [ Types of constructor ]
	 *  🪩 Default constructor:
	 *           when we don't provide any constructor ,compiler will provide one.But we can't see with naked eyes,it will be in the class file 
	 *   and it is used to provide default value like (0,null)         
	 *  
	 *  🪩No Argument constructor :
	 *   		It will not have any arguments ,and it will allow us to write some logic when object is created ,like something including print statement 
	 * and most importantly it is not a default constructor 
	 * 
	 * 🪩 Parameterized constructor :
	 *        The constructor is said to be a parameterized constructor if the object contains a number of parameters or arguments. 
	 *        The arguments must be passed by the user explicitly. For example, If we wish to set our own values in the class's object fields, 
	 *        we should use a parameterized constructor.
	 * 
	 *  [imp] = constructor overloading 
	 *  [imp] = super key word 
	 *  
	 *         
	 *  🪩🪩🪩🪩🪩
	 *     
	 */
	

	public static void main(String[] args) {
	
		No_Argument_constructor obj = new No_Argument_constructor();
		parameterized_constructor obj1=new parameterized_constructor("gomo","homosapians");
		obj1.data();
		constructor_overloading obj2=new constructor_overloading(); // no parameterized constructor 
		constructor_overloading obj21=new constructor_overloading( "gomo"); //parameterized constructor 
		
        
	}

}
