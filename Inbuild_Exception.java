import java.util.Scanner;

public class Inbuild_Exception {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      int age=input.nextInt();
      
      try{
          if(age<0){
            throw new ArithmeticException("AGE SHOULD BVE GREATER THAN ZERO ");
          }
          else{
            System.out.println("valid range ");
          }
      }
      catch(ArithmeticException e){
        System.out.println(e.getMessage());
      }
      catch(Exception e){
        System.err.println("ERROR : " + e.getMessage());
      }
      finally{
        System.out.println("Execution Completed");
      }

      input.close();
      
    }

    
}
