package INTERFACE;

public class car implements engine,varients { 

    
    public void HTE(int cost,String colour) {


        System.out.println("the base varient ex showroom price is "+ cost + " colour available  currently  is "  + colour);
       
    }
    
    
   
    public void HTK(int cost,String colour) {
        System.out.println("the 2nd  varient ex showroom price is "+ cost + " colour available  currently is  "  + colour);

       
    }

    
    public void HTX(int cost,String colour) {
        System.out.println("the mid varient ex showroom price is "+ cost + " colour available  currently  is  "  + colour);

        
    }

   
    public void GT(int cost,String colour) {
        System.out.println("the top-end varient ex showroom price is "+ cost + " colour available  currently  is "  + colour);

        
    }




    public void HTE_ENGINE(int cyclinder,int HP,double milage) {
        System.out.println("THE HTE ENGINE HAS A SPECIFICATION OF " + cyclinder+ " cyclinder with the HP of " + HP+" milage below " + milage  );
        
    }



    public void HTK_ENGINE(int cyclinder,int HP,double milage) {
        System.out.println("THE HTK ENGINE HAS A SPECIFICATION OF " + cyclinder+ " cyclinder with the HP of " + HP+" milage below " + milage  );

       
    }



   
    public void HTX_ENGINE(int cyclinder,int HP,double milage) {
        System.out.println("THE HTX ENGINE HAS A SPECIFICATION OF " + cyclinder+ " cyclinder with the HP of " + HP+" milage below " + milage  );

     
    }



   
    public void GT_ENGINE(int cyclinder,int HP,double milage) {
        System.out.println("THE GT LINE  ENGINE HAS A SPECIFICATION OF " + cyclinder+ " cyclinder with the HP of " + HP+" milage below " + milage  );

     
    }

    
}
