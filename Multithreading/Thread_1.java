package Multithreading;

public class Thread_1 extends Thread {
  public void run(){
  for(int i=0;i<=5;i++){
    System.out.println("thread " + i);
    }

try {     
    Thread.sleep(5000);

}
catch (InterruptedException e){
    System.out.println(e);

}

  }
}
