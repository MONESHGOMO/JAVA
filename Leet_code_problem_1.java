package GOMO_JAVA_CODES;
import java.util.Arrays;
public class Leet_code_problem_1 {

	public static void main(String[] args) {
   
		//      https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
		
	
int num[]={12,345,2,6,7896};

System.out.println(ls(num));
	}
	
	static int ls(int num[]) {
		
		int count=0;
		
		for(int i:num) {
			  if(even(i)) {
				  count++;
			  }
		}
		return count;
		
		
		
		
	}

	    static boolean even(int i) {
	    	int digit=0;
	    	while(i>0) {
	    		digit++;
	    		i=i/10;
	    		
	    	}
		return digit%2==0;
	}
	
	
}
	
