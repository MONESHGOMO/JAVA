import java.io.FileWriter;
import java.io.IOException;

public class Create_Write {
    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("GOMO.txt");
            writer.write("Hello my self monesh iam from kirumampakkam ");
            writer.close();
            
            System.out.println("Data written to the file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }   
        
    
        



    }
    
}
