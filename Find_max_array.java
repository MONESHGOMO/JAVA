package GOMO_JAVA_CODES;

public class Find_max_array {

	public static void main(String[] args) {
		   int [] a= {1,2,3,4,5};
	   System.out.println(Max(a,1,3));            // Max: use to find the maximum element in the array
	   System.out.println(Max_usingRange(a,1,3)); // Max_usingRangr: find the maximum element in between the initializing range
		
	}
	
	static 	String  Max(int a[],int start,int end) {
		
		   int max=a[0];
		   for(int i=0;i<=a.length-1;i++) {
			   if(max<a[i]) {
				   max=a[i];
				   
			   }
		   }
		return "THE MAX NUM IN THE ARRAY IS: " + max;
		
	}
	
	

static 	String  Max_usingRange(int a[],int start,int end) {
	
	   int max=a[0];
	   for(int i=start;i<=end;i++) {
		   if(max<a[i]) {
			   max=a[i];
			   
		   }
	   }
	return "THE MAX NUM IN THE  RANGE OF ARRAY IS: " + max;
	
}
}	
	

