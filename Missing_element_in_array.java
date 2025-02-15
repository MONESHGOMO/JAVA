package GOMO_JAVA_CODES;

public class Missing_element_in_array {

	public static void main(String[] args) {



		
		int a[]= {1,2,3,4,6,7};
		System.out.println(missingNumber(a));
		
		
		
	}

    public static int missingNumber(int[] a) {
     
	    int n=a.length;
	
	    int sumN= n * (n+1)/2;
	    int sumArray=0;
	   for(int i=0;i<n;i++){
	        sumArray+=a[i];
	   }
	
	   return sumN-sumArray;
    }


}
