// Thread class methods in java
package multithreadingpractice10;
class MyThread extends Thread {
    public void run(){
        int count=1;
        while(true){
            System.out.println(count++);
        }
    }
}
public class MultithreadingPractice10 {

    
    public static void main(String[] args) {
       MyThread t1=new MyThread();
       // By default the main method is waiting for thread t1 to finish but if we set
       // thread t1 to daemon it will finishes with main method
       t1.setDaemon(true);
       t1.start();
       try{
       Thread.sleep(100);}// Main method is sleeping for 100 milliseconds
       catch(Exception e){
           System.out.println(e);
       }
    }
    
}
