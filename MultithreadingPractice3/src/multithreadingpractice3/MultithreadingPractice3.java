// Implementing multithreading by extending the  Thread class 
package multithreadingpractice3;


public class MultithreadingPractice3 extends Thread {
   public  void run(){
    int i=1;
    while(true){
        System.out.println(i+" Hello");
        i++;
    }
}
   
    public static void main(String[] args) {
       MultithreadingPractice3 m=new MultithreadingPractice3();
       m.start();
       int i=1;
       while(true){
           System.out.println(i+" world");
           i++;
       }
    }
    
}
