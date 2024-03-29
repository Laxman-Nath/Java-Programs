// Thread class in java
package multithreadingpractice9;
class MyThread extends Thread{
    public MyThread (String name){
        super(name);
    }
    public void run() {
        int count=1;
        while(true){
            System.out.println(count++);
            try{
            Thread.sleep(1000); // Thread is sleeeping 
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}


public class MultithreadingPractice9 {


    public static void main(String[] args) {
        MyThread t=new MyThread("Thread1");
        t.start();
        t.interrupt();// Interrupting thread t
    }
    
}
