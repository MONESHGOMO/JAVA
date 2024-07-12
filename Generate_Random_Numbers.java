package GOMO_JAVA_CODES;

import java.util.Random;

public class Generate_Random_Numbers {

	public static void main(String[] args) {
   
		// use case of random class in (OneTimePassword) verifications... 
		
		Random obj=new Random();
		int random=obj.nextInt(24586); // here 10 indicate that ,they use to give random number below the range of 10
		
		System.out.println(random);
		
		
		
	}

}
