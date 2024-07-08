package GOMO_JAVA_CODES;

public class Linear_search_String {

	public static void main(String[] args) {

		System.out.println(lss2("gomo",'m'));
		
	}
	static boolean lss(String name,char target) {
		
		if(name.length()==0) {
			return false ;
		}
		
		for(int i=0;i<name.length();i++) {
			if(target==name.charAt(i)) {
				return true;
			}
		}
		return false;  
	        
		}	


		static boolean lss2(String name,char target) {
			
			if(name.length()==0) {
				return false ;
			}
			
			
			// for each loop
			
			for(char i:name.toCharArray()){
				
				if(i==target) {
					return true;
				}
			}
			return false;
		}

}
