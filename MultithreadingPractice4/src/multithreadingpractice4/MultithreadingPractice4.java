// Implementing multithreading by implementing Runnable interface
package multithreadingpractice4;


public class MultithreadingPractice4 implements Runnable {
    public void run(){
        int i=1;
        while(true){
            System.out.println(i+" Hello");
            i++;
        }
    }
    public static void main(String[] args) {
        MultithreadingPractice4 m=new MultithreadingPractice4();
        Thread t=new Thread(m);
        t.start();
        int i=1;
        while(true){
            System.out.println(i+" world");
            i++;
        }
    }
    
}
