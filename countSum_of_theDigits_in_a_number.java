package GOMO_JAVA_CODES;

public class countSum_of_theDigits_in_a_number {

	public static void main(String[] args) {

		
		
		int number=12345,sum=0;
		
	   while(number>0) {
		   
		   sum=sum+number%10;
		   number/=10;
	   }
	   System.out.println(sum);
	}

}
