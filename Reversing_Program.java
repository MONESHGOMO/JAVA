package GOMO_JAVA_CODES;

public class Reversing_Program {

	public static void main(String[] args) {
     
	rev_num(654321);
	System.out.println();	;
	rev_string("GOMO");
	
	}
	
	public static void rev_num(int number) {
	
	System.out.println("THE GIVEN NUMBER :"+number);	
	int reversed=0;
	while(number>0) {
		reversed=reversed*10+number%10;
		number/=10;
		
}
	System.out.println("THE REVERSED NUMBER :" + reversed);
	
	}
	
	public static void rev_string(String name) {
		System.out.println("THE GIVEN NAME IS "+ name);	
		String rev="";
        int len=name.length();
        for(int i=len-1;i>=0;i--) {
        	rev=rev+name.charAt(i);
        }
        System.out.println("THE REVERSED NAME IS " + rev);
	}
	

}
