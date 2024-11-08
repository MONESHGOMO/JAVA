interface A{
    void display();
}

public class Using_LamdaExpression {
 public static void main(String[] args) {
    

     A obj = ()-> // lamda expression 
     {
        System.out.println(" interface method ");
     };

     obj.display();


 }
  }