import java.util.Scanner;
import java.util.Arrays;
public class Q_1 {
    public static void main(String[] args) {
  //get the 5 number from  the user using array & for loop
     Scanner input=new Scanner(System.in);

     int a[]=new int [5];


     for(int i=0;i<5;i++){
        System.out.println("enter the value for "+ i +" " +  "index : " );
        a[i]= input.nextInt();
       }

     System.out.println(Arrays.toString(a));
     
     input.close();
        
    }

}
