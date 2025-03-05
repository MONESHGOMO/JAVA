
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Choose your choice : ");
        System.out.println("\n 1.Add \n 2.Subtract \n 3.Multiplication");

        System.out.print("Enter your choice here : ");

        int userSelectedNumber = input.nextInt();

        int methodMapper = 0;

        if (userSelectedNumber > 0 && userSelectedNumber < 4) {
            methodMapper = userSelectedNumber;

            switch (methodMapper) {
                case 1:
                    // call add()
                    System.out.println("---------------Addition--------------");
                    System.out.println();
                    System.out.print("Enter your first value : ");
                    int valueOne = input.nextInt();
                    System.out.print("Enter your second value : ");
                    int valueTwo = input.nextInt();
                    System.out.println("The sum of the two value is : " + addition(valueOne, valueTwo));
                    break;
                case 2:

                    System.out.println("---------------Subtraction---------------");
                    System.out.println();
                    System.out.print("Enter your first value : ");
                    int userDataOne = input.nextInt();
                    System.out.print("Enter your second value : ");
                    int userDataTwo = input.nextInt();
                    System.out.println("The sum of the two value is : " + subtraction(userDataOne, userDataTwo));
                    break;
                case 3:

                    System.out.println("Multiplication");
                    System.out.println();
                    System.out.print("Enter your first value : ");

                    int userDataOneForMultiplication = input.nextInt();
                    System.out.print("Enter your second value : ");
                    int userDataTwoForMultiplication = input.nextInt();
                    System.out.println("The sum of the two value is : " + multiplication(userDataOneForMultiplication, userDataTwoForMultiplication));

                    break;

                default: {
                    System.out.println("Process completed... ");
                }

            }

        } else {
            System.err.println("In-valid Input");
        }

        input.close();

    }


    public static int addition(int valueOne, int valueTwo) {
        return valueOne + valueTwo;
    }

    public static int subtraction(int userDataOne, int userDataTwo) {
        return userDataOne - userDataTwo;
    }

    private static int multiplication(int userDataOneForMultiplication, int userDataTwoForMultiplication) {
        return userDataOneForMultiplication * userDataTwoForMultiplication;
    }

}
