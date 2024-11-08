package Abstract_class;


/*
 * 1. In Abstract class the super class is must to be override by the sub class or child class
 * 
 * 2.syntax: abstract retuen-type function_name(parameters);
 * 
 * 3. [imp] example let us considere a abstract  class called car ,but 
 *    a car contains differen type of engines for that we use (abstract method)
 * 
 * 4. here [ car is the abstract class ] and  [ types of engines are sub class of abstract class]
 * 
 * 5.[imp] we cannot able to create a object for abstract class
 * 
 * 6. no  " final " keyword in abstract class
 */
public abstract class Parent {

       int a=10;
   
       abstract  void  career(String name); // abstract method 


    
}
