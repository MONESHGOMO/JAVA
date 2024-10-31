import java.util.Scanner;
import java.time.LocalDateTime;



public class Function {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LocalDateTime time = LocalDateTime.now();
          
        
        int pin = 1234;
        int balance = 1000;
        int addAmount =0;
        int takeAmount;
        String name;

        System.out.print("Enter your pin: ");
        int  userPassword= input.nextInt();
        if (userPassword == pin) {
            input.nextLine();
            System.out.print("Enter your name: ");
            name = input.nextLine();
            System.out.println("=======================================================================");
            System.out.println("Welcome " + name);
            System.out.println("=======================================================================");


            while (true) {

                System.out.println("1. Check balance");
                System.out.println("2. Add amount");
                System.out.println("3. Take amount");
                System.out.println("4. Get receipt");
                System.out.println("5. Exit");
                System.out.print("ENTER YOUR CHOICE : ");
                int choice = input.nextInt();
                
    

                switch (choice) {
                    case 1:
                    
                        System.out.println("=======================================================================");
                        System.out.println("Current balance: " + balance);
                        System.out.println("=======================================================================");

                        break;
                    case 2:
                    
                        System.out.println("=======================================================================");
                        System.out.print("Enter the amount to deposit: ");
                        int deposit = input.nextInt();
                        addAmount += deposit;
                        balance += addAmount;
                        System.out.println("Deposited: " + deposit);
                        System.out.println("=======================================================================");

                        break;
                    case 3:
                    
                        System.out.println("=======================================================================");
                        System.out.print("Enter the amount to retrieve: ");
                        takeAmount = input.nextInt();
                        if (takeAmount > balance) {
                            System.out.println("You can't take this much money. Your current balance is: " + balance);
                        } else {
                            balance -= takeAmount;
                            System.out.println("Retrieved: " + takeAmount);
                        }
                        System.out.println("=======================================================================");

                        break;
                    case 4:
                    
                        System.out.println("=======================================================================");
                        System.out.println("Here is your receipt:");
                        System.out.println("Balance: " + balance);
                        System.out.println("Date and Time: " + time);
                        System.out.println("=======================================================================");

                        break;
                    case 5:
                    
                        System.out.println("=======================================================================");
                        System.out.println("Exiting...");
                        input.close();
                        System.out.println("=======================================================================");
                        return;

                    default:
                    
                        System.out.println("=======================================================================");
                        System.out.println("Invalid choice.");
                        System.out.println("=======================================================================");

                }
            }
        }
        input.close();
    }
}
