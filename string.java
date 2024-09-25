/* [imp] mostly used class in java
1) string literals , String name="Gomo" ;
2)String internal work : when we create a same object with using two different variables
    the String implement the string pooling (separate the memory in the heap)  why" ?
     ans : String is immutable

3)string comparison:


       1. ==() if the reference variable pointing to the same objects which returns
          true ,otherwise false ,eg: baby,son example
       2.string a=new string("gomo"); AND string b=new string("mogo");
         in the above example the ==() returns false when we use (a==b) why"?
         ans: the reference variable are pointing to the different objects
        3. when we need to check only the value in string let us use [ .equals() ]


 */




public class string {
    public static void main(String[] args) {

        String name="gomo";
        String a = name;
        String b = name;
        System.out.println(a == b);

       /*
       1. ==() if the reference variable pointing to the same objects which returns
          true ,otherwise false ,eg: baby,son example
       2.string a=new string("gomo"); AND string b=new string("mogo");
         in the above example the ==() returns false when we use (a==b) why"?
         ans: the reference variable are pointing to the different objects
        3. when we need to check only the value in string let us use [ .equals() ]

        */


    }
}
