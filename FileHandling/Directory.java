import java.io.File;
public class Directory {
    public static void main(String[] args) {
     
        File directory = new File("newdirectory");


        if (directory.mkdirs()) {
            System.out.println("Directory created successfully: " + directory.getName());
        } else {
            System.out.println("Directory already exists or could not be created.");
        }


        
    }
    
}
