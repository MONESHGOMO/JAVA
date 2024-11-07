
/*
 * get the input  from the user on array
 * get the input for each element in an array 
 * find and print middle element  in an array 
 */

import java.util.Arrays;
import java.util.Scanner;
public class Q_4 {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
      
     int a[]= new int [7];
     
     for(int i=0;i<a.length-1;i++){
        System.out.print("ENTER THE VALUE FOR "+" "  + i + " " + "INDEX : " );
        a[i]=input.nextInt();
     }

     System.out.println(Arrays.toString(a));

     int start=0;
     int end=a.length-1;
     int mid=start+end /2;
     System.out.println("the mid element in the  array is : " + " " + a[mid]);



     input.close();
    
    }
    
}
