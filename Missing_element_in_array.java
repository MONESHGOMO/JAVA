package GOMO_JAVA_CODES;

public class Missing_element_in_array {

	public static void main(String[] args) {

		int a[]= {1,2,3,4,6,7};
		
		
		int sum1=0;
		for (int i = 0; i<=a.length-1; i++) {
			sum1+=a[i];
			
		}
		int sum2=0;
		for (int i = 1; i<=7; i++) {
			sum2+=i;
			
		}
		System.out.println("The missing element in the array is  "+(sum2-sum1)) ;
	}

}
