// Thread class methods in java
package multithreadingpractice12;
class MyThread extends Thread{
    public void run(){
        int count=1;
        while(true){
            System.out.println(count++ +" MyThread");
        }
    }
}
public class MultithreadingPractice12 {


    public static void main(String[] args) {
        MyThread t1=new MyThread();
        t1.start();
        
        int count=1;
        while(true){
            System.out.println(count++ +" main");
            Thread.yield();// yield wil allow other thread for execution means Thread t1
            // will be executed more number of times than main since main is set to yield
        }
    }
    
}
