public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 1;

        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
           System.out.println("Error: Cannot divide by zero.");
        }
        catch( Exception e){
            System.out.println(e.getLocalizedMessage());
        }

    }
}
