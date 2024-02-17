// Illustrating final methods in java
package finalpractice2;
class Super{
    final void meth1(){// Final method cannot be overrided
        System.out.println("Helllo:");
    }
}
class Sub extends Super{
    void meth2(){
        System.out.println("Hi!");
    }
        }
public class FinalPractice2 {

    
    public static void main(String[] args) {
       Sub s=new Sub();
       s.meth1();
       s.meth2();
    }
    
}
