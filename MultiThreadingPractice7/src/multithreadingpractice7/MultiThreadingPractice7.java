// Thread class Methods in java
package multithreadingpractice7;
class MyThread extends Thread{
    public MyThread(String name){
        super(name);
         setPriority(Thread.MIN_PRIORITY);// Setting the priority
//         t1.setPriority(Thread.MAX_PRIORITY);
//          t1.setPriority(Thread.NORM_PRIORITY);
    }
}

public class MultiThreadingPractice7 {

    public static void main(String[] args) {
        MyThread t1=new MyThread("Thread1");
//        t1.setPriority(Thread.MIN_PRIORITY);// Setting the priority
//         t1.setPriority(Thread.MAX_PRIORITY);
//          t1.setPriority(Thread.NORM_PRIORITY); // By default
        System.out.println("Id of thread:"+t1.getId());
        System.out.println("Name of thread:"+t1.getName());
        System.out.println("Priority of thread:"+t1.getPriority());
    }
    
}
