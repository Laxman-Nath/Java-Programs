// Implementing synchronization using monitors in java
package synchronizationpractice1;
class MyData{
   synchronized public void display(String str){
//       synchronized(this){
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
            try{Thread.sleep(1000);} catch(Exception e){}
//    }
       }
}
}
class MyThread1 extends Thread{
    MyData d1;
    MyThread1(MyData d){
        d1=d;
    }
    public void run(){
       d1.display("Hello world");
    }
}

class MyThread2 extends Thread{
    MyData d2;
    MyThread2(MyData d){
        d2=d;
    }
    public void run(){
       d2.display("welcome");
    }
}



public class SynchronizationPractice1 {

    
    public static void main(String[] args) {
        MyData d=new MyData();
        MyThread1 m1=new MyThread1(d);
        MyThread2 m2=new MyThread2(d);
        m1.start();
        m2.start();
    }
    
}
