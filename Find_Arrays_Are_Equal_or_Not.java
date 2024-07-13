package GOMO_JAVA_CODES;

import java.util.Arrays;

public class Find_Arrays_Are_Equal_or_Not {

	public static void main(String[] args) {

		/* In this code i(myself) used to integrate  two ways to find the arrays are equal or not ,one is line number 18(using In-build function)
	        and the next approach is using  own function to find    */
	

		
		int a[]= {1,2,3,4,6};
		int b[]= {1,2,3,4,5,6};
		
		System.out.println(Approach_1(a, b));
	}	
		
	
    public  static String Approach_1(int a[],int b[]) {
        	 boolean condition =Arrays.equals(a,b);
     		int count=0;
        	 if(condition==true) {
        		 for(int i=0;i<=a.length-1;i++) {
        			 if(a[i]==b[i]) {
        				 count++;  
        			 }
        		 }
        		 if(count==a.length) {
        			 return "THE ARRAYS ARE EQUAL";
        		 }
        	 }
			return "The arrays are not equal";
	}

}
