import java.sql.Connection; // to make a connection between java application and DB
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;  // to write SQL queries
import java.util.Scanner;
import java.util.Arrays;

public class JDBC {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String url = "jdbc:mysql://localhost:3306/sys";
        String user = "root";
        String password = "yourDataBasePassword";

        Connection connection = null;
        Statement stmt = null;

        try {

            connection = DriverManager.getConnection(url, user, password);

            if (connection != null) {
                System.out.println("Connected to the database!");


                stmt = connection.createStatement();

                System.out.println("enter your name :");

                String name=input.next();
                System.out.println("enter your tech stack : ");
                String tech =input.next();
                System.out.println("enter your domain : ");
                String domain=input.next();
                System.out.println("year of experience : ");
                String experience=input.next();
                String[] data = {name,tech,domain,experience};
                System.out.println(Arrays.toString(data));



                String sql = "INSERT INTO STUDENT (name, tech, domain, experience) VALUES ('" + name + "','"+ tech +"','" + domain + "','" + experience +"'   )";


                int rowsAffected = stmt.executeUpdate(sql);
                System.out.println("Inserted " + rowsAffected + " row(s) into the STUDENT table.");
            }

        }

        catch (SQLException e) {
            System.out.println("Error connecting to the database: " + e.getMessage());
        }

        finally {

            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (connection != null) {
                    connection.close();
                    System.out.println("Connection closed.");
                }
            }

            catch (SQLException e) {
                System.out.println("Error closing the connection: " + e.getMessage());
            }
        }
    }
}
