package GOMO_JAVA_CODES;

public class Diamond_pattern {

	public static void main(String[] args) {
				
		

		int n=5;
    for(int i=1;i<=5;i++) {
    	for(int k=1;k<=n-i;k++) {
  		System.out.print(" ");
    	}
    	for(int j=1;j<=i;j++) {
    		System.out.print("* ");
    	}
    	System.out.println();
    } 
    for(int i=1;i<=5;i++) {
    	for(int k=1;k<=i;k++) {
    		System.out.print(" ");
    	}
    	for(int j=5;j>i;j--) {
    		System.out.print("* ");
    	}
    	System.out.println();
    }
	
	}

}
