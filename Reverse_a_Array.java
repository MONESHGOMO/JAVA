package GOMO_JAVA_CODES;
import java.util.Arrays;
public class Reverse_a_Array {

	public static void main(String[] args) {

	
	int []a= {1,2,3,4,5,6,7,8,9,10};
	rev(a);
    System.out.println(Arrays.toString(a));	
	
	}

      static void rev(int[] a) {
    	  int start=0;
    	  int end=a.length-1;
    	  while(start<end) {
    		 swap(a, start, end);
    		 start++;
    		 end--;
    	  }
		
	}
      static void  swap(int a[],int index1,int index2) {
		  
		  int temp=a[index1];
	      a[index1]=a[index2];
		  a[index2]=temp;
				
				
	}
	

}
