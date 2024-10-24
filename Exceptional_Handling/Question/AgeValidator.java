package Question;

public class AgeValidator  {
   
    void checkage(int age){

    try {  
        if(age <0  || age >150){
            throw new ArithmeticException("age not in range ");
        }
        else{
            System.out.println("valid range ");
        }
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
    

}

}
