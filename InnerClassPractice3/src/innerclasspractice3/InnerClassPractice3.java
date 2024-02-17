// Illustrating the anonymous inner class in java
package innerclasspractice3;

abstract class My{
    abstract void display();
}
 
class Outer{
    void meth1(){
//        new My(){  void display(){System.out.println("Hello from display");}}.display();
     My m=new My(){ // Class is defined at the time of object creation
        public void display(){
            System.out.println("Hello from display");
        }
     };
      m.display();
    }
}
public class InnerClassPractice3 {

    
    public static void main(String[] args) {
        Outer o=new Outer();
        o.meth1();
    }
    
}
