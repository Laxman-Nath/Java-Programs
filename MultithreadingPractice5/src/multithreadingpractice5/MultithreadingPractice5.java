// Thread class methods(Constructors) in java
package multithreadingpractice5;
class MyRun implements Runnable{
    public void run(){}
}

public class MultithreadingPractice5 {

   
    public static void main(String[] args) {
       Thread t1=new Thread();// Non-parameterized constructor of thread class
       Thread t2=new Thread("Myname");// Parameterized constructor of thread class
       Thread t3=new Thread(new MyRun());//Parameterized constructor of thread class
       Thread t4=new Thread(new MyRun(),"Myname");// Parameterized constructor of thread class
       
    }
    
}
