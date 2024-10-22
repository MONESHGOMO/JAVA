import java.io.File;
public class Delete_File {


    public static void main(String[] args) {
   
        File myfile = new File("GOMO.txt");

        if(myfile.delete()){
            System.out.println("Deleted File : " + myfile.getName());
        }
        else{
            System.out.println("File not deleted ");
        }
        
    }



    
}
