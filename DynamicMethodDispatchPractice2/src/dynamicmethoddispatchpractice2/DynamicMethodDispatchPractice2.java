// Example for illutrating the concept of dynamic method dispatch
package dynamicmethoddispatchpractice2;
class Super{
    void Meth1(){
        System.out.println("Super meth 1:");
    }
    void Meth2(){
        System.out.println("Super meth 2:");
    }
}

class Sub extends Super{
    @Override
    void Meth2(){
        System.out.println("Sub meth 1:");
    }
    void Meth3(){
        System.out.println("Sub meth 3:");
    }
}
public class DynamicMethodDispatchPractice2 {

   
    public static void main(String[] args) {
        Super s1=new Sub();
        s1.Meth1();
        s1.Meth2();
//      s1.Meth3();-> This method cannot be called because Super class does not contain Meth3()
    }
    
}
