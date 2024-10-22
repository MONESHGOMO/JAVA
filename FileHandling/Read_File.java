import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read_File {

    public static void main(String[] args) {
        File myfile = new File("GOMO.txt");
        try (Scanner getData = new Scanner(myfile)) {
            
                while(getData.hasNextLine()){
                    String data=getData.nextLine();
                    System.out.println(data);
                }
            }
            
        catch (FileNotFoundException e) {
               e.printStackTrace(); 
// printStackTrace() : It includes a message that gives more context about the error.
//It shows what type of exception was thrown (e.g., NullPointerException, FileNotFoundException, etc.).
        }


    }
}
    
    










    


