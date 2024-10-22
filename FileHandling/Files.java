import java.io.File;
//The File class from the java.io package, allows us to work with files.
//To use the File class, create an object of the cthrowslass, and specify the filename or directory name:
import java.io.IOException;

class Files{
    public static void main(String[] args)   {
        
        File myfile = new File("GOMO.txt");
      /*    System.out.println(myfile.canRead());
        System.out.println(myfile.canWrite());
        System.out.println(myfile.getName());
        try{  
        
        if(myfile.createNewFile()){
                System.out.println("new file is creatred ");
        }
         else{
            System.out.println("file is already exits ");
         }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        
        
        
        System.out.println(myfile.getAbsolutePath());

        System.out.println(myfile.exists());
        System.out.println(myfile.length());
        System.out.println(myfile.mkdir());

       */

       System.out.println(myfile.delete());
       
       try {
        if (myfile.createNewFile()) {
            System.out.println("New file is created: " + myfile.getName());
        } else {
            System.out.println("File already exists.");
        }
    } catch (IOException e) {
        System.out.println("An error occurred: " + e.getMessage());
    }
        
    }
}