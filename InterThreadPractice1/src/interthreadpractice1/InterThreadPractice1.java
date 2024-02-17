// Illustrating the concept of interthread communication in java
package interthreadpractice1;
class MyData{
    int value=0;
    boolean flag=true;
    synchronized void set(int r){
        while(flag!=true){
           try{ wait();} catch(Exception e){}
            }
        value=r;
        flag=false;
        notify();
    }
    synchronized int get(){
        int x=0;
        while(flag!=false){
            try{wait();}catch(Exception e){}
        }
         x=value;
        flag=true;
        notify();
        return x;
    }
    }
class Producer extends Thread{
    MyData data;
   
    Producer(MyData d){
        data=d;
    }
    public void run(){
         int i=1;
        while(true){
                
            data.set(i);
            System.out.println("Produced value:"+i);
            i++;
        }
    }
}

class Consumer extends Thread{
    MyData data;
    Consumer(MyData d){
        data=d;
    }
    public void run(){
        while(true){
            System.out.println("Consumed value:"+data.get());
        }
    }
}

public class InterThreadPractice1 {


    public static void main(String[] args) {
       MyData d=new MyData();
       Producer p=new Producer(d);
       Consumer c=new Consumer(d);
       p.start();
       c.start();
    }
    
}
