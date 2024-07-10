package GOMO_JAVA_CODES;

public class Number_of_digits_in_a_number {

	public static void main(String[] args) {

		
		int number=234567;
		int count=0;
		while(number>0) {
			count+=1;
			number/=10;
		}
		System.out.println(count);
		
	}

}
