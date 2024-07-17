package GOMO_JAVA_CODES;
import java.util.Scanner;
public class STATIONARY_SHOP_BILLING_PROCESS {

	public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
		System.out.println("WELCOME TO GOMO STATIONARY  SHOP");
		System.out.println();
		System.out.println("🔍ENTER 0 TO END THE BILLING PROCESS");
		System.out.println("1.UNRULED LONG NOTE \n2.RULED LONG NOTE BOOk\n3.BLUE PEN \n4.BLACK PEN\n5.NON-MECHANICAL PENCIL");
		System.out.println();
		int UNRULED_LONG_NOTE =80;
		int RULED_LONG_NOTEBOOK = 80;
		int NON_MECHANICALPENCIL=8;
		int BLUE_PEN=20;
		int BLACK_PEN=20;
		int AMOUNT=0;
		
		
		while(true) {
			System.out.println("ENTER THE PRODUCT CODE : ");
			int product_code=input.nextInt();
			if(product_code==0) {
				break;
			}
			else {
				if(product_code<=5) {
					System.out.println("ENTER THE QUANTITY OF THE PRODUCT : ");
					int quantity=input.nextInt();
					if(product_code==1) {
						AMOUNT=(UNRULED_LONG_NOTE*quantity) +AMOUNT;
					}
					else if(product_code==2) {
						AMOUNT=(RULED_LONG_NOTEBOOK*quantity) +AMOUNT;
						
					}
					else if(product_code==3) {
						AMOUNT=(NON_MECHANICALPENCIL*quantity) +AMOUNT;
						
					}
					else if(product_code==4) {
						AMOUNT=(BLUE_PEN*quantity) +AMOUNT;
						
					}
					else if(product_code==5) {
						AMOUNT=(BLACK_PEN*quantity) +AMOUNT;
						
					}
				}
			}
		}// WHILE LOOP
		System.out.println("THE AMOUNT YOU NEED TO PAY "+ AMOUNT);
		System.out.println("HAVE A GOOD DAY .....");
		
		
	}

}