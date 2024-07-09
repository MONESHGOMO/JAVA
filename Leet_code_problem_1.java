package GOMO_JAVA_CODES;
import java.util.Arrays;
public class Leet_code_problem_1 {

	public static void main(String[] args) {
   
		// find numbers with even number digits   given: int [] number  ={12,345,2,6,7896};
		
		/* Q. given an array number of integer ,return how many of them consists even digits */
	
	int num[]={12,345,2,6,7896};
	int count=Find_Even(num);
  System.out.println(count);
		}
	
	static int Find_Even(int num[]) {
		for(int i:num) {
			int count=0;
			if(evendigit(i)) {
				count++;
				
			}
			return count;
		}
		return 0;
	}

	static boolean evendigit(int i) {
          
		int digit=0;
		while(i>0) {
			digit++;
			i=i/10;
		}
	return digit%2==0 ;  //  in case of condition true return true ,otherwise false
	}
}
	
