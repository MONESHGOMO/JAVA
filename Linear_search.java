package GOMO_JAVA_CODES;

public class Linear_search {

	public static void main(String[] args) {

		int[] a= {1,12,3423,43,3,212,322,122,12};
		System.out.println(ls(a, 43)); // calling method ,we use to pass the  array of a  and target(43) element in the print statement 
		  
		/*🪩 The best time  complexity o(1) does not depend on the length of the array  
		  🪩 The worst time complexity o(n) depends on the length of the array  ,n denotes size of the array 
		  🪩 In this program 1 is the best complexity and 12 is the worst complexity 
		*/
	}
	static int   ls(int a[], int target) {  // ls (linear search)
		                                                 
		for(int i=0;i<a.length;i++) {
			// if value found in the array ,which use to  return the index value of the target element
			if(a[i]==target) {
				return i;
			}
		}
		// if value not found in the array,which use to return the (-1)
		return -1 ;   
		
		
		
}
}
