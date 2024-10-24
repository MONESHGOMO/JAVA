package Multithreading;

public class Main  {


    public static void main(String[] args) {
        
        Thread_1 t1 = new Thread_1();
        Thread_2 t2= new Thread_2();
        t1.start();
        t2.start();
      
    }
}
