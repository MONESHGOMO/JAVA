package GOMO_JAVA_CODES;

public class find_the_largest_num_using_turnary_operator {

	public static void main(String[] args) {

		
		int a=10;
		int b=20;
		int c=30;
		
		int largest1 = a>b?a:b;
		int largest2=c>largest1?c:largest1; //this line find the largest of c & largest 1
		
		System.out.println(largest2);
	}

}
