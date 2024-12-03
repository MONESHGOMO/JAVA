import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.Arrays;

public class JDBC {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String url = "jdbc:mysql://localhost:3306/sys";
        String user = "root";
        String password = "yourDataBasePassword";

        Connection connection = null;
        PreparedStatement pstmt = null;

        try {

            connection = DriverManager.getConnection(url, user, password);

            if (connection != null) {
                System.out.println("Connected to the database!");

                System.out.println("Enter your name:");
                String name = input.next();
                System.out.println("Enter your tech stack:");
                String tech = input.next();
                System.out.println("Enter your domain:");
                String domain = input.next();
                System.out.println("Year of experience:");
                String experience = input.next();

                String[] data = {name, tech, domain, experience};
                System.out.println(Arrays.toString(data));

                String sql = "INSERT INTO STUDENT (name, tech, domain, experience) VALUES (?, ?, ?, ?)";
                pstmt = connection.prepareStatement(sql);

                // Setting the values for placeholders
                pstmt.setString(1, name);
                pstmt.setString(2, tech);
                pstmt.setString(3, domain);
                pstmt.setString(4, experience);

                int rowsAffected = pstmt.executeUpdate();
                System.out.println("Inserted " + rowsAffected + " row(s) into the STUDENT table.");
            }

        } catch (SQLException e) {
            System.out.println("Error connecting to the database: " + e.getMessage());
        } finally {

            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (connection != null) {
                    connection.close();
                    System.out.println("Connection closed.");
                }
            } catch (SQLException e) {
                System.out.println("Error closing the connection: " + e.getMessage());
            }
        }
    }
}
