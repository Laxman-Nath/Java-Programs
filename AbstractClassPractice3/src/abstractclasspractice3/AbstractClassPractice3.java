// Another example for Abstract class
package abstractclasspractice3;
abstract class KFC{
    KFC(){
        System.out.println("This is KFC constructor:");
    }
    void makeItem(){
        System.out.println("Making items....");
    }
    abstract void billing();
    abstract void offer();
        
}

class MyKFC extends KFC{
    MyKFC(){
        System.out.println("This is myKFC constructor:");
    }   
    void billing(){
        System.out.println("This is billing:");
    }
    void offer(){
        System.out.println("Offer offer offer....");
    }
}

public class AbstractClassPractice3 {
   public static void main(String[] args) {
       KFC k=new MyKFC();
       k.makeItem();
       k.billing();
       k.offer();
        
    }
    
}
