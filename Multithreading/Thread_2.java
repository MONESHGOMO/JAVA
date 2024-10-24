package Multithreading;

public class Thread_2 extends Thread{
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println("thread 2" + i*2);

        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(e);
            
        }

    }
}
