
package synchronizationpractice2;
class ATM{
    public synchronized void checkBalance(String name){
        System.out.print(name+" checking ");
//        try{Thread.sleep(1000);}catch(Exception e){}
        System.out.println("Balance");
    }
    public synchronized void withDraw(int amount,String name){
        System.out.print(name+" Withdrawing ");
//        try{Thread.sleep(1000);}catch(Exception e){}
        System.out.println(amount);
    }
    }
 class customer extends Thread{
     String name;
     int amount;
     ATM atm;
     customer(String n,ATM a,int amt){
         name=n;
         atm=a;
         amount=amt;
     }
     public void useatm(){
         atm.checkBalance(name);
         atm.withDraw(amount,name);
     }
     public void run(){
         useatm();
     }
 }
public class SynchronizationPractice2 {

    
    public static void main(String[] args) {
       ATM atm=new ATM();
      customer c1=new customer("Laxman",atm,1000);
      customer c2=new customer("Manoj",atm,2000);
      customer c3=new customer("Harish",atm,3000);
      c1.start();
      c2.start();
      c3.start();
    }
    
}
