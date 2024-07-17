package GOMO_JAVA_CODES;

import java.util.Arrays;

public class Swapping_in_Array {

	public static void main(String[] args) {

     int a[]= {1,2,3,4,5,6,7};
     swap(a,  0, 1);
     System.out.println(Arrays.toString(a));
}
			
      static void  swap(int a[],int index1,int index2) {
			  
		  int temp=a[index1];
	      a[index1]=a[index2];
		  a[index2]=temp;
				
				
	}
}
