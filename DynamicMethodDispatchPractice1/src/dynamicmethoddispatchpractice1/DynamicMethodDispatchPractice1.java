
// Illustrating the use of method overriding in java
package dynamicmethoddispatchpractice1;
class Super{
    void display(){
        System.out.println("Hello from super class:");
    }
}
class Sub extends Super{
    @Override
    void display(){
        System.out.println("Hello welcome from sub class:");
    }
}
public class DynamicMethodDispatchPractice1 {

    
    public static void main(String[] args) {
        Super su=new Sub();
        // Dynamic method dispatch means refernce of super class holding objects of sub class
        su.display();
       
        
    }
    
}

