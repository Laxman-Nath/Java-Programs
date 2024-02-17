// Program for illustrating the concept of Abstract class
package abstractclasspractice1;
abstract class Super{
    Super(){
        System.out.println("Super constructor:");
    }
    void meth1(){
        System.out.println("Super meth1:");
    }
   abstract void meth2();
}

//note: if any class extends abstract class then it also became abstract and it should be declare abstract.

//For making it concrete we define abstract method of super class in sub class
  class Sub extends Super{
    void meth2(){
        System.out.println("Sub meth2:");
    }
     void meth3(){
         System.out.println("Sub meth3:");
     }
    
}
public class AbstractClassPractice1 {

   
    public static void main(String[] args) {
//        Super s=new Super(); // Abstract class's object cannot be created only its reference can be created
          Sub s=new Sub();
          s.meth2();
          s.meth3();
          s.meth1();
    }
    
}
