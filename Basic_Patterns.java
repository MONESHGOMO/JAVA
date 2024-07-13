package GOMO_JAVA_CODES;

public class Basic_Patterns {

	public static void main(String[] args) {
    
		   Pattern_1();
	       System.out.println();
	       Pattern_2();
	       System.out.println();
	       Pattern_3();
	       System.out.println();
	       Pattern_4();
	       System.out.println();
	       Pattern_5();
	       System.out.println();
	       Pattern_6();
	}


		static void  Pattern_1() {
			
			for(int i=1;i<=5;i++) {
	        	for(int j=1;j<=5;j++) {
	        		System.out.print("*"); 
	        	}
	              System.out.println();
	        }
	        
		}  
		
	     static void  Pattern_2() {
			
			for(int i=1;i<=5;i++) {
	        	for(int j=1;j<=i;j++) {
	        		System.out.print("*"); 
	        	}
	              System.out.println();
	        }
	        
		}  
	    
	     static void  Pattern_3() {
	 		
	 		for(int i=1;i<=5;i++) {
	         	for(int j=5;j>=i;j--) {
	         		System.out.print("*");
	         	}
	               System.out.println();
	         }
	         
	 	}  
	     
	     static void  Pattern_4() {
	 	    


	 		for(int i=1;i<=5;i++) {
	         	for(int j=1;j<=i;j++) {
	         		System.out.print("*"); 
	         	}
	               System.out.println();
	         }
	 		for(int i=1;i<=5;i++) {
	         	for(int j=5;j>i;j--) {
	         		System.out.print("*");
	         	}
	               System.out.println();
	         }

	 		 
	     }

	    static void Pattern_5() {
	    	
	    	int k=5;
	    	for(int row=1;row<=5;row++) {
	    		for(int space=1;space<=k-row;space++) {
	    			System.out.print(" ");
	    		}
	    		
	    		for(int col=1;col<=row;col++) {
	    			System.out.print("* ");
	    		}
	    		System.out.println();
	    	}
	    	
	    }
	   		
	   	
	    	
	    static void Pattern_6() {
	    	
	    	for(int i=1;i<=5;i++) {
	    		for(int j=1;j<=5;j++) {
	    			if(i==1||i==5||j==1||j==5) {
	    				System.out.print("*");
	    			}
	    			else {
	    				System.out.print(" ");
	    			}
	    		}
	    		System.out.println();
	    	}
	    	
	    }
	    
	
}
