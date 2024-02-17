// Thread class methods in java
package multithreadingpractice11;
class MyThread extends Thread{
    public void run(){
    int count=1;
    while(true){
        System.out.println(count++);
    }
    }
    
}
public class MultithreadingPractice11 {

   
    public static void main(String[] args) throws Exception {
       MyThread t1=new MyThread ();
       Thread  MainThread=Thread.currentThread();
       t1.setDaemon(true);// it thread is set to daemon,it will finish along with main
//       method
        t1.start();
        MainThread.join();// Now main method wil join Thread t1 means Main method
//        will wait for thread t1 to finish
    }
    
}
