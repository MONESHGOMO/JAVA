package INTERFACE;


/*
 * 1.interface are contain abstract( ) 
 * 2.we cannot able to create obj ,variable are final & static  
 * 3. "implements" keyword 
 */
public class Main {
    public static void main(String[] args) {
        
    
    car obj = new car();

    System.out.println("HTE VARIENT........ ");
    obj.HTE(1300000,"classic white ");
    obj.HTE_ENGINE(4,2000,15);
    System.out.println();


        //HTK
        System.out.println("HTK VARIENT...... ");

        obj.HTK(1400000,"dark king ");
        obj.HTK_ENGINE(4,2500,15);
        System.out.println();


        //HTX
        System.out.println("HTX VARIENT ......");


        obj.HTX(1600000,"imperial blue ");
        obj.HTX_ENGINE(4,2500,13);
        System.out.println();



        //GT

        System.out.println("GT LINE  VARIENT....... ");
        obj.GT(1900000,"mat graphite  ");
        obj.GT_ENGINE(4,3000,10);
    } 
}
