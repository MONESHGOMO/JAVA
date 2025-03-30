import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
   

public class Main {  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner str = new Scanner(System.in);

       

        List<Employee> c = new ArrayList<Employee>();
        int age;
        String name;
        int id;

        int choice;
        do {
            System.out.println("1. Insert");
            System.out.println("2. Read");
            System.out.println("3. Get Specific Employee");
            System.out.println("4. Update");
            System.out.println("5. Delete");
            System.out.println("6. To Terminate ");
            System.out.print("Choose an operation:");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter your ID: ");
                    id = input.nextInt();
                    System.out.print("Enter your name: ");
                    name = str.nextLine();
                    System.out.print("Enter your age: ");
                    age = input.nextInt();
                    c.add(new Employee(name, age, id));
                    System.out.println("Employee added successfully.");
                    break;

                case 2:
                    System.out.println("================================================================================");
                    Iterator<Employee> i = c.iterator();
                    while (i.hasNext()) {
                        Employee e = i.next();
                        System.out.println(e);
                    }
                    System.out.println("================================================================================");
                    break;

                case 3:
                    boolean found = false;
                    System.out.println("================================================================================");
                    System.out.print("Enter employee ID: ");
                    int empno = input.nextInt();
                    i = c.iterator();
                    while (i.hasNext()) {
                        Employee e = i.next();
                        if (e.getEmpId() == empno) {
                            System.out.println(e);
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Data not found.");
                    }
                    System.out.println("================================================================================");
                    break;

                case 4:
                    found = false;
                    System.out.print("Enter employee ID to update: ");
                    empno = input.nextInt();
                    System.out.println("================================================================================");
                    ListIterator<Employee> li = c.listIterator();
                    while (li.hasNext()) {
                        Employee e = li.next();
                        if (e.getEmpId() == empno) {
                            System.out.print("Enter the new name: ");
                            String new_name = str.nextLine();
                            System.out.print("Enter the new age: ");
                            int new_age = input.nextInt();
                            li.set(new Employee(new_name, new_age, empno));
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Data not found.");
                    } else {
                        System.out.println("Data updated successfully.");
                    }
                    System.out.println("================================================================================");
                    break;

                case 5:
                    found = false;
                    System.out.println("================================================================================");
                    System.out.print("Enter employee ID to delete: ");
                    empno = input.nextInt();
                    i = c.iterator();
                    while (i.hasNext()) {
                        Employee e = i.next();
                        if (e.getEmpId() == empno) {
                            i.remove();
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Data not found.");
                    } else {
                        System.out.println("Employee deleted successfully.");
                    }
                    System.out.println("================================================================================");
                    break;

                default:
                    System.out.println("Process Terminated...");
                    break;
            }
        } while (choice != 0 && choice <= 5);

        input.close();
        str.close();
    }
}
