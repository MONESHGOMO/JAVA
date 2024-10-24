
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
public class CurrentDate {
    public static void main(String[] args) {
//https://www.w3schools.com/java/java_date.asp
        /*
         * For LocalDate.now(), the method internally creates an instance
         *  and returns it to you, hence no need for new. It’s a cleaner and
         *  more concise way to get the current date.
         * 
         * 
         */
    LocalDateTime time_date = LocalDateTime.now();
    System.out.println(time_date);
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-mm-yyyy HH:mm");
    String formatter = time_date.format(myFormatObj);
   System.out.println("After formatting : " + formatter);


        
    }
}
