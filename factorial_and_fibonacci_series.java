package GOMO_JAVA_CODES;

public class factorial_and_fibonacci_series {

	public static void main(String[] args) {
		
		

		Factorial(1,5);
		System.out.println();
		
		Fibonacci(10);
		
         
	}
    static void  Factorial(int num,int range) {
    	      
    	for(int i=1;i<=range;i++) {
    		 num = num*i;
    	  
    	}
	System.out.println("FACTORIAL OF A NUMBER IS :"+ num);
    	
     }
    
   
     static void  Fibonacci(int series) {
    	 int a=0;
    	 int b=1;
    	 int sum=0;
    	 for(int j=1;j<=series;j++) {
    		 sum=a+b;
    		 System.out.print(sum+" ");
    		 a=b;
    		 b=sum;
    	
    	 }
		
	}
}
