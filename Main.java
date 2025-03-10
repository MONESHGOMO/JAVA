public class Main {
    public static void main(String[] args) {
        /*
         * if we replace teh public with private we get the error
         * why we need to have the public why because : teh JVM need to call from the
         * outside of the class
         * 
         * Arrays and argument : command line argument
         * 
         * but why we need command line argument ?
         * Ans: collection of strings
         * output : PS C:\Users\ASUS\OneDrive\Documents\Desktop\java\GOMO\src\String
         * Builders> java Main 324 342
         * Gomo
         * 324 (here 324 is printed by the cmd line argument)
         */

        System.out.println("Gomo");

        System.out.println(args[0]);

        // Automatic type promotion in expression

        int a = 257;
        byte b = (byte) a; // output : 1 ( 257 % 256 (byte max))
  
        // unicode we an able to use other language (tamil,hindi,chinese)

        // type promotion rules : 
    }
}
